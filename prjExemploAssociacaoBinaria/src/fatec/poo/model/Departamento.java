/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author tigri
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[];
    private int numFunc = 0; //indica a posi do 1° elemento da matriz
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return sigla;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    public void listarFuncionarios(){
        System.out.println("\n Sigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtd de funcionários: " + numFunc);
        System.out.println("\n Registro\t\tNome\t\tCargo");
        for(int i = 0  ; i < 10 ; i++){
            System.out.print(funcionarios[i].getRegistro()+"\t\t");
            System.out.print(funcionarios[i].getNome()+"\t\t");
            System.out.println(funcionarios[i].getCargo());
        }
    }
    
}
