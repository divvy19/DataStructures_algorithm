package leticode_examples;

import java.util.Scanner;

public class wRSubstraction {
    public static void main(String args[]){

        int n=0,a=0,r,i;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    a = sc.nextInt();

    for(i=1 ; i<=a;i++){
        r = n%10;
        if(r ==0 ){
            n/=10;

        }
        else {
            n-=1;
        }
        
    }
    System.out.println(n);

}

}


    

