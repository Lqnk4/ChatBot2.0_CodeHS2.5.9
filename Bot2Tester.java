import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.print("Hello. What is your name? ");
       String name = in.nextLine();
       System.out.println(name);
       
       Bot2 b2 = new Bot2(name);
       
       b2.greeting();
       
       System.out.println("What is your favorite animal?");
       String animal = in.nextLine();
       System.out.println(animal + "\n");
       
       b2.favoriteAnimal(animal);
       
       System.out.println("Where do you live?");
       String location = in.nextLine();
       System.out.println(location);
       
       b2.home(location);
       
       System.out.println("WHat is your favorite number?");
       int num = Integer.parseInt(in.nextLine());
       
       b2.favoriteNumber(num);
       
       b2.goodbye();
       
       in.close();
    }
}