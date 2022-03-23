import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;
    public static final float DIAMETER = 20;
    public static float xCoordinate1 = 0;

    public static void main(String[] args) {
        String[] appletArgs = new String[]{"TryProcessing"};
        PApplet.main(appletArgs);
    }

    @Override
    public void setup() {
        super.setup();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(1);
        drawCircle(2);
        drawCircle(3);
        drawCircle(4);

    }

    private void drawCircle(int value) {
        ellipse(xCoordinate1 * value, (float) (HEIGHT * (value/ 5.0)), DIAMETER, DIAMETER);
        xCoordinate1 += 1;
    }

}
