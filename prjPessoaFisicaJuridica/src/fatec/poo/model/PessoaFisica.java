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
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;
    
    public PessoaFisica(String n, String CPF, int ano){
        super(n,ano);
        cpf = CPF; 
    }
    @Override
    public double calcBonus(int ano){
        double bonus = 0;
        if(getTotalCompras()>12000){
           bonus = (ano - getAnoInscricao())*base;
       }
        return bonus;
    }
    public String getCpf(){
        return cpf;
    }
    public void setBase(double B){
        base = B;
    }
    public double getBase(){
        return base;
    }
}
