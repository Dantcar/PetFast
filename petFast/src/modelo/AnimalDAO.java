/*
 * Este Software tem Objetivo Educacional
 * Para fins de TCC
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Julho a Dezembnro  
 * Aluno Decio Antonio de Carvalho  * 
 */

package modelo;

import static controle.Util.reduzString;
import java.awt.HeadlessException;
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
 * @author deciodecarvalho
 */

public class AnimalDAO {
    
    //variáveis de campos Classe AnimalDAO
 private Connection conexao;
 private Statement stmt;
 private ResultSet rs;
 public int idPetNow = 0;

    public AnimalDAO() {
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
    }//fim close()
    
    

    
}
