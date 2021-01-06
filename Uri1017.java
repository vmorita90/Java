import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int TIME, SPEED, DISTANCE;
        double LITERS,CONSUMPTION;

        // entrada
        TIME = teclado.nextInt();
        SPEED = teclado.nextInt();
        CONSUMPTION = 12.0;
        
        DISTANCE = TIME*SPEED;
        
        // processamento
        LITERS = (DISTANCE/CONSUMPTION);
        
   

        // saída
        System.out.printf("%.3f%n",LITERS);
       

    }


}