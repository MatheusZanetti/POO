/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author 0030482321030
 */
public class DaoProjeto {
    private Connection Cone;
    
    public DaoProjeto(Connection Cone){
        this.Cone = Cone;
    }
     public Projeto consultar(int codigo){
        Projeto objProj = null;
        
        PreparedStatement ps;
        try{}
            
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return(objProj);
    }
    
    public void inserir (Departamento objDerp){
             
        PreparedStatement ps;
        try{
            ps = Cone.prepareStatement("INSERT INTO ");
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        }
      public void alterar(Departamento objDerp) {
        PreparedStatement ps;
        try {
            ps = Cone.prepareStatement("UPDATE ***** set = ?, " + "= ?");
            
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        public void excluir(Departamento objDerp) {
        PreparedStatement ps;
        try {
            ps = Cone.prepareStatement("DELETE FROM  where  = ?");
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
}

    
}
