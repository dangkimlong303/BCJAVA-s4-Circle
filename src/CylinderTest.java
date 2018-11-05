public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(10);
        cylinder.setRadius(2);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder);

        cylinder = new Cylinder(5.4,"blue",7);
        System.out.println(cylinder);
    }
}
