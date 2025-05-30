package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, 
                              String nome, 
                              String dtAdmissao, 
                              double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    public void setValHorTrab(double valHorTrab) {
        this.valHorTrab = valHorTrab;
    }

    public double getValHorTrab() {
        return valHorTrab;
    }

    public int getQtdeHorTrab() {
        return qtdeHorTrab;
    }

    
    @Override
    public double calcSalBruto() {
       return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075 * calcSalBruto());
    }
    
    //Aplicação do polimorfismo
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
