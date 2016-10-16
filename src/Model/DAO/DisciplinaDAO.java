package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Disciplina;
import Tratamento_Exception.DisciplinaInvalidaException;
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

public class DisciplinaDAO {
    
    public boolean create( Disciplina d, String login){
        UsuarioDAO udao = new UsuarioDAO();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;

        try {
            int user_inser = udao.procura_usuario(login);
            
            sql = "INSERT INTO Disciplina (Disc_Nome,Disc_Descricao,Disc_AS,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+d.getNome()+"','"+d.getDescricao()+"','"+d.getAula_sem()+
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
    
    public int procura_disc(Disciplina d) throws DisciplinaInvalidaException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT Disc_ID FROM Disciplina WHERE Disc_Nome = '"+d.getNome()+
                  "' AND Disc_Descricao = '"+d.getDescricao()+
                  "' AND Disc_AS = '"+d.getAula_sem()+
                  ";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new DisciplinaInvalidaException();
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

    public List<Disciplina> read(String login){
        
        String sql;
        UsuarioDAO udao = new UsuarioDAO();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Disciplina> disc = new ArrayList<>();
        
        try {
           
            int id_user = udao.procura_usuario(login);
            sql = "SELECT d.Disc_ID,d.Disc_Nome,d.Disc_Descricao, d.Disc_AS FROM DISCIPLINA d " +
                    "INNER JOIN RTDP r ON d.disc_id = r.id_disc " +
                    "INNER JOIN PROFESSOR p ON p.prof_id=r.id_prof " +
                    "INNER JOIN TURMA t ON t.turma_id=r.id_turma " +
                    "WHERE p.id_user = "+id_user+" "+
                    "AND t.turma_ano = YEAR(CURDATE())";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
             
            while(rs.next()){
                Disciplina d = new Disciplina();
                d.setDisc_id(rs.getInt(1));
                d.setNome(rs.getString(2));
                d.setDescricao(rs.getString(3));
                d.setAula_sem(rs.getString(4));
                
                disc.add(d);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UsuarioInvalidoException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
        return disc;
    }    
 }
