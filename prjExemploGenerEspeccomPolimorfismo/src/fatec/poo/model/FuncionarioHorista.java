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
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int reg, String nome, String dt, double val){
        super(reg,nome,dt);
        valHorTrab =val;
                
    }
    
    public void setQtdeHorTrab(int hor){
        qtdeHorTrab = hor;
    }
    
    
    //aplicação do polimofirsmo 
    public double  calcSalBruto(){
        return (valHorTrab * qtdeHorTrab);
    }
    
   public double calcGratificacao(){
        return (calcSalBruto()*0.075);
    }
   
    //Override
   public double calcSalLiquido(){
       return(super.calcSalLiquido() + calcGratificacao());
   }
}
