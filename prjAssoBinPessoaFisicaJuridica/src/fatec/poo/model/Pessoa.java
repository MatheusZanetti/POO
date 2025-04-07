package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private PedidoCompra[] cadPedidos;
    private int numPedidos = 0;
    
    public Pessoa(String n, int ano){
        nome = n;
        anoInscricao = ano;       
    }
    
    public abstract double calcBonus(int anoAtual);
    
    public void addCompras(double val){
        totalCompras += val;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void setCadPedidos(PedidoCompra pedidoCompra){
        cadPedidos[numPedidos++] = pedidoCompra;
    }
    
    public int listarPedido(){
        return(numPedidos);
    }
}

