/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Laboratório Engenharia
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - julho a Dezembro 2016 
 * Aluno Decio Antonio de Carvalho  * 
 */


package modelo;

import static controle.Util.reduzString;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @version 
 * @author Dantcar
 * @since 
 */
public class AgendamentoDAO {
    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idAgendamentoNow = 0;
    
    
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
    }//fim close()  
    
    public int buscarIdAgendamentoAtual(){
        int resposta = 0;
        
        return resposta;
    }//Final método buscarIdAgendamentoAtual
    
    
    
    
    
}//Final da Classe AgendamentoDAO
