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
        ellipse(xCoordinate1, (float) (HEIGHT * (1.0 / 5)), DIAMETER, DIAMETER);
        ellipse(xCoordinate1 * 2, (float) (HEIGHT * (2.0 / 5)), DIAMETER, DIAMETER);
        ellipse(xCoordinate1 * 3, (float) (HEIGHT * (3.0 / 5)), DIAMETER, DIAMETER);
        ellipse(xCoordinate1 * 4, (float) (HEIGHT * (4.0 / 5)), DIAMETER, DIAMETER);

        xCoordinate1 += 1;
    }
}
