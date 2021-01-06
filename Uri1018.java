import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, cem, cinquenta, vinte, dez, cinco, dois, um;
        

        // entrada
        N = teclado.nextInt();
    
        // processamento
        
        cem=N/100;
        cinquenta=(N%100);
        vinte=(cinquenta%50);
        dez=(vinte%20);
        cinco=(dez%10);
        dois=(cinco%5);
        um=(dois%2);
   

        // saída
        System.out.println(N);
        System.out.println(cem+" nota(s) de R$ 100,00");
        System.out.println(cinquenta/50+" nota(s) de R$ 50,00");
        System.out.println(vinte/20+" nota(s) de R$ 20,00");
        System.out.println(dez/10+" nota(s) de R$ 10,00");
        System.out.println(cinco/5+" nota(s) de R$ 5,00");
        System.out.println(dois/2+" nota(s) de R$ 2,00");
        System.out.println(um+" nota(s) de R$ 1,00");


    }


}