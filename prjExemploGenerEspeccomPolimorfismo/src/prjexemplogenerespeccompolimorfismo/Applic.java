/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjexemplogenerespeccompolimorfismo;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
/**
 *
 * @author 0030482321030
 */
public class Applic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "joseph joestar", "14/05/1978","diarista" ,15.80);
        FuncionarioMensalista funcMensa = new FuncionarioMensalista(2020, "jonatha", "10/04/1940","jogador competitivo",20);
        
        funcHor.setQtdeHorTrab(176);
        System.out.println("Funcionario Horista");
        System.out.println("Salario bruto =>" + funcHor.calcSalBruto());
        System.out.println("Salario desconto =>" + funcHor.calcDesconto());
        System.out.println("Salario liquido =>" + funcHor.calcSalLiquido());
        System.out.println("cargo =>" + funcHor.getCargo());
        
        funcMensa.setNumSalMin(1520);
        System.out.println("Funcionario Mensalista");
        System.out.println("Salario bruto=>" + funcMensa.calcSalBruto());
        System.out.println("Salario desconto =>" + funcMensa.calcDesconto());
        System.out.println("Salario liquido =>" + funcMensa.calcSalLiquido());
        System.out.println("cargo =>" + funcMensa.getCargo());
        

    }
    
}
