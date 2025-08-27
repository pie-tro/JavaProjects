import java.util.Scanner;

/**
 *
 * @author pietro
 */
public class Aplic {
public static void main(String[] args) {
     double medRaio;
     int opcao;
     Circulo objCirc;
     Scanner entrada;
     entrada = new Scanner(System.in);
     
     System.out.print("Digite a medida do Raio do Círculo: ");
     medRaio = entrada.nextDouble(); //scanf("%lf", &medAlt);
   
    
     objCirc = new Circulo();
     objCirc.setRaio(medRaio);
     
     
     do{
         System.out.println("1 - Consultar Área");
         System.out.println("2 - Consultar Perímetro");
         System.out.println("3 - Consultar Diametro ");
         System.out.println("4 - Encerrar");
         System.out.print("\n\t\t Digite a opção: ");
         opcao = entrada.nextInt();
         if(opcao == 1){
             System.out.println("Àrea: " + objCirc.calcArea());
         }else if(opcao==2){
             System.out.println("Perímetro: " + objCirc.calcPerimetro());
         }else if(opcao==3){
             System.out.println("Diametro: " + objCirc.calcDiametro());
         }
         else{
             System.out.println("Insira uma opção válida");
         }
     }while(opcao < 4);
    }
}
