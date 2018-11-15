public class BlocyBaublePattern extends Pattern {
    public void pattern() {

        Stitch bBlockStitch = new BlockStitch();
        //BlockStitch.sew();
        Stitch sShortLineStitch = new ShortLineStitch();
        //ShortLineStitch.sew();
        Stitch cCircleStitch = new CircleStitch();
        //CircleStitch.sew();
        for (int i = 0; i < 5; i++) {
            bBlockStitch.sew();
            sShortLineStitch.sew();
            sShortLineStitch.sew();
            cCircleStitch.sew();
            sShortLineStitch.sew();
            sShortLineStitch.sew();

        }
       // bBlockStitch.sew();
       // bBlockStitch.sew();
    }
}
