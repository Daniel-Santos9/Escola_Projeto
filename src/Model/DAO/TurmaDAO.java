package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Turma;
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

public class TurmaDAO {
    
      public boolean create( Turma t, String login){
        UsuarioDAO udao = new UsuarioDAO();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
       
        try {
            int user_inser = udao.procura_usuario(login);
            
            sql = "INSERT INTO TURMA (Turma_Serie,Turma_Sala,Turma_Turno,Turma_Ano,DT_Inser,HR_Inser,User_Inser,Status)"
                     + " VALUES('"+t.getSerie()+"','"+t.getSala()+"','"+t.getTurno()+",EXTRACT(YEAR FROM CURDATE()),CURDATE(),CURTIME(),"+user_inser+","+1+");";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UsuarioInvalidoException ex) {
              Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
          }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
      
    public int procura_turma(Turma t) throws TurmaInvalidaException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "SELECT Turma_ID FROM Turma WHERE Turma_Serie = '"+t.getSerie()+
                       "' AND Turma_Turno = '"+t.getTurno()+"' AND Turma_Ano =" +"EXTRACT(YEAR FROM CURDATE())"+";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            
            if(rs.first()){
                return rs.getInt(1);
            }
            else{
                throw new TurmaInvalidaException();
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

    public List<Turma> read(String login){
        
        String sql;
        UsuarioDAO udao = new UsuarioDAO();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Turma> turm = new ArrayList<>();
        
        try {
           
            int id_user = udao.procura_usuario(login);
            sql = "SELECT t.Turma_Id,t.Turma_Turno,t.Turma_Serie, t.Turma_Sala, t.Turma_Ano,d.Disc_Nome,d.Disc_ID FROM TURMA t " +
                    "INNER JOIN RTDP r ON t.turma_id=r.id_turma " +
                    "INNER JOIN PROFESSOR p ON p.prof_id=r.id_prof " +
                    "INNER JOIN DISCIPLINA d ON d.disc_id = r.id_disc " +
                    "WHERE p.id_user = "+id_user+" "+
                    "AND t.turma_ano = YEAR(CURDATE())";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
             
            while(rs.next()){
                Turma t = new Turma();
                t.setTurma_id(rs.getInt(1));
                t.setTurno(rs.getString(2));
                t.setSerie(rs.getString(3));
                t.setSala(rs.getString(4));
                t.setAno(rs.getString(5));
                t.setDisc_nome(rs.getString(6));
                t.setId_disc(rs.getInt(7));
                turm.add(t);
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
        
        return turm;
    }

    public Turma InformationTurma(int id_turma){
        
        String sql;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Turma t = new Turma();
        
        try {
           
            sql = "SELECT t.Turma_Id,t.Turma_Turno,t.Turma_Serie, t.Turma_Sala, t.Turma_Ano"
                    + " FROM TURMA t WHERE Turma_ID = "+id_turma+";";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
             
            if(rs.first()){
                t.setTurma_id(rs.getInt(1));
                t.setTurno(rs.getString(2));
                t.setSerie(rs.getString(3));
                t.setSala(rs.getString(4));
                t.setAno(rs.getString(5));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
        return t;
    }
}
