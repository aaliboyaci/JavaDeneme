import java.util.Scanner;


public class multipleclasstest {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        outsideclass1 outsideclassObject = new outsideclass1();

        System.out.println("Enter your name:");
        String name = input.nextLine();

        outsideclass1.simpleMessage(name);

        input.close();

        
    } 

}
