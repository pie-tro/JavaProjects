import fatec.poo.model.Aluno;
/**
 *
 * @author tigri
 */
public class Aplic {
    public static void main(String[] args) {
       Aluno objAlu = new Aluno(1010,"Carlos Silveira","15/03/1978");
       
       objAlu.setMensalidade(1500);
        System.out.println("Registo escolar: "+ objAlu.getRegEscolar());
        System.out.println("Nome: "+ objAlu.getNome());
        System.out.println("Data nascimento: "+ objAlu.getDataNascimento());
        System.out.println("Mensalidade: "+ objAlu.getMensalidade());
    }
}
