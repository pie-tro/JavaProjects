/**
 *
 * @author tigri
 */
public class Circulo {
    private double raio;
    private String unidadeMedida;
    
    public Circulo(String uniMed){
        unidadeMedida=uniMed;
    }
    public String getUnidadeMedida(){
        return(unidadeMedida);
    }
    
    public void setRaio(double r){
        raio = r;
    }
    public double getRaio(){
        return(raio);
    }
    public double calcArea(){
        return(Math.pow(raio,2)*Math.PI);
    }
    public double calcPerimetro(){
        return(2*Math.PI*raio);
    }
    public double calcDiametro(){
        return(2*raio);
    }
}
