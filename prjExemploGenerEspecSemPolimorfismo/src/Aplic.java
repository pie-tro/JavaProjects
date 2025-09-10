import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
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
        System.out.println("\n\n\n");
       
        Professor objProf = new Professor(2020, "Maria Oliveira", "20/08/1980");
        
        objProf.setSalario(7500);
        System.out.println("Registro funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data nascimento: " + objProf.getDataNascimento());
        System.out.println("Salário: " + objProf.getSalario());
    }
}
