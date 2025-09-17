package fatec.poo.model;

/**
 *
 * @author pietr
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dta, double Tc){
        super(r, n, dta);
        taxaComissao = Tc;
    }
    public void setSalBase(double Sb){
        salBase = Sb;
    }
      public double getSalBase() {
        return salBase;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void addVendas(double v) {
        totalVendas += v;
    }
    
    @Override
    public double calcSalBruto() {
        return salBase + (taxaComissao / 100 * totalVendas);
    }
    public double calcGratificacao() {
        if (totalVendas > 10000) {
            return calcSalBruto() * 0.05; 
        } else if (totalVendas > 5000) {
            return calcSalBruto()  * 0.03; 
        }
        return 0;
    }
    @Override
    public double calcSalLiquido() {
        return super.calcSalLiquido()+calcGratificacao();
    }
}
