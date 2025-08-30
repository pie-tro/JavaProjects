
import java.util.Scanner;

/**
 *
 * @author pietr
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao, id;
        String titulo;
        double VMult;
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite o ID do livro: ");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o título do livro: ");
        titulo = entrada.nextLine();
        System.out.print("Digite o valor da multa diária: ");
        VMult = entrada.nextInt();
        
        Livro objLivro = new Livro(id, titulo);
        objLivro.setValMultaDiaria(VMult);
      do{  
            System.out.println("\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();

       switch (opcao) {
                case 1:
                    System.out.println("ID: " + objLivro.getIdentificacao());
                    System.out.println("Título: " + objLivro.getTitulo());
                    System.out.println("Situação: " + 
                        (objLivro.getSituacao() ? "Emprestado" : "Disponível"));
                    break;
                case 2:
                    if (objLivro.getSituacao()) {
                        System.out.println("O livro está emprestado");
                    } else {
                        objLivro.emprestar();
                        System.out.println("Operação de empréstimo realizada com sucesso.");
                    }
                    break;

                case 3:
                    if (!objLivro.getSituacao()) {
                        System.out.println("O livro já está disponível");
                    } else {
                        System.out.print("Digite a quantidade de dias de atraso: ");
                        int dias = entrada.nextInt();
                        double multa = objLivro.devolver(dias);
                        System.out.println("Operação de devolução realizada com sucesso.");
                        if (multa > 0) {
                            System.out.println("Valor da multa: R$ " + multa);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
            }while (opcao != 4);
        }    
    }

