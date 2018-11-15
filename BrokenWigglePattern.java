public class BrokenWigglePattern extends Pattern {
    public void pattern(){
        Stitch sSmallCrossStitch=new SmallCrossStitch();
                //SmallCrossStitch.sew();
        Stitch lLargeCrossStitch=new LargeCrossStitch();
                //LargeCrossStitch.sew();
        for( int i=0;i<5; i++){
            sSmallCrossStitch.sew();
            lLargeCrossStitch.sew();
        }



    }
}
