package com.company;

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

        out.println("Checking the sales goals.");
            out.println("The sales goal for veggie sandwiches is "+goalForVeggies );
            out.println("How many veggie sandwiches were sold today?");
            int inputVeggies = keyBoard.nextInt();
                if( inputVeggies >= 50) {
                    System.out.println("Made the goal for Veggies!\n");
                } else {
                    System.out.println(" Veggies goal fell short\n");
                }


        out.println("The sales goal for burgers is "+goalForBurgers );
        out.println("How many burgers were sold today?");
        int inputBurgers = keyBoard.nextInt();
            if(  inputBurgers >= 250) {
                System.out.println("Made the goal for Burgers!\n");
            }else {
                System.out.println("Burgers goal fell short\n");
            }

        out.println("The sales goal for sub is "+goalForSubs );
        out.println("How many subs were sold today?");
        int inputSubs=keyBoard.nextInt();
            if(inputSubs >= 180){
                System.out.println("Made the goal for Subs!\n");
            }else {
                System.out.println("Subs goal fell short\n");
            }

        out.println("The sales goal for soup is "+goalForSoup );
        out.println("How many soups were sold today?");
        int inputSoup =keyBoard.nextInt();

            if(inputSoup >= 70) {
                System.out.println("Made the goal for Soup!\n");
            }else {
                System.out.println("Soups goal fell short\n");
            }
    //Final message here
    if((inputVeggies >= 50) & (inputBurgers >= 250) & (inputSubs >= 180) & (inputSoup >= 70)  ){
        System.out.println("Made goal for everything!");
        }
        else {
            //show nothing if above conditions not met
        }
    }
    }

