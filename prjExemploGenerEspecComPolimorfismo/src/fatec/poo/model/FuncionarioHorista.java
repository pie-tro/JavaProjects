package fatec.poo.model;

/**
 *
 * @author tigri
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht){
        super(r, n, dtAdm);
        valHorTrab = vht;
    }
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    public double calcSalBruto(){
        return (valHorTrab * qtdeHorTrab);
    }
    public String getCargo(){
        return "Horista";
    }
    public double calcGratificacao(){
        return calcSalBruto()*7.5/100;
    }
    public double calcSalLiquido(){
        return calcSalBruto()+calcGratificacao()-calcDesconto();
    }
}
