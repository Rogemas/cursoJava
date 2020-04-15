import java.util.Scanner;
public class URI1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        for(; valor!=0 ; valor--){
            int num = teclado.nextInt();
            if (num==0){
                System.out.println("NULL");
            
            } else {
                if (num%2 == 0){
                    if (num>0){
                        System.out.println("EVEM POSITIVE");
                    }else{
                        System.out.println("Even NEGATIVE");
                    }
                }else {
                    if ( num > 0){
                        System.out.println("ODD POSITIVE");
                    }else { 
                        System.out.println("ODD Negative");
                    }
                }
            }
        }
    }
}