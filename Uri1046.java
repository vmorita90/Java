import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int st, et, duration;
                
        st = teclado.nextInt();
        et = teclado.nextInt();

        if(st>et){
            duration = et+(24-st);
        }
        else if(et==st){
            duration = 24;
        }
        else{
            duration = et-st;
        }           
  

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);

    }


}
