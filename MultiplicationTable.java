import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the size of table");
        int size = keyboard.nextInt();

        for(int x=0; x<=size; x++){
            for (int y=0; y<=size; y++){
                int z = x *y;
                System.out.println(x+"*"+y+"="+z);
            }
        }

    }
}
