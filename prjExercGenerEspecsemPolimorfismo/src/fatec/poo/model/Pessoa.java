/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Admin
 */
public class Pessoa {
    private String Nome;
    private String Telefone;
    public Pessoa(String Name, String Tel){
        Nome = Name;
        Telefone = Tel;
    }
    public String getName(){
        return(Nome);
    }
    public String getTelefone(){
        return(Telefone);
    }
    
}
