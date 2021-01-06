import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int DDD;
        String cidade;
        

        //entrada:
        
        DDD = teclado.nextInt();


        if (DDD==61){
            cidade="Brasilia";
        }
        else if (DDD==71){
            cidade="Salvador";
        }
        else if (DDD==11){
            cidade="Sao Paulo";
        }
       else if (DDD==21){
            cidade="Rio de Janeiro";
        }
        else if (DDD==32){
            cidade="Juiz de Fora";
        }
        else if (DDD==19){
            cidade="Campinas";
        }
       else if (DDD==27){
            cidade="Vitoria";
        }
       else if (DDD==31){
            cidade="Belo Horizonte";
        }
        else{
            cidade="DDD nao cadastrado";
        }
            
        System.out.printf("%s\n",cidade);

          
    }

}