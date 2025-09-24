
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author pietr
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        PessoaFisica pf = new PessoaFisica("João Silva", "123.456.789-00", 2015);
        pf.setBase(500); 
        pf.addCompras(15000); 
        pf.addCompras(2000);
        
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-90", 2010);
        pj.setTaxaIncentivo(0.05); 
        pj.addCompras(30000); 
        pj.addCompras(10000);

        System.out.println("==== Pessoa Física ====");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Ano de Inscrição: " + pf.getAnoInscricao());
        System.out.println("Total de Compras: R$ " + df.format(pf.getTotalCompras()));
        System.out.println("Base: R$ " + df.format(pf.getBase()));
        System.out.println("Bônus: R$ " + df.format(pf.calcBonus(2025)));

        System.out.println("\n==== Pessoa Jurídica ====");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getGcg());
        System.out.println("Ano de Inscrição: " + pj.getAnoInscricao());
        System.out.println("Total de Compras: R$ " + df.format(pj.getTotalCompras()));
        System.out.println("Taxa de Incentivo: " + pj.getTaxaIncentivo() * 100 + "%");
        System.out.println("Bônus: R$ " + df.format(pj.calcBonus(2025)));
    }
}
