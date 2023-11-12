package lab3;

import java.util.Scanner;

public class Main {
    public static void elem_comune(String[] sir1, String[] sir2){
        for (int i=0;i<sir1.length;i++)
            for (int j=0;j<sir2.length;j++)
                if (sir1[i].equals(sir2[j]))
                    System.out.println(sir1[i]);
    }
    public static void nr_prime(int[] sir)
    {
        boolean ok;
        for (int i=0;i< sir.length;i++) {
            ok=true;
            for (int j=2;j<=sir[i]/2;j++){
                if (sir[i]%j==0)
                    ok=false;
            }
            if (ok)
                System.out.println(sir[i]);
        }
    }
    public static void fibonacci(int n){
        int a=0,b=1,c=1;
        System.out.println(a);
        System.out.println(b);
        while (c<n){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
    public static void palindrom(String s){
        String newstr="";
        for (int i=0;i<s.length();i++){
            newstr=s.charAt(i) + newstr;
        }
        System.out.println(newstr);
    }
    public static void main(String[] args)
    {

        String []sir1={"java","test","university"};
        String []sir2={"car","university","plane"};
        elem_comune(sir1,sir2);
        int[] nr={3,4,5,6,7,8,9,10};
        nr_prime(nr);
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu un nr: ");
        int n=input.nextInt();
        fibonacci(n);
        palindrom("cuvant");


    }
}
