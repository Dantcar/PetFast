/*
 * Este Software tem Objetivo Educacional
 * Para fins de TCC
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Julho a Dezembnro  
 * Aluno Decio Antonio de Carvalho  
 *  24-10-2016
 */
package modelo;


import static controle.Util.reduzString;    
import java.sql.Connection;
import java.sql.ResultSet;     
import java.sql.SQLException;      
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Décio
 */
public class ProfissionalDAO {
    
    //variáveis de campos Classe Profissional
    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idProfissionalNow = 0;

    public ProfissionalDAO() {
    }
    
    /**
     * método para encerrar Connection, Statement e ResutlSet
     */
    private void close() {
        try {
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            String msg = "" + e;
            JOptionPane.showMessageDialog(null, reduzString(msg));
        }
    }//final método close()
    
     /**
     * Método para buscar qual o id atual da tabela Animal
     *
     * @return idanimal atual
     */
    @SuppressWarnings("null")
    public int buscarIdProfissionalAtual() {
        //variaveis do método
        int resposta = 0;
        String sql, msg;
        msg = "";

        //Realizando conexao com o banco Petfast
        conexao = DBPetFast.getConnection();
        ResultSet rs;
        rs = null;
        
        //sql = "SELECT * FROM animal ORDER BY 1 DESC";

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(ProfissionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery("SELECT * FROM profisssional ORDER BY 1 DESC"); //select * from DAC.Profissional order BY 1 DESC
            System.out.println("ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(ProfissionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try { 
            if (rs.first()) {
                idProfissionalNow = rs.getInt(1);
                resposta = idProfissionalNow;
                
                System.out.println(idProfissionalNow); //remover depois dos testes
                close();
            }
        } catch (SQLException ex) {
            msg = "" + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            close();
            resposta = 0;
            Logger.getLogger(ProfissionalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;
    }//final método buscarIdPetAtual

    
}//final da classe ProfissionalDAO
