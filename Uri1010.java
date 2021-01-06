import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int CODE1, QTY1, CODE2, QTY2; 
        float PRICE1, PRICE2, PAYMENT;

        // entrada
        CODE1 = teclado.nextInt();
        QTY1 = teclado.nextInt();
        PRICE1 = teclado.nextFloat();
        CODE2 = teclado.nextInt();
        QTY2 = teclado.nextInt();
        PRICE2 = teclado.nextFloat();
       
              
        // processamento
        PAYMENT = QTY1*PRICE1 + QTY2*PRICE2;


        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", PAYMENT);



    }


}