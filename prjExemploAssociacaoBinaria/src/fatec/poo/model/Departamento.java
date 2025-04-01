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
public class Departamento {

    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; // definição ponteiro - multiplicidade 1*
    private int numFunc;

    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0; // indica o primeiro elemento da matriz
    
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    
    //tem como parametro de entrada um endereço de um objeto das subclasses 
    // de funcionario. Além dela própria
    public void addFuncionarios(Funcionario funcionario){
        funcionarios[numFunc++] = funcionario; // faz primeiro a função e depois soma
    }
    
    public void listarFuncionario(){
        
        System.out.println("Sigla:" + sigla);
        System.out.println("Nome:" + nome);
        for(int i = 0; i<= numFunc; i++){
        System.out.println("Registro    Nome    Cargo");
        System.out.println(funcionarios[i] +"    " + funcionarios[i].getNome()+"    "  + funcionarios[i].getCargo());
    }
    }

    
        
}
