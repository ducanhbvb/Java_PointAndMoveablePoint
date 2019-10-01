public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0f;
        this.y = 0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }
    @Override
    public String toString(){
        return " A Point2D with X="
                + getX()
                + ", A Point2D with Y="
                + getY();
    }
}