package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Aluno;
import Model.bean.Pais;
import Model.bean.Turma;
import Tratamento_Exception.PaisInvalidoException;
import Tratamento_Exception.TurmaInvalidaException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlunoDAO {

    public boolean create( Aluno a, Turma t, Pais p, String login){
          
        UsuarioDAO udao = new UsuarioDAO();
        TurmaDAO tdao = new TurmaDAO();
        PaisDAO pdao = new PaisDAO();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {
            int user_inser = udao.procura_usuario(login); 
            int turma_id = tdao.procura_turma(t);
            int pais_id = pdao.procura_pais(p);
            
            sql = "INSERT INTO ALUNO (Alu_Nome,Alu_RG,Alu_CPF,Alu_Email,ID_Turma,ID_Pais,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+a.getNome()+"','"+a.getRG()+"','"+a.getCPF()+"','"+a.getEmail()+"','"+turma_id+"','"+pais_id+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
            stmt = con.prepareStatement(sql);   
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
        catch (TurmaInvalidaException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } 
        catch (PaisInvalidoException ex) {
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
