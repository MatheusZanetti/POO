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
public class Cliente extends Pessoa{
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String Cpf, String name, String tel){
        super(name, tel);
        cpf = Cpf;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    public void setAltura(double a){
        altura = a;
    }
    public String getCpf(){
        return(cpf);
    }
    public double getPeso(){
        return(peso);
    }
    public double getAltura(){
        return(altura);
    }
}
