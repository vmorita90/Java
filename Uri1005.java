import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, MEDIA, p1, p2;

        // entrada
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        p1 = 3.5;
        p2 = 7.5;
        
        
        // processamento
        MEDIA = (A*p1 + B*p2)/(p1+p2);


        // saída
        System.out.printf("MEDIA = %.5f%n",MEDIA);


    }


}