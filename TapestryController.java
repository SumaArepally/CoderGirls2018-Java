import  java.lang.Object;
import java. util.ArrayList;
public class TapestryController {
    public static void main( String[]args){
        Pattern xCrossStitchWigglePattern=new CrossStitchWigglePattern();
        Pattern zZigZagLinesPattern= new ZigZigLinesPattern();
        Pattern bBaublePattern=new BaublePattern();
        Pattern bBlocyBoublePattern=new BlocyBaublePattern();
        Pattern bBrokenWigglePattern=new BrokenWigglePattern();

        for (int i=0;i<3;i++){

            for (int j=0;j<8;j++){
                xCrossStitchWigglePattern.pattern();
                System.out.print("\t");
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){

            for (int j=0;j<8;j++){
                zZigZagLinesPattern.pattern();
                System.out.print("\t");
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){

            for (int j=0;j<8;j++){
                bBaublePattern.pattern();
                System.out.print("\t");
            }
            System.out.println();
        }

        for (int i=0;i<3;i++){

            for (int j=0;j<8;j++){
                bBlocyBoublePattern.pattern();
                System.out.print("\t");
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){

            for (int j=0;j<8;j++){
                bBrokenWigglePattern.pattern();
                System.out.print("\t\t");
            }
            System.out.println();
        }




        //ArrayList <String> aStitch=new ArrayList<>();
        //aStitch.add(xCrossStitchWigglePattern);
        //aStitch.add(zZigZagLinesPattern);
        //aStitch.add(bBaublePattern);
        //aStitch.add(bBlockyBoublePattern);
        //aStitch.add(bBrokenWigglePattern);
        //System.out.println("Stitch"+aStitch.toString());
       // Pattern[]Stitching = {CrossStitchWigglePattern,ZigZagLinesPattern,BaublePattern,BlockyBoublePattern,BrokenWigglePattern};
       // System.out.println();

       // Stitching[1]=ZigZagLinesPattern;
       // Stitching[2]=BaublePattern;
       // Stitching[3]=BlockyBoublePattern;
       // Stitching[4]=BrokenWigglePattern;

       // for(int i=0;i<3;i++){
         //   for(int j=0;j<8;j++)
         //       System.out.println();
         //   System.out.println();
         //   System.out.println();
          //  for(int x=0; x<8;x++){
           //     for(int j=0;j<6;j++);

            //}
        //}
    }
}
