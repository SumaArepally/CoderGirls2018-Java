import java.util.Scanner;
import static java.lang.System.out;

public class SandwichShop {
    public static void main(String[] args)
    {
    Scanner keyBoard= new Scanner(System.in);
        int  goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
 out.println("enter todays veggies sales");
        int inputVeggies = keyBoard.nextInt();
 out.println("enter todays burgers sales");
        int inputBurgers = keyBoard.nextInt();
 out.println("enter todays subs sales");
        int inputSubs=keyBoard.nextInt();
 out.println("enter todays soup sales");
        int inputSoaps =keyBoard.nextInt();

    if( inputVeggies >= 50) {
        System.out.println("Made the goal for Veggies!");
    } else {
        System.out.println(" Veggies goal fell short");
    }
    if(  inputBurgers >= 250) {
        System.out.println("Made the goal for Burgers!");
    }else {
        System.out.println("Burgers goal fell short");
    }
    if(inputSubs >= 180){
    System.out.println("Made the goal for Subs!");
    }else {
        System.out.println("Subs goal fell short");
    }
    if(inputSoaps >= 70) {
        System.out.println("Made the goal for Soaps!");
    }else {
        System.out.println("Soaps goal fell short");
    }
    //Final message here
    if((inputVeggies >= 50) & (inputBurgers >= 250) & (inputSubs >= 180) & (inputSoaps >= 70)  ){
        System.out.println("Made goal for everything!");
    }
    else {

    }
    }
    }

