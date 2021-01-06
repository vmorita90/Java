
/*
//(1) if B is greater than C 
//and 
//(2) D is greater than A 
//and 
//(3) if the sum of C and D is greater than the sum of A and B 
//and 
//(4) if C and D were positives values 
//and 
//(5) if A is even, write the message 
//Valores aceitos (Accepted values). Otherwise, write the message Valores nao aceitos (Values not accepted) */


import java.util.Scanner;

public class Uri1035{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);



int A,B,C,D;

A = teclado.nextInt();
B = teclado.nextInt();
C = teclado.nextInt();
D = teclado.nextInt();

if(B > C && D > A && C+D > A+B && C>0 && D>0 && A%2 == 0){
System.out.println("Valores aceitos");
}
else{
System.out.println("Valores nao aceitos");
    }
    }
}

