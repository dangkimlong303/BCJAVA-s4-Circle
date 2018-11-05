public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(5.5);
        circle.setColor("blue");
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle);
    }
}
