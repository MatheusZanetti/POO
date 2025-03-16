import java.util.Scanner;
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusZanetti
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   Cliente objCliente = new Cliente("12312312398","josefino", "15997997602");
   Instrutor objInstrutor = new Instrutor(1231234, "giornogiovana", "47895235");
   
   objCliente.setAltura(2.20);
   objCliente.setPeso(90);
   objInstrutor.setAreaAtua("professor de educacao fisica");
    
     System.out.println("Cpf cliente: " + objCliente.getCpf());
      System.out.println("Nome cliente: " + objCliente.getName());
      System.out.println("telefone client " + objCliente.getTelefone());
      System.out.println("Altura cliente " + objCliente.getAltura()); 
    System.out.println("Peso cliente: " + objCliente.getPeso() );
      
      System.out.println("Identificacao: " + objInstrutor.getIdentificacao());
      System.out.println("Nome instrutor: " + objInstrutor.getName());
      System.out.println("telefone instrutor: " + objInstrutor.getTelefone());
      System.out.println("area de atuacao: " + objInstrutor.getAreaAtua()); 
      
    }
    
}
