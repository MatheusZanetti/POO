import java.util.Scanner;
import fatec.poo.model.ContaCorrente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, opcao;
        double saldo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta");
        numero = entrada.nextInt();
        
        System.out.println("Digite o valor do saldo");
        saldo = entrada.nextDouble();
        
        ContaCorrente objCC = new ContaCorrente(numero, saldo);
        
        do{
            System.out.println("\n\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consulta saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\n Digite a opcao: ");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor para depositar");
                    saldo = entrada.nextDouble();
                    objCC.depositar(saldo);
                    System.out.println("parabens o deposito foi bem sucessidido esse e o valor atual do seu saldo: R$" + objCC.getSaldo() + "  o valor antigo era: R$" + (objCC.getSaldo() - saldo));
                    break;
                case 2:
                     System.out.println("Digite o valor para sacar");
                     saldo = entrada.nextDouble();
                     objCC.sacar(saldo);
                     break;
                case 3:
                    System.out.println("o seu saldo e R$" + objCC.getSaldo());
            }
            
        }while(opcao < 4);
    
    }
    
}
