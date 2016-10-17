package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Aluno;
import Model.bean.Disciplina;
import Model.bean.Livro;
import Tratamento_Exception.AlunoInvalidoException;
import Tratamento_Exception.DisciplinaInvalidaException;
import Tratamento_Exception.LivroInvalidoException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LivroDAO {
    
    public boolean create( Livro l, Disciplina d,int user_inser){
          
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {
                     
            sql = "INSERT INTO Livro (Livro_Nome,Livro_Descri,ID_Disc,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+l.getNome()+"','"+l.getDescricao()+"','"+d.getDisc_id()+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
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
    
    public int procura_livro(Livro l) throws LivroInvalidoException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT Livro_ID FROM Livro WHERE Livro_Nome = '"+l.getNome()+
                  "' AND Livro_Descri = '"+l.getDescricao()+
                  ";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new LivroInvalidoException();
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
