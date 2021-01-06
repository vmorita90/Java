import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, HOURS, HOURSR,MIN, SEC, MIN2;

        // entrada
        N = teclado.nextInt();
    
        // processamento
        
        HOURS = N/3600;
        HOURSR = N%3600;
        MIN = (HOURSR/60);
        SEC = N%60;

        // saída
        System.out.println(HOURS+":"+MIN+":"+SEC);


    }


}