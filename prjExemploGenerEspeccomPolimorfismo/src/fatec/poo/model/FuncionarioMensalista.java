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
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int reg, String name, String dt, double val){
     super(reg, name, dt);
     valSalMin = val;
    }
    public void setNumSalMin(double sal){
        numSalMin = sal;
    }
    public double calcSalBruto(){
        return(valSalMin * numSalMin);
    }

    
}
