/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Admin
 */
public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    
    
    public ContaCorrente(int Num, double Sal){
        numeroConta = Num;
        saldo = Sal;
    }
    
    public int getNumero(){
     return(numeroConta);   
    }
    public double getSaldo(){
     return(saldo);   
    }
    public void sacar(double a) {
       if ((saldo - a) >= 0){
           saldo = saldo-a;
           System.out.println("voce sacou " + a + " com sucesso");
       }
       else {
           System.out.println("nao e possivel sacar saldo insuficiente");
       }
    }
    public void depositar(double a){
        saldo= saldo + a;
    }
}
