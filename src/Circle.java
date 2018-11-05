public class Circle {
    private double radius = 3.5;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }

    public double getPerimeter(){
        return getRadius()*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + getRadius() + " and color = " + getColor();
    }
}
