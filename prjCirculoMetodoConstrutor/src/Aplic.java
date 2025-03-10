
import fatec.poo.model.Circulo;
import java.util.Scanner;



/**
 *
 * @author Dimas
 */
public class Aplic {   
    public static void main(String[] args) {        
   
        
        Scanner entrada = new Scanner(System.in);
        //Construtor com a unidade de medida
        System.out.print("Digite a unidade de medida: ");
        Circulo objCirc = new Circulo(entrada.next());
        
        System.out.println("Digite o raio do circulo ");
        objCirc.setRaio(entrada.nextDouble());
        
        System.out.println("Medida da area: " + objCirc.calcArea() +" " + objCirc.getUnidadeMedida() +"²");
        System.out.println("Medida da Perimetro: " + objCirc.calcPerimetro() +" " + objCirc.getUnidadeMedida());
        System.out.println("Medida da Diametro: " + objCirc.calcDiametro() +" " + objCirc.getUnidadeMedida());
                   
    }
}
