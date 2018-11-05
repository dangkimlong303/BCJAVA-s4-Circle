import java.lang.reflect.Member;

public class Cylinder extends Circle {
    private double height = 6;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius()*getHeight();
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*(getHeight()+getRadius());
    }

    public double getVolume(){
        return Math.PI*Math.pow(getRadius(),2)*getHeight();
    }

    @Override
    public String toString() {
        return "A Cylinder with height= " + getHeight() + " and radius= " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
