public class Circle {
    private double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double getRadius() {
        return radius;
    }
 
    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    public double liceNaKrug(double radius){
        double s=1;
        s=3.14*radius*radius;
        return s;
    }
}
