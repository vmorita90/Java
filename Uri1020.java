import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, anos, meses, dias;
        

        // entrada
        N = teclado.nextInt();
    
        // processamento
        
        anos=N/365;
        meses=(N%365);
        dias=(meses%30);
        
   

        // saída
        
        System.out.println(anos+" ano(s)");
        System.out.println(meses/30+" mes(ses)");
        System.out.println(dias+" dia(s)");



    }


}