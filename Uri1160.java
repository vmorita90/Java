import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int T, cont=0, tempo=0, PA, PB;
        double G1=0.0, G2=0.0;

        T=teclado.nextInt();

        do{
           tempo=0;
            PA=teclado.nextInt();
            PB=teclado.nextInt();
            G1=teclado.nextDouble();
            G2=teclado.nextDouble();

        cont++;
        
            while(PA<=PB && tempo<=100){
                
                PA=(int)(PA*(1+G1/100.0));
                PB=(int)(PB*(1+G2/100.0));
                tempo++;
            }
            if(tempo>100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
            System.out.printf("%d anos.\n", tempo);
            }
            
    
                
        } while(cont!=T);
        

    }

}