/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author pietr
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String n, String Cgc, int ano){
        super(n,ano);
        cgc = Cgc;
    }
    
    @Override
    public double calcBonus(int ano){
        return (getTotalCompras()*taxaIncentivo)*(ano-getAnoInscricao());
    }
    public void setTaxaIncentivo(double tax){
        taxaIncentivo = tax;
    }
    public String getGcg(){
        return cgc;
    }
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
}
