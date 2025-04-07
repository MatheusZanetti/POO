package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;

    public PessoaFisica(String c, String n, int ano){
        super(n,ano);
        cpf= c;
    }
    public double calcBonus(int anoAtual){
        if(getTotalCompras() > 12000){
            return (anoAtual - getAnoInscricao()) * base;
        }
        
        return 0;            
    }    
    public String getCPF() {
        return cpf;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double b) {
        base = b;
    }
}
