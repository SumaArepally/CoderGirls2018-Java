public class CrossStitchWigglePattern extends Pattern {
    public void pattern(){
        Stitch sxStich=new SmallCrossStitch();
           //     SmallCrossStitch.sew();
       Stitch lxStich=new LargeCrossStitch();
            //   LargeCrossStitch.sew();
       for( int i=0;i<5;i++){
           sxStich.sew();
           lxStich.sew();
       }
    }
}
