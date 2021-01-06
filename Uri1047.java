import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int sth, stm, eth, etm, durationh, durationmt, durationm,minutesstart,minutesend;
                
        sth = teclado.nextInt();
        stm = teclado.nextInt();
        eth = teclado.nextInt();
        etm = teclado.nextInt();

        minutesstart = sth*60 + stm;
        minutesend = eth*60 + etm;    

        if(minutesstart>minutesend){
            durationmt = minutesend+(24*60-minutesstart);
        }
        else if(minutesend==minutesstart){
            durationmt = 24*60;
        }
        else{
            durationmt = minutesend-minutesstart;
        }           
  
        durationh = durationmt/60;
        durationm = durationmt%60;

        System.out.printf("O JOGO DUROU %d HORA(S) e %d MINUTO(S)\n", durationh, durationm);

    }


}
