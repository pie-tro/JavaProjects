
/**
 *
 * @author Pietro
 */
public class Retangulo {
    private double altura;
    private double base;
    
    //tem como parâmetro a medida da altura    
    public void setAltura(double a){
        altura = a;
    }
    
    //retorna o conteúdo do atributo altura
    public double getAltura(){
        return(altura);
    }
    
    //tem como parâmetro a medida da base  
    public void setBase(double b){
        base = b;
    }
    
    public double getBase(){
        return(base);
    }
     
    public double calcArea(){
        return(altura * base);
    }
    
    public double calcPerimetro(){
        return(2 * (altura + base));
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(altura, 2) + (Math.pow(base, 2))));
    }
}
