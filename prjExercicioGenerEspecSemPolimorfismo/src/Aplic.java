import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

/**
 *
 * @author tigri
 */
public class Aplic {
public static void main(String[] args) {
        Cliente objCli = new Cliente ("Artur Henrique", "11 99999-9999", "000.000.000-00");
        objCli.setAltura(1.82);
        objCli.setPeso(84.0);
        
        Instrutor objInst = new Instrutor(1010,"11 00000-0000" ,"Dimas");
        objInst.setAreaAtuacao("Professor");
        
        System.out.println("-- Cliente --");
        System.out.println("Nome: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("Altura: " + objCli.getAltura());
        System.out.println("Peso: "+ objCli.getPeso());
        System.out.println("IMC: " + objCli.calcImc());
        
        System.out.println("\n\n-- Instrutor --");
        System.out.println("Nome: " + objInst.getNome());
        System.out.println("Telefone: " + objInst.getTelefone());
        System.out.println("Número de Identificação: " + objInst.getIdentificacao());
        System.out.println("Área de Atuação: " + objInst.getAreaAtuacao());
    }    
}
