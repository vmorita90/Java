import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int NUMBER, HOURS; 
        float PAYMENT, SALARY;

        // entrada
        NUMBER = teclado.nextInt();
        HOURS = teclado.nextInt();
        PAYMENT = teclado.nextFloat();
       
              
        // processamento
        SALARY = HOURS*PAYMENT;


        // saída
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);



    }


}