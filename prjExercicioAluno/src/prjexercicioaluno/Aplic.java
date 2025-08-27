package prjexercicioaluno;

import java.util.Scanner;

/**
 *
 * @author tigri
 */
public class Aplic {
    public static void main(String[] args) {
        double p1;
        double p2;
        double t1;
        double t2;
        int opcao;
        
        Aluno objAluno;
        objAluno = new Aluno();        
        Scanner  entrada;
        entrada = new Scanner(System.in);
        
        System.out.println("P1: ");
        p1 = entrada.nextDouble();
        objAluno.SetNtPrv1(p1);
        System.out.println("P2: ");
        p2 = entrada.nextDouble();
        objAluno.SetNtPrv2(p2);
        System.out.println("T1: ");
        t1 = entrada.nextDouble();
        objAluno.SetNtTrab1(t1);
        System.out.println("T2: ");
        t2 = entrada.nextDouble();
        objAluno.SetNtTrab2(t2);
        
        
        
        
        do{
         System.out.println("1 - Exibir Nota das Provas/Trabalhos");
         System.out.println("2 - Exibir Média dos Trabalhos/Provas");
         System.out.println("3 - Exibir Média Final ");
         System.out.println("4 - Sair");
         System.out.print("\n\t\t Digite a opção: ");
         opcao = entrada.nextInt();
         if(opcao == 1){
             System.out.println("P1: " + objAluno.getNtPrv1() + "\nP2: " 
                     +objAluno.getNtPrv2() +
                     "\nT1: " +objAluno.getNtTrab1()+ "\nT2: " + objAluno.getNtTrab2() );
         }else if(opcao==2){
             System.out.println("Média das Provas: \n" + objAluno.calcMediaProva() 
                     + "\n Média dos Trabalhos: \n" + objAluno.calcMediaTrab());
         }else if(opcao==3){
             System.out.println("Média Final: " + objAluno.calcMediaFinal() + "\n");
             
             if(objAluno.isAprovado()){
             System.out.println("Aprovado");
        }else {
             System.out.println("Reprovado");
        }
         }
         else{
             System.out.println("Insira uma opção válida");
         }
     }while(opcao < 4);
    }
}
    }
    
}
