/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Matheus Zanetti
 */
public abstract class Funcionario{
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String Cargos;
    
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
    public void setCargo(String carg){
        Cargos = carg;
    }
    
    public String getCargo(){
        return(Cargos);
    }
    public String getNome(){
        return(nome);
    }
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    public int getRegistro(){
        return(registro);
    }
}
