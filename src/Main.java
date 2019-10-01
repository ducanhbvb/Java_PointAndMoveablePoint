public class Main {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);

        point2D=new Point2D(2.5f,3.5f );
        System.out.println(point2D);

        MoveablePoint moveablePoint =new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint =new MoveablePoint(2f,2f);
        System.out.println(moveablePoint);

        moveablePoint =new MoveablePoint(2f,2f,2f,3.5f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.mover());
    }
}
