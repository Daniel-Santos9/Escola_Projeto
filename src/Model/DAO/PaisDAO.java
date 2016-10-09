package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Pais;
import Tratamento_Exception.PaisInvalidoException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PaisDAO {
    
      public boolean create( Pais p, String login){
          
        UsuarioDAO udao = new UsuarioDAO();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
       
        try {
            int user_inser = udao.procura_usuario(login);
            sql = "INSERT INTO PAIS (Pais_Pai,Pais_Mae,Pais_Logradouro,Pais_num,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+p.getNome_pai()+"','"+p.getNome_mae()+"','"+p.getLogradouro()+"','"+p.getNum()+
                     "',CURDATE(),CURTIME(),"+user_inser+","+1+");";
            
            stmt = con.prepareStatement(sql);      
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UsuarioInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
      
    public int procura_pais(Pais p) throws PaisInvalidoException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT Pais_ID FROM Pais WHERE Pais_Pai = '"+p.getNome_pai()+
                  "' AND Pais_Mae = '"+p.getNome_mae()+
                  "' AND Pais_Logradouro = '"+p.getLogradouro()+
                  "' AND Pais_Num = '"+p.getNum()+
                  ";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new PaisInvalidoException();
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        return -1;       
    }    
  
}
