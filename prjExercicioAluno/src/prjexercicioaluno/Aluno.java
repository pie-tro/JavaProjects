package prjexercicioaluno;
/**
 *
 * @author tigri
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(){
        RA = r;
        }
    public void SetNtPrv1(double p1){
        NtPrv1 = p1;
        }
    public void SetNtPrv2(double p2){
        NtPrv2 = p2;
        }
    public void SetNtTrab1(double t1){
        NtTrab1 = t1;
        }
    public void SetNtTrab2(double t2){
        NtTrab2 = t2;
        }
    public int getRA(){
        return(RA);
        }
    public double getNtPrv1(){
        return(NtPrv1);
        }
    public double getNtPrv2(){
        return(NtPrv2);
        }
    public double getNtTrab1(){
        return(NtTrab1);
        }
    public double getNtTrab2(){
        return(NtTrab2);
        }
    public double calcMediaProva(){
     return(0.75*(NtPrv1 + (2* NtPrv2))/3);
    }
    public double calcMediaTrab(){
        return(0.25*(NtTrab1 + NtTrab2)/2);
    }
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }
    public boolean isAprovado(){
        return calcMediaFinal()>=5;
    }
}
