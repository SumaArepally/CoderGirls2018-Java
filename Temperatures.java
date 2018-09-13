import static java.lang.System.out;
public class Temperatures {
public static void main(String[]args)  {
int temp[][]  ={{68,70,76,70,68,71,75},{76,76,87,84,82,75,83},{73,72,81,78,73,77},{64,65,69,70,74,72}};
String time[]= {"7:00 AM", "3:00PM","7:00PM","3:00AM"};
String days[]= {"sun","mon","tue","wed","thu","fri","sat"};
int timesumArr[] = new int[4];
int daySumArr[] = new int[7];
int timesum = 0, daysum = 0,tot = 0;
out.println("temperature calculator\n");
out.println("the data provided are:");
for (int r=0; r<time.length; r++){
    out.print(time[r] + ":");
int c;
for (c=0; c<7; c++) {
    timesum += temp[r][c];
    out.print(c == 6 ? temp[r][c] : temp[r][c] + ",");
    /* if (c==6)
    out.print(temp[r][c];
    else
    out.print(temp[r][c] + ",");/*

     }*/

}
timesumArr[r] = (timesum/(c));
timesum = 0;
out.println();
}
for (int c=0; c<7; c++) {
    for (int r = 0; r < 4; r++) {
        daysum += temp[r][c];
        tot += temp[r][c];
    }
    daySumArr[c] = daysum / 4;
    daysum = 0;
}
out.println("\nbased on that date, the following are the average temperatures for the week.\n");
printMethod(days,daySumArr);
printMethod(time,timesumArr);
out.println("the final averagetemperaturefor weeek was:\n");
out.println("overal:" + (tot/7 *4));
}
public static void printMethod(String printArray[],int sumArr[]){
    for (int i =0;i<printArray.length;i++){
        out. println(printArray[i]+":"+(sumArr[i]));
    }
        out.println();
}
}


