package fatec.poo.model;

/**
 *
 * @author tigri
 */
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dta, double vsm){
        super(r, n, dta);
        valSalMin = vsm;
    }
    
    public void setNumSalMin(double nsm){
        numSalMin = nsm;
    }
    public double calcSalBruto(){
        return valSalMin * numSalMin;
    }
    public String getCargo(){
        return "Mensalista";
    }
}
