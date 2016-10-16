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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NotaDAO {
    
    public boolean create( Nota n, Aluno a, Disciplina d,String login){
          
        UsuarioDAO udao = new UsuarioDAO();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {
            
            int user_inser = udao.procura_usuario(login);
            
            sql = "INSERT INTO Nota (Nota_Tipo,Nota_Valor,Nota_Bimestre,ID_Disc,Matricu_Alu,DT_Inser,HR_Inser,User_Inser,Status)"
                    + " VALUES('"+n.getDescricao()+"','"+n.getValor()+"','"+n.getBimestre()+"','"+d.getDisc_id()+"','"+a.getMatricula()+"',CURDATE(),CURTIME(),"+user_inser+","+1+");";
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

    public List<Nota> ListNotas(int matri_alu, int id_disc){
        
        String sql;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Nota> no = new ArrayList<>();
        
        try {
           
            sql = "SELECT n.Nota_ID,n.Nota_Tipo,n.Nota_Bimestre, n.Nota_Valor FROM Nota n " +
                    "INNER JOIN ALUNO a ON a.Alu_Matricu = n.Matricu_Alu " +
                    "INNER JOIN DISCIPLINA d ON d.Disc_ID = n.ID_Disc " +
                    "WHERE d.Disc_ID = "+id_disc+" "+
                    "AND a.Alu_Matricu = "+matri_alu+" AND n.Status = 1";
            stmt = con.prepareStatement(sql);          
            stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
             
            while(rs.next()){
                Nota not = new Nota();
                not.setNota_id(rs.getInt(1));
                not.setDescricao(rs.getString(2));
                not.setBimestre(rs.getString(3));
                not.setValor(Float.parseFloat(rs.getString(4)));
                
                no.add(not);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
        return no;
    }
    
    public boolean UpdateNotas(Nota n){
              
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {
                     
            sql = "UPDATE Nota SET Nota_Tipo = '"+n.getDescricao()+"',Nota_Valor = "+n.getValor()+" ,Nota_Bimestre = '"+n.getBimestre()+"' WHERE Nota_ID = "+n.getNota_id()+" ;";
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
    
        public boolean DeleteNotas(Nota n, int id_user){
              
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        try {          
            sql = "UPDATE Nota SET DT_Excl = CURDATE(), HR_Excl = CURTIME(), User_Excl= "+id_user+", Status = 0 WHERE Nota_ID = "+n.getNota_id()+" ;";
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
}
