public class ZigZigLinesPattern extends Pattern {
    public void pattern(){
        Stitch zzStitch=new ZigZagStitch();
               // ZigZagLinesStitch.sew();
        Stitch fStitch=new FillStitch();
                //FillStitch.sew();
        for(int i=0;i<2;i++){
            zzStitch.sew();
            zzStitch.sew();
            zzStitch.sew();
            for(int j=0;j<1;j++){
              fStitch.sew();
               fStitch.sew();
                fStitch.sew();
            }
            //fStitch.sew();

        }
    }

}
