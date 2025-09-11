
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author tigri
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Artur Henrique", "25/05/2006",15.80);
        
        funcHor.setQtdeHorTrab(90);
        System.out.println("-- Horista --");
        System.out.println("Salário Bruto: "+funcHor.calcSalBruto());
        System.out.println("Desconto: "+funcHor.calcDesconto());
        System.out.println("Salário Líquido: "+funcHor.calcSalLiquido());
        System.out.println("Cargo: "+funcHor.getCargo());
        System.out.println("Gratificação: "+ funcHor.calcGratificacao());
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1010, "Ana Carol", "11/02/2006", 1500.0);
        funcMen.setNumSalMin(4.0);
        
        System.out.println("-- Mensalista --");
        System.out.println("Salário Bruto: "+funcMen.calcSalBruto());
        System.out.println("Desconto: "+funcMen.calcDesconto());
        System.out.println("Salário Líquido: "+funcMen.calcSalLiquido());
        System.out.println("Cargo: "+funcMen.getCargo());

    
    
    }    
}
