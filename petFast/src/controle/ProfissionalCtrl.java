/*
 * Este Software tem Objetivo Educacional
 * Para fins de TCC
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Julho a Dezembnro  
 * Aluno Decio Antonio de Carvalho  * 
 * 24-10-2016
 */


package controle;

import modelo.Profissional;
import modelo.ProfissionalDAO;



/**
 * @version 
 * @author Dantcar
 * @since 24-10-2016
 */
public class ProfissionalCtrl {

    public ProfissionalCtrl() {
    }
    
   /**
    * 1
    * @param nomeProfissional
    * @return 
    */
   public Profissional receberAnimalNome(String nomeProfissional){
        //AnimalDAO animalDAO = new AnimalDAO();
        ProfissionalDAO profDAO = new ProfissionalDAO();
        
        Profissional profissional = profDAO.buscarProfissionalNome(nomeProfissional);
        return profissional;  
    } 
   
    /**
     * 2
     * Método controle receber o id do último profissional cadastrado.
     * se não existir o id atual será 0
     * @return ultimo id do profissional cadastrado.
     */
    public int receberIdProfissionalAtual(){
        ProfissionalDAO profDAO = new ProfissionalDAO();
        int idProfissional = profDAO.buscarIdProfissionalAtual();
        return idProfissional; 
    }
    
    /**
     * 3
     * Método controle receber resposta se existe o animal informando seu id
     * @param idProfissional
     * @return resposta true or false
     */
    public boolean receberProfissionalByIdProfissional(int idProfissional){
       ProfissionalDAO profDAO = new ProfissionalDAO();
       Boolean resposta = profDAO.buscarProfissionalByIdProfissional(idProfissional);
       return resposta;
    }
    
    /**
     * 4
     * Método controle receber objeto Profissional informando o id do profissional
     * @param idProfissional
     * @return Animal
     */
    public Profissional receberProfissionalId(int idProfissional){
       ProfissionalDAO profDAO = new ProfissionalDAO();
       Profissional animal = profDAO.buscarProfissionalId(idProfissional);
       return animal; 
    }
    

}
