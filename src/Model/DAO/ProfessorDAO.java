package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Professor;
import Tratamento_Exception.ProfessorInvalidoException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProfessorDAO {
    
    public int procura_professor(int id_user) throws ProfessorInvalidoException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT p.Prof_ID FROM Professor p "
                    + "INNER JOIN Usuario u ON p.Prof_ID = u.ID_Prof"
                    + " WHERE u.ID_Prof ="+id_user+";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
   
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new ProfessorInvalidoException();
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return -1;       
    }            
   
    public boolean create( Professor p, String login){
        
        String sql;

        UsuarioDAO udao = new UsuarioDAO();
        ProfessorDAO pdao = new ProfessorDAO();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {

            if(udao.create(p)){
               
                int user_id = udao.procura_usuario(p.getLogin());
                int user_inser = udao.procura_usuario(login);
                
                sql = "INSERT INTO PROFESSOR (Prof_CPF,Prof_RG,Prof_Email,Prof_Graduacao,ID_User,DT_Inser,HR_Inser,User_Inser,Status)"
                       + " VALUES('"+p.getCPF()+"','"+p.getRG()+"','"+p.getEmail()+"','"+p.getGraduacao()+"','"+user_id+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
                stmt = con.prepareStatement(sql);
                stmt.execute(sql);

               int prof_id = pdao.procura_professor(user_id);
               
               return udao.update_user(prof_id, user_id);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UsuarioInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } 
        catch (ProfessorInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    return false;
    }
}
