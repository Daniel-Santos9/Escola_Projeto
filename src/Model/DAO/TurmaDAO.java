package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Turma;
import Tratamento_Exception.TurmaInvalidaException;
import Tratamento_Exception.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
