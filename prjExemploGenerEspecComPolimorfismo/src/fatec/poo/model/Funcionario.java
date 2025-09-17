package fatec.poo.model;

/**
 *
 * @author tigri
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return (0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    public int getRegistro(){
        return registro;
    }
    public String getNome(){
        return nome;
    }
    public String getDtAdmissao(){
        return dtAdmissao;
    }
     public String getCargo(){
        return(cargo);
    }
    public void setCargo(String c){
        cargo = c;
    }
}
