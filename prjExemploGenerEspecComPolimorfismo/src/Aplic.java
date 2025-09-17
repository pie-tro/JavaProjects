
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author tigri
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Artur Henrique", "25/05/2006",15.80);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        funcHor.setCargo("Programador");
        funcHor.setQtdeHorTrab(90);
        
        System.out.println("-- Horista --");
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("------------------------------------");
        System.out.println("Salário Bruto : R$ " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto      : R$ " + df.format(funcHor.calcDesconto()));
        System.out.println("Salário Líquido: R$ " + df.format(funcHor.calcSalLiquido()));
        System.out.println("Gratificação  : R$ " + df.format(funcHor.calcGratificacao()));
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1010, "Ana Carol", "11/02/2006", 1500.0);
        funcMen.setNumSalMin(4.0);
        funcMen.setCargo("Administração");

        System.out.println("-- Mensalista --");
        System.out.println("Nome: " + funcMen.getNome());
        System.out.println("Cargo: " + funcMen.getCargo());
        System.out.println("------------------------------------");
        System.out.println("Salário Bruto : R$ " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto      : R$ " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário Líquido: R$ " + df.format(funcMen.calcSalLiquido()));;

        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Lucas Silva", "10/08/2010", 10.0);
        funcCom.addVendas(3000);
        funcCom.addVendas(2500);
        funcCom.addVendas(6000);
        funcCom.setSalBase(6000);
        funcCom.setCargo("Vendedor");
        
        System.out.println("\n-- Comissionado --");
        System.out.println("Nome: " + funcCom.getNome());
        System.out.println("Cargo: " + funcCom.getCargo());
        System.out.println("------------------------------------");
        System.out.println("Salário Base  : R$ " + df.format(funcCom.getSalBase()));
        System.out.println("Total Vendas  : R$ " + df.format(funcCom.getTotalVendas()));
        System.out.println("Taxa Comissão : " + funcCom.getTaxaComissao() + "%");
        System.out.println("------------------------------------");
        System.out.println("Salário Bruto : R$ " + df.format(funcCom.calcSalBruto()));
        System.out.println("Desconto      : R$ " + df.format(funcCom.calcDesconto()));
        System.out.println("Gratificação  : R$ " + df.format(funcCom.calcGratificacao()));
        System.out.println("Salário Líquido: R$ " + df.format(funcCom.calcSalLiquido()));
        
    
    }    
}
