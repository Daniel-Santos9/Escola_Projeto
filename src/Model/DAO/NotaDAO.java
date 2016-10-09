package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Aluno;
import Model.bean.Disciplina;
import Model.bean.Nota;
import Tratamento_Exception.AlunoInvalidoException;
import Tratamento_Exception.DisciplinaInvalidaException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NotaDAO {
    
    public boolean create( Nota n, Aluno a, Disciplina d,String login){
          
        AlunoDAO adao = new AlunoDAO();
        DisciplinaDAO ddao = new DisciplinaDAO();
        UsuarioDAO udao = new UsuarioDAO();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {
            
            int user_inser = udao.procura_usuario(login);
            int matri_alu = adao.procura_aluno(a);
            int id_disc = ddao.procura_disc(d);
            
            sql = "INSERT INTO Nota (Nota_Tipo,Nota_Valor,Nota_Bimestre,ID_Disc,Matricu_Alu,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+n.getDescricao()+"','"+n.getValor()+"','"+n.getBimestre()+"','"+id_disc+"','"+matri_alu+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
            stmt = con.prepareStatement(sql);   
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        catch (AlunoInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } 
        catch (DisciplinaInvalidaException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } 
        catch (UsuarioInvalidoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }  
}
