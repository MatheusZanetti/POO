/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author MatheusZanetti
 */
public class Instrutor extends Pessoa{
    private int Identificacao;
    private String areaAtua;
    
    public Instrutor(int ident, String Nome, String Telefone){
        super(Nome, Telefone);
        Identificacao = ident;
    }
    
    public void setAreaAtua(String area){
        areaAtua = area;
    }
    
    public int getIdentificacao(){
        return(Identificacao);
    }
    
    public String getAreaAtua(){
        return(areaAtua);
    }
    
}
