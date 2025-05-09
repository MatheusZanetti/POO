/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjexemplogenerespeccompolimorfismo;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;

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
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "joseph joestar", "14/05/1978", 15.80);
        FuncionarioMensalista funcMensa = new FuncionarioMensalista(2020, "jonatha", "10/04/1940", 20);
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "yoshikage kira", "13/12/2000", 8);
       
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("diarista"); 
        System.out.println("Funcionario Horista");
        System.out.println("Nome    =>" +funcHor.getNome());
        System.out.println("Data de admissão    =>" + funcHor.getDtAdmissao());
        System.out.println("Cargo   =>" + funcHor.getCargo());
        System.out.println("Salario bruto    =>" + df.format(funcHor.calcSalBruto()));
        System.out.println("Salario desconto    =>" + df.format(funcHor.calcDesconto()));
        System.out.println("Salario Gratificacao     =>" + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario liquido     =>" + df.format(funcHor.calcSalLiquido())+ "\n");
        
        funcMensa.setNumSalMin(1520);
        funcMensa.setCargo("jogador profissional");
        System.out.println("Funcionario Mensalista");
        System.out.println("Nome    =>" + funcMensa.getNome());
        System.out.println("Data de admissão    =>"+ funcMensa.getDtAdmissao());
        System.out.println("Cargo    =>" + funcMensa.getCargo());
        System.out.println("Salario bruto   =>" + df.format(funcMensa.calcSalBruto()));
        System.out.println("Salario desconto    =>" + df.format(funcMensa.calcDesconto()));
        System.out.println("Salario liquido     =>" + df.format(funcMensa.calcSalLiquido())+ "\n");

          
        funcCom.setSalBase(10000);
        funcCom.setCargo("Jornalista");
        funcCom.addVendas(10000);
        funcCom.addVendas(8000);
        funcCom.addVendas(12000);
        System.out.println("Funcionario Comissionado");
        System.out.println("Nome    =>" + funcCom.getNome());
        System.out.println("Data de admissão        =>" + funcCom.getDtAdmissao());
        System.out.println("Cargo   =>" + funcCom.getCargo());
        System.out.println("Taxa da comissão   =>" + funcCom.getTaxaComissao() + "%");
        System.out.println("Salario bruto   =>" + df.format(funcCom.calcSalBruto()));
        System.out.println("Vendas Mensais  =>" + df.format(funcCom.getTotalVendas()));
        System.out.println("Salario desconto    =>" + df.format(funcCom.calcDesconto()));
        System.out.println("Salario Gratificacao     =>" + df.format(funcCom.calcGratificacao()));
        System.out.println("Salario liquido     =>" + df.format(funcCom.calcSalLiquido()));

        

    }
    
}
