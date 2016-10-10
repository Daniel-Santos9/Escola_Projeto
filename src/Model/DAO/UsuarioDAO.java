package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Usuario;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public boolean create( Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "INSERT INTO usuario (User_Nome,User_Login,User_Senha,User_Tipo)"
                        + " VALUES('"+u.getNome()+"','"+u.getLogin()+"','"+u.getSenha()+"','"+u.getTipo_user()+"');";
            stmt = con.prepareStatement(sql);         
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    
    public int procura_usuario(String login) throws UsuarioInvalidoException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
             sql = "SELECT User_ID FROM usuario WHERE User_Login ='"+login+"';";
             stmt = con.prepareStatement(sql);
             rs = stmt.executeQuery(sql);
             
             if(rs.first()){
                return rs.getInt(1);  
             }
             else{
                 throw new UsuarioInvalidoException();
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
    
    public boolean update_user(int id_prof, int id_user){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String sql = "UPDATE Usuario SET ID_Prof = "+id_prof+" WHERE User_ID = "+id_user+" ;";
            stmt = con.prepareStatement(sql);       
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }

    public boolean efetuarLogin(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT User_Tipo, User_Nome FROM usuario "
                         + "WHERE User_Login = '"+u.getLogin()+"' AND User_Senha = '"+u.getSenha()+"';";
            stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            if(rs.first()){
                u.setTipo_user(rs.getString(1));
                u.setNome(rs.getString(2));
                return true;
            }
 
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return false;
    }
}
