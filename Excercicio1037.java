import java.util.Sccaner;
public class Exercicio1037{
    public static void main(String args []){

        Scaner teclado = new Scanner(Systen.in);

        double valor;

        //System.out.print(" Digite um valor? " );
        valor = teclado.nextFloat();

        1F (valor >0 && valor<=25){
            System.out.println("Intervalo (0,25]");
        }
        else if (valor=>25 && valor<=50){
            System.out.println("Intervalo (25,50]");
        }
        else if (valor>50 && valor<=75){
            system.out.println("Intervalo (50,75]");
        }
        else if (valor>50 && valor<=75){
            system.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora do Intervalo");
        }
    } 
}    