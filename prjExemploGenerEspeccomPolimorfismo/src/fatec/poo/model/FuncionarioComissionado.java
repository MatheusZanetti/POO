/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author MatheusZanetti
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int reg, String name, String dtAdm, double tax){
    super(reg, name, dtAdm);
    taxaComissao = tax;
    }
    
    public void setSalBase(double sal){
        salBase = sal;
    }
    public double getSalBase(){
        return(salBase);
    }
    public double getTotalVendas(){
        return(totalVendas);
    }
    public double getTaxaComissao(){
        return(taxaComissao);
    }
    public void addVendas(double sales){
        totalVendas += sales;
    }
    public double calcGratificacao(){
        
        //se for maior que 100000
        if(totalVendas > 10000){
            return(totalVendas*0.05);
        }
        //se não for maior que 10000 e for maior que 5000
        else if(totalVendas > 5000){
            return(totalVendas*0.03);
        }
        //se for menor que 5001
        return (0);
    }
    public double calcSalBruto(){
    return(salBase+taxaComissao/100*totalVendas);
    }
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
    
    

