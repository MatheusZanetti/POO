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
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa;
    
    
    public PedidoCompra(int numero){
        this.numero = numero;
    }
    
    public void setDataPedido(String dataPedido){
     this.dataPedido = dataPedido;   
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public String getDataPedido(){
        return(dataPedido);
    }
    
    public double getValor(){
        return(valor);
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa(){
        return(pessoa);
    }
    
}
