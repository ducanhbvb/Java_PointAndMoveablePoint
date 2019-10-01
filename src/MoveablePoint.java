public class MoveablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
        this.xSpeed = 10f;
        this.ySpeed = 10f;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = getXSpeed();
        array[1] = getYSpeed();
        return array;
    }
    public String mover() {
        //float[] array = new float[2];
        setXSpeed(++this.xSpeed);
        setYSpeed(++this.ySpeed);
//        array[0] = getXSpeed();
//        array[1] = getYSpeed();
        return (" Speed x= "+getXSpeed()+" Speed y= "+getYSpeed());
    }
    @Override
    public String toString() {
        return " A MoveablePoint with xSpeed="
                + getXSpeed()
                + ", A MoveablePoint with ySpeed="
                + getYSpeed()
                + super.toString();
    }


}