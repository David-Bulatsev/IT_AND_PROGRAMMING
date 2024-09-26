package Labs.lab2;

public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y){
        this.xCoord = x;
        this.yCoord = y;
    }
    public Point2d(){
        this(0, 0);
    }
    public double getY(){
        return yCoord;
    }
    public double getX(){
        return xCoord;
    }
    public void setX(double val){
        this.xCoord = val;
    }
    public void setY(double val){
        this.yCoord = val;
    }
    public class Main {
        public static void main(String[] args) {
            Point2d first2DPoint = new Point2d(0, 5);
            Point3d first3DPoint = new Point3d(1, 2, 3);
            System.out.println(first2DPoint.getX());
            first3DPoint.setX(0);
            System.out.println(first3DPoint.getX());

        }
    }

}

