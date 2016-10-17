package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Exemplar;
import Model.bean.Livro;
import Tratamento_Exception.DisciplinaInvalidaException;
import Tratamento_Exception.ExemplarInvalidoException;
import Tratamento_Exception.LivroInvalidoException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExemplarDAO {
    
    public boolean create( Exemplar e, Livro l,int user_inser){
          
        LivroDAO ldao = new LivroDAO();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {
            
            int livro_id = ldao.procura_livro(l);
            
            sql = "INSERT INTO Exemplar (Exem_Num,ID_Livro,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+e.getTombamento()+"',"+livro_id+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
            stmt = con.prepareStatement(sql);   
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        catch (LivroInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    
    public int procura_exemplar(Exemplar e, Livro l) throws ExemplarInvalidoException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT Exemplar_ID FROM Exemplar e"
                    + "INNER JOIN Livro l ON l.Livro_ID = e.ID_Livro"
                    + " WHERE Exemplar_Num = '"+e.getTombamento()+
                  "' AND Livro_Nome = '"+l.getNome()+
                  ";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new ExemplarInvalidoException();
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
