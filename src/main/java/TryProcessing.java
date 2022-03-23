import processing.core.PApplet;

public class TryProcessing extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;

    public static void main(String[] args) {
        String[] appletArgs = new String[]{"TryProcessing"};
        PApplet.main(appletArgs);
    }

    @Override
    public void setup() {
        super.setup();
        size(WIDTH, HEIGHT);
    }


}
