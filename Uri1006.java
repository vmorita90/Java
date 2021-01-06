import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, MEDIA, p1, p2, p3;

        // entrada
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
        p1 = 2;
        p2 = 3;
        p3 = 5;
        
        
        // processamento
        MEDIA = (A*p1 + B*p2 + C*p3)/(p1+p2+p3);


        // saída
        System.out.printf("MEDIA = %.1f%n",MEDIA);


    }


}