/**
 *
 * @author pietr
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
       public Livro(int iden, String tit) {
        identificacao = iden;
        titulo = tit;
        situacao = false; // sempre começa disponível
        valMultaDiaria = 2.0; // exemplo de valor padrão por dia
    }
    public void setValMultaDiaria(double VMult){
        valMultaDiaria = VMult;
    }
    public int getIdentificacao(){
        return (identificacao);
    }
    public String getTitulo(){
        return (titulo);
    }
    public boolean getSituacao(){
        return (situacao);
    }
    public void emprestar(){
        situacao = true;
    }
    public double devolver(int dias){
        situacao = false;
        return valMultaDiaria * dias;
    }
  }
