
import java.util.Scanner;

/**
 *
 * @author tigri
 */
public class Aplic {
    public static void main(String[] args) {
        int numero;
        double saldo, deposit;
        ContaCorrente objCc;
        Scanner entrada;
        entrada = new Scanner(System.in);
        int opcao;
        double saque;

        System.out.println("Digite o número da conta; ");
        numero = entrada.nextInt();
        System.out.println("Digite o saldo: ");
        saldo = entrada.nextDouble();
        
        objCc = new ContaCorrente(numero, saldo);
        
        do{
         System.out.println("1 - Consultar Saldo");
         System.out.println("2 - Sacar");
         System.out.println("3 - Depositar");
         System.out.println("4 - Encerrar");
         System.out.print("\n\t\t Digite a opção: ");
         opcao = entrada.nextInt();
         if(opcao == 1){
             System.out.println("Número da Conta: " + objCc.getNumero());
             System.out.println("Seu saldo é: " + objCc.getSaldo());
         }else if(opcao ==2){
             System.out.println("Número da Conta: " + objCc.getNumero());
             System.out.println("Quanto quer sacar? ");
             saque = entrada.nextDouble();
             if(saque>saldo){
                 System.out.println("Saldo insuficiente. Seu saldo atual é: "+objCc.getSaldo());
             }else{
             objCc.sacar(saque);
             System.out.println("Saldo após o saque: " + objCc.getSaldo());
             }
         }else if(opcao == 3){
             System.out.println("Número da Conta: " + objCc.getNumero());
             System.out.println("Quanto quer depositar? ");
             deposit = entrada.nextDouble();
             objCc.depositar(deposit);
             System.out.println("Saldo após depósito: "+ objCc.getSaldo());
         }
         
        }while(opcao <4);
        
    }
    
}
