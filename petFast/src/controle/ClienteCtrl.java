/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Laboratório Engenharia
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - julho a Dezembro 2016 
 * Aluno Decio Antonio de Carvalho  * 
 */
package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.ClienteDAO;

/**
 *
 * @author Dac
 */
public class ClienteCtrl {
    private Object CliDAO;
    
    public void receberCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.inserirNovoCliente(cliente);
    }
     
    public static Cliente receberClienteCPF(String cpf) throws ClassNotFoundException, SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteCPF(cpf);
        return cliente;
    }
     
    public static boolean receberPesquisarClienteCPF(String cpf){
         boolean resposta = false;
         ClienteDAO cliente = new ClienteDAO();
         resposta = cliente.buscarExisteClienteCPF(cpf);
        return resposta;
    }
     
    public void alterarClienteCtrl(Cliente cliente, String cpf) throws ClassNotFoundException, SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.alterarCliente(cliente, cpf);
    } 
     
    public void deletarClienteCtrl(Cliente cliente, String cpf) throws ClassNotFoundException, SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.deletarCliente(cliente, cpf);
    } 

    public ArrayList populaComboClienteNome() {
       ArrayList lista;
       ClienteDAO clienteDAO = new ClienteDAO();
       return lista = clienteDAO.findComboClienteNome();
    
    }

    public List<Cliente> listarClientes() {
       ClienteDAO clienteDAO = new ClienteDAO();
       List<Cliente> lista = clienteDAO.listarClientes();
       return lista;
    
    }

    public List<Cliente> listaClientesNome(String nomeCliente) {
       ClienteDAO clienteDAO = new ClienteDAO();
       List<Cliente> lista = clienteDAO.listarClienteNome(nomeCliente);
       return lista;
    
    }
    
    public static Cliente receberClienteNome(String nomeCliente){
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteNome(nomeCliente);
        return cliente;   
        
    }
        
}
