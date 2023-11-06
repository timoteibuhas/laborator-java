package lab5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        /*
        Cat firstCat = new Cat("Tomita","Gri",5);
        Cat secondCat = new Cat("Miti","Negru",2);

        firstCat.play();
        firstCat.feed();
        firstCat.sleep();
        firstCat.miau();

        firstCat.getName();
        firstCat.getColor();
        firstCat.getAge();

         */


    Scanner input=new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Introduceti numele:");
        emp.setName(input.nextLine());

        System.out.println("Introduceti emailul:");
        emp.setEmail(input.nextLine());

        System.out.println("Introduceti hour rate:");
        emp.setHourRate(input.nextInt());

        System.out.println("Introduceti capacity:");
        emp.setCapacity(input.nextInt());

        System.out.println("Introduceti free days:");
        emp.setFreeDays(input.nextInt());
        emp.calculateMonthlyIncome();



    }
}
