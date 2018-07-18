import java.util.Scanner;
public class GroceryBill {
    public static void main(String[] args)
    {
        System.out.println("Please list three items on your grocery shopping list.");
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("What is item 1: ?");
            String item1=keyBoard.next();
        System.out.println("What is item 2: ?");
            String item2=keyBoard.next();
        System.out.println("What is item 3: ?");
            String item3=keyBoard.next();

        System.out.println("Now, please enter the quantity of each item");
        System.out.println("How many "+item1+"?");
        int n1=keyBoard.nextInt();
        System.out.println("How many "+item2+"?");
        int n2=keyBoard.nextInt();
        System.out.println("How many "+item3+"?");
        int n3=keyBoard.nextInt();

        System.out.println("Now, please enter the price of each item");
        System.out.println("How much does one "+item1+" cost?");
        float p1=keyBoard.nextFloat();
        System.out.println("How much does one "+item2+" cost?");
        float p2=keyBoard.nextFloat();
        System.out.println("How much does one "+item3+" cost?");
        float p3=keyBoard.nextFloat();

        System.out.println("Calculating your total grocery bill");
        System.out.println("Your total cost is: $"+ ((n1*p1)+(n2*p2)+(n3*p3)));
    }
}
