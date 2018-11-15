public class BaublePattern  extends Pattern{
    public void pattern(){
        Stitch sShortLineStitch=new ShortLineStitch();
                //ShortLineStitch.sew();
        Stitch cCircleStitch=new CircleStitch();
                //CircleStitch.sew();
        for(int i=0;i<5;i++){
            sShortLineStitch.sew();
            sShortLineStitch.sew();
            cCircleStitch.sew();
        }
    }

}
