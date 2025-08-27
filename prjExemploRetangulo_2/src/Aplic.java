import java.util.Scanner;

/**
 *
 * @author pietro
 */
public class Aplic {
public static void main(String[] args) {
     double medAlt, medBase;
     int opcao;
     Retangulo objRet;
     Scanner entrada;
     entrada = new Scanner(System.in);
     
     System.out.print("Digite a medida da altura do Retângulo: ");
     medAlt = entrada.nextDouble(); //scanf("%lf", &medAlt);
     
     System.out.print("Digite a medida da base do Retângulo: ");
     medBase = entrada.nextDouble();
     
    //Instanciação de um objeto da classe retangulo
     objRet = new Retangulo();
     objRet.setAltura(medAlt);
     objRet.setBase(medBase);
     
     
     do{
         System.out.println("1 - Consultar Área");
         System.out.println("2 - Consultar Perímetro");
         System.out.println("3 - Consultar Diagonal ");
         System.out.println("4 - Encerrar");
         System.out.print("\n\t\t Digite a opção: ");
         opcao = entrada.nextInt();
         if(opcao == 1){
             System.out.println("Àrea: " + objRet.calcArea());
         }else if(opcao==2){
             System.out.println("Perímetro: " + objRet.calcPerimetro());
         }else if(opcao==3){
             System.out.println("Diagonal: " + objRet.calcDiagonal());
         }
         else{
             System.out.println("Insira uma opção válida");
         }
     }while(opcao < 4);
    }
}
