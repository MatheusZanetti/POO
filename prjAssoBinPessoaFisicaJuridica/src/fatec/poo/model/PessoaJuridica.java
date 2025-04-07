package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String c, String n,int ano){
        super(n,ano);
        setCGC(c);
    }
    public double calcBonus(int anoAtual){        
       return (taxaIncentivo/100 * getTotalCompras()) * (anoAtual - getAnoInscricao()) ;   
    }
    public String getCGC() {
        return cgc;
    }
    public void setCGC(String c) {
        cgc = c;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }
    public void setTaxaIncentivo(double taxa) {
        taxaIncentivo = taxa;
    }    
}
