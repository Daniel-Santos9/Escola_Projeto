package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Aluno;
import Model.bean.Pais;
import Model.bean.Turma;
import Tratamento_Exception.AlunoInvalidoException;
import Tratamento_Exception.PaisInvalidoException;
import Tratamento_Exception.TurmaInvalidaException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
                    + " VALUES('"+a.getNome()+"','"+a.getRG()+"','"+a.getCPF()+"','"+a.getEmail()+"','"
                    +turma_id+"','"+pais_id+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
            
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
    
    public int procura_aluno(Aluno a) throws AlunoInvalidoException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT Alu_Matricu FROM Aluno WHERE Alu_Nome = '"+a.getNome()+
                  "' AND Alu_RG = '"+a.getRG()+
                  "' AND Alu_CPF = '"+a.getCPF()+
                  "' AND Alu_Email = '"+a.getEmail()+
                  ";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new AlunoInvalidoException();
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
  
    public List<Aluno> listAlunos(Turma t){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = null;
        
        List<Aluno> alunosList = new ArrayList<Aluno>();
        
        try {
            
            sql = "SELECT Alu_Matricu, Alu_Nome FROM Aluno WHERE ID_Turma = "+t.getTurma_id();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno a = new Aluno();
                
                a.setNome(rs.getString("Alu_Nome"));
                a.setMatricula(rs.getInt("Alu_Matricu"));
                
                alunosList.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        
        return alunosList;
    }
}
