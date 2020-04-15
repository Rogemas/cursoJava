import java.util.Scanner;

public class Salario{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);
    float Salario, imposto, sal_liq;

    /* entrada */
    System.out.println("Por favor, digite o salario: ");
    salario = teclado.nextFloat();

    /* processamento */
    imposto = salario * 15%;
    sal_liq = salario - imposto;

    /* saida */
    System.out.printf("Salario Bruto           R$ %10.2f \n",salario_Bruto);
    System.out.printf("Imposto                 R$ %10.2f \n",imposto);
    System.out.printf("Sal_liq                 R$ %10.2f \n",sal_liq);

    //System.out.prinln("Salario Bruto      R$ "+salario);
    //System.out.prinln("Imposto            R$ "+Imposto);
    //System.out.prinln("Salario Liquuido   R$ "+sal_liq);

    }
}