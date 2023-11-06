package lab5;

public class Main {

    public static void main(String[] args){
        Cat firstCat = new Cat("Tomita","Gri",5);
        Cat secondCat = new Cat("Miti","Negru",2);

        firstCat.play();
        firstCat.feed();
        firstCat.sleep();
        firstCat.miau();

    }
}
