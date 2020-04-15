import java.util.Sccaner;
public class Exercicio20{
    public static void main(String args []){
         Scanner teclado = new Scnner(System.in);
        int sexo;
        float altura, peso;

        System.out.println("Digit 1 - Masculino ou 2 - Feminino");
        sexo = teclado.nextInt();
        System.out.println("Digite a Altura");
        altura = teclado.nextFloat();
        if (sexo == 1){
            peso = 72.7f * altura - 58;
        }
        else{
        peseo = 62.1F * altura - 44
        }

        system.out.println("Seu peso ideal deveria ser"+peso)
    }
}