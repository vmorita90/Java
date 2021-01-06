import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int PC, qty;
        double cachorro, xsalada, xbacon, torrada, refri, total;

        cachorro = 4.00;
        xsalada = 4.50;
        xbacon = 5.00;
        torrada = 2.00;
        refri = 1.50;


        //entrada:
        
        PC = teclado.nextInt();
        qty = teclado.nextInt();

        if (PC==1){
            total=cachorro*qty;
        }
        else if (PC==2){
            total=xsalada*qty;
        }
        else if (PC==3){
            total=xbacon*qty;
        }
       else if (PC==4){
            total=torrada*qty;
        }
        else{
            total=refri*qty;
        }
            
        System.out.printf("Total: R$ %.2f\n", total);
          
    }

}