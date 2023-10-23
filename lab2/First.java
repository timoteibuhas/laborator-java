package lab2;

public class First {
    public static void main(String[] args){
       int sir[]={15,17,18,19,20};
       boolean ok;
       for (int i=0;i<sir.length;i++){
           ok=true;
           for (int j=2;j<sir[i]/2;j++)
               if (sir[i] % j == 0)
                   ok=false;
           if (ok)
               System.out.println(sir[i]);

       }

    }
}
