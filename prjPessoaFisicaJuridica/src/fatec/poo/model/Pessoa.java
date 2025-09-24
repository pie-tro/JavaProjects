package fatec.poo.model;
/**
 *
 * @author pietr
 */
public abstract class Pessoa {
   private String nome;
   private int anoInscricao;
   private double totalCompras;
   
   public Pessoa(String n, int ano){
       nome = n;
       anoInscricao = ano;
   }
   
   abstract public double calcBonus(int b);    
  
   public void addCompras(double VCompra){
       totalCompras =+ VCompra;
   }
   public String getNome(){
       return nome;
   }
   public int getAnoInscricao(){
       return anoInscricao;
   }
      public double getTotalCompras(){
       return totalCompras;
   }
}
