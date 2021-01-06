import java.util.Scanner;

public class Uri1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        String mes;
        

        //entrada:
        
        N = teclado.nextInt();


        if (N==1){
            mes="January";
        }
        else if (N==2){
            mes="February";
        }
        else if (N==3){
            mes="March";
        }
       else if (N==4){
            mes="April";
        }
        else if (N==5){
            mes="May";
        }
        else if (N==6){
            mes="June";
        }
       else if (N==7){
            mes="July";
        }
       else if (N==8){
            mes="August";
        }
        else if (N==9){
            mes="September";
        }
       else if (N==10){
            mes="October";
        }
       else if (N==11){
            mes="November";
        }
        else{
            mes="December";
        }
            
        System.out.printf("%s\n",mes);

          
    }

}