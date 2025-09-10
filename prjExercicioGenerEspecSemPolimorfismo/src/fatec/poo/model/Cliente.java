package fatec.poo.model;

/**
 *
 * @author tigri
 */
public class Cliente extends Pessoa{
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String n, String tel, String C){
        super(n, tel);
        cpf = C;
    }
    public void setPeso(double p){
        peso = p;
    }
    public void setAltura(double alt){
        altura = alt;
    }
    public String getCpf(){
        return cpf;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    public double calcImc(){
        return peso/Math.pow(altura,2);
    }
}
