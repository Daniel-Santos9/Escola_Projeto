package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Professor;
import Model.bean.Usuario;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProfessorDAO {
    
    public int procura_professor(Professor p) throws{
        

             sql = "SELECT Prof_ID from PROFESSOR WHERE Prof_CPF ='"+p.getCPF()+"' ;";
             stmt = con.prepareStatement(sql);
             rs = stmt.executeQuery(sql);
             rs.first();
             int prof_id = rs.getInt(1);
    }
   
    public boolean create( Professor p, String login){
        
        boolean cadas;
        String sql;
        UsuarioDAO udao = new UsuarioDAO();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           cadas = udao.create(p);

            if(cadas == true){
               
             int user_id = udao.procura_usuario(p.getLogin());
             int user_inser = udao.procura_usuario(login);           

             sql = "INSERT INTO PROFESSOR (Prof_CPF,Prof_RG,Prof_Email,Prof_Graduacao,ID_User,DT_Inser,HR_Inser,User_Inser,Status)"
                     + " VALUES('"+p.getCPF()+"','"+p.getRG()+"','"+p.getEmail()+"','"+p.getGraduacao()+"','"+user_id+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
             stmt = con.prepareStatement(sql);
             stmt.execute(sql);

             // 5ª ATUALIZA O ÚLTIMO USUÁRIO PARA QUE ELE RECEBA O ID DO ULTIMO PROFESSOR CRIADO
             sql = "UPDATE USUARIO SET ID_Prof = "+prof_id+" WHERE User_ID = "+user_id+" ;";
             stmt = con.prepareStatement(sql);

             return true;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UsuarioInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    return false;
    }
}
