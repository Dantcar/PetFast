/*
 * Este Software tem Objetivo Educacional
 * Para fins de TCC
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Julho a Dezembnro  
 * Aluno Decio Antonio de Carvalho  * 
 */
package modelo;

import static controle.Util.reduzString;    //reduzir String das mensagens
import java.awt.HeadlessException;
import java.sql.Connection;     //variavel conexao
import java.sql.ResultSet;      //variavel rs
import java.sql.SQLException;
import java.sql.Statement;      //variavel stmt
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;     //mensagens de erro

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
    }//final método close()

    /**
     * Método para buscar qual o id atual da tabela Animal
     *
     * @return idanimal atual
     */
    @SuppressWarnings("null")
    public int buscarIdPetAtual() {
        //variaveis do método
        int resposta = 0;
        String sql, msg;
        msg = "";

        //Realizando conexao com o banco Petfast
        conexao = DBPetFast.getConnection();
        ResultSet rs;
        rs = null;
        sql = "SELECT * FROM animal ORDER BY idanimal DESC";

        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql); //select * from DAC.ANIMAL order BY 1 DESC
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idPetNow = rs.getInt(1);
                resposta = idPetNow;

                close();
            }
        } catch (SQLException ex) {
            msg = "" + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            close();
            resposta = 0;
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;
    }//final método buscarIdPetAtual

    public Animal buscarAnimalNome(String nomeAnimal) {
        Animal animal = new Animal();

        //variaveis do método
        String msg = "";
        String sql = "SELECT * FROM animal WHERE upper(nome) LIKE upper('" + nomeAnimal + "')";
        System.out.println(sql);
        conexao = DBPetFast.getConnection();
        ResultSet rs;
        rs = null;

        try {
            //preparacao para buscar no banco
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Buscando no banco a instrucao/comando
        try {
            if (rs.first()) {
                //utilizando o objeto animal estanciado no início do método

                animal.setIdAnimal(rs.getString("idanimal"));
                animal.setIdCliente(rs.getString("idcliente"));
                animal.setNome(rs.getString("nome"));
                animal.setEspecie(rs.getString("especie"));
                animal.setNascimento(rs.getString("nascimento"));
                animal.setRaca(rs.getString("raca"));
                animal.setPeso(rs.getString("peso"));
                animal.setAltura(rs.getString("altura"));
                animal.setCor(rs.getString("cor"));
                animal.setCaracteristica(rs.getString("caracteristica"));
                animal.setCaracteristica(rs.getString("sexo"));

            } else {
                msg = msg + "Animal Pet não encontrado \n";
            }
        } catch (SQLException ex) {

            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //envia mensagem na tela caso ocorra alguma execessao ou nao encontre o animal
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        return animal;

    }//final método buscarAnimalNome

    /**
     * Método para buscar uma lista de animais fornecendo o idCliente
     *
     * @param cliente
     * @return
     */
    public List<Animal> listarAnimaisCliente(int cliente) {
        Animal animal = new Animal();   //objeto animal que será utilizado para preencher a lista
        List<Animal> lista = new ArrayList<>(); //lista de animais pertencentes ao cliente

        //variáveis do método
        String msg = "";
        String sql = "SELECT * FROM animal WHERE idcliente = " + cliente + "ORDER BY 1 ASC";
        System.out.println(sql);
        conexao = DBPetFast.getConnection();
        ResultSet rs;
        rs = null;
        lista = null;

        //preparando a conexao com o banco Petfast
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //executando o comando sql
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (rs.next()) {
                //usando o objeto animal estanciado no início do método

                animal.setIdAnimal(rs.getNString(rs.getString("idanimal")));
                animal.setIdCliente(rs.getString("idcliente"));
                animal.setNome(rs.getString("nome"));
                animal.setEspecie(rs.getString("especie"));
                animal.setNascimento(rs.getString("nascimento"));
                animal.setRaca(rs.getString("raca"));
                animal.setPeso(rs.getString("peso"));
                animal.setAltura(rs.getString("altura"));
                animal.setCor(rs.getString("cor"));
                animal.setCaracteristica(rs.getString("caracteristica"));
                animal.setCaracteristica(rs.getString("sexo"));

                lista.add(animal);

            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return lista;
    }//final método listarAnimaisCliente

    /**
     * Método boolean que retorna true se existir o animal informado pelo
     * idanimal
     *
     * @param animal
     * @return
     */
    public boolean buscarAnimalByIdAnimal(int idanimal) {
        boolean resposta = true;
        String msg, sql;
        msg = "";
        sql = "SELECT * FROM cliente WHERE idanimal = " + idanimal;
        conexao = DBPetFast.getConnection();
        ResultSet rs;
        rs = null;

        try {
            //conexao com o banco Petfast
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Enviando o comando sql
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Utilizando o resultado da consulta sql
        try {
            if (rs.first()) {
                close();
                resposta = false;
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            close();
            resposta = false;

        }

        //envia mensagem na tela caso ocorra alguma execessao ou nao encontre o animal
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        return resposta;
    }//final método buscarAnimalByIdAnimal

    /**
     * Método para buscar um objeto animal informando o idAnimal
     *
     * @param id
     * @return
     */
    public Animal buscarAnimalId(int id) {
        Animal animal = new Animal();

        //Variáveis do método
        String msg, sql;
        msg = "";
        conexao = DBPetFast.getConnection();
        ResultSet rs = null;
        sql = "SELECT * FROM cliente WHERE idanimal = " + id;

        //enviando o comando sql
        try {
            //Conectando com banco petfast
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                //utilizando o objeto animal estanciado no início do método

                animal.setIdAnimal(rs.getString("idanimal"));
                animal.setIdCliente(rs.getString("idcliente"));
                animal.setNome(rs.getString("nome"));
                animal.setEspecie(rs.getString("especie"));
                animal.setNascimento(rs.getString("nascimento"));
                animal.setRaca(rs.getString("raca"));
                animal.setPeso(rs.getString("peso"));
                animal.setAltura(rs.getString("altura"));
                animal.setCor(rs.getString("cor"));
                animal.setCaracteristica(rs.getString("caracteristica"));
                animal.setCaracteristica(rs.getString("sexo"));

            } else {
                msg = msg + "Animal Pet não encontrado \n";
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Qualquer falha mostra as mensagens respectivas
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        return animal;
    }//Final do método buscarAnimalId
    
    /**
     * Método para incluir um novo animal
     * @param animal 
     */
    public void inserirAnimal(Animal animal) {
        String msg;
        int idAnimal = buscarIdPetAtual();
        idAnimal = idAnimal + 1;

        msg = "";
        conexao = DBPetFast.getConnection();

        String sql = "INSERT INTO animal VALUES ("
                //+ parseInt(cliente.getIdCliente()) +", "
                + idAnimal + ", "
                + Integer.parseInt(animal.getIdCliente())
                + "'" + animal.getNome() + "', "
                + "'" + animal.getEspecie() + "', "
                + "'" + animal.getNascimento() + "', "
                + "'" + animal.getRaca() + "', "
                + "'" + animal.getPeso() + "', "
                + "'" + animal.getAltura() + "', "
                + "'" + animal.getCor() + "', "
                + "'" + animal.getCaracteristica() + "', "
                + "'" + animal.getSexo() + "')";
        
        //Preparação do comando sql
        try {
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            stmt.executeUpdate(sql);
              msg = msg+"Dados do cliente inseridos com sucesso \n";
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        close();
        try {
            if (conexao.isClosed()){
                // msg = msg+"Conexão ao banco fechada";
                JOptionPane.showMessageDialog(null,msg );
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            JOptionPane.showMessageDialog(null,msg );
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//Final método inserirAnimal
    
    /**
     * Método para alterar um animal cadastrado
     * @param animal
     * @param vid 
     */
    public void alterarAnimal(Animal animal, String vid){
     String msg;
        msg="";
        conexao = DBPetFast.getConnection();
        String sql = "UPDATE animal SET "
                + "idCliente = '" + Integer.parseInt(animal.getIdCliente())
                + "nome = '" + animal.getNome() + "', "
                + "especie = '" + animal.getEspecie() + "', "
                + "nascimento = '" + animal.getNascimento() + "', "
                + "raca = '" + animal.getRaca() + "', "
                + "peso = '" + animal.getPeso() + "', "
                + "altura = '" + animal.getAltura() + "', "
                + "cor = '" + animal.getCor() + "', "
                + "caracteristica = '" + animal.getCaracteristica() + "', "
                + "sexo = '" + animal.getSexo() + "', "
           + " WHERE IDANIMAL = "+Integer.parseInt(vid);
        
        try {
            stmt.executeUpdate(sql);
            msg = msg+"Dados do animal alterados com sucesso \n";
        } catch (SQLException ex) {
            msg = reduzString(msg+ex);
            msg = reduzString(msg);
            msg = msg+"Erro de gravação no BD \n";
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

    }//Final método alterarAnimal
    
    /**
     * Método para excluir um animal do cadastro
     * @param animal
     * @param vid 
     */
    public void deletarAnimal(Animal animal, String vid){
       String msg;
        msg="";
        
        conexao = DBPetFast.getConnection();
        String sql ="DELETE FROM animal WHERE IDANIMAL = " +Integer.parseInt(vid);
        
        int n = JOptionPane.showConfirmDialog(
            null,
            "Confirma Deletar Animal?",
            "Confirmar Deletar Animal",
            JOptionPane.YES_NO_OPTION);
           
            if(true){
           try {
               stmt.executeUpdate(sql);
               msg = msg+"Dados do cliente excluidos com sucesso \n";
                } catch (SQLException ex) {
                msg = reduzString(msg+ex);
                 msg = reduzString(msg);
                msg = msg+"Erro de gravação no BD \n";
               Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
            
         if ("".equals(msg)) {
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
         
    }//Final método deletarAnimal
    
    
    

}//final Classe AnimalDAO
