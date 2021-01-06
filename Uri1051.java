import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double income, tax, taxf1=0.0, taxf2=0.0, taxf3=0.0;
        

        income = teclado.nextDouble();

           
  

        if(income>=0.000 && income<=2000.000){
            System.out.println("Isento");
            
           }
        else if(income>=2000.010 && income<=3000.000){
            taxf1 = (income-2000.000)*0.080;
            System.out.printf("R$ %.2f\n", taxf1);

        }
        else if(income>=3000.010 && income<=4500.00){
            taxf2 = (income - 3000.010)*0.180;
            taxf1 = (3000.000 - 2000.010)*0.080;
            tax=taxf1+taxf2;
            System.out.printf("R$ %.2f\n", tax);
        }
        else{
            taxf1 = (1000)*0.080;
            taxf2 = (1500)*0.180;
            taxf3 = (income-4500.01)*0.280;
            tax=taxf1+taxf2+taxf3;
            System.out.printf("R$ %.2f\n", tax);
        }

                

    }


}
