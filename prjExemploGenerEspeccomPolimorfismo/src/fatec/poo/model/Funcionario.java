/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482321030
 */
public abstract class Funcionario{
    private int registro;
    private String nome;
    private String dtAdmissao;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    public abstract double calcSalBruto();
            
    public double calcDesconto(){
       return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
       return(calcSalBruto() - calcDesconto());
    }
}
