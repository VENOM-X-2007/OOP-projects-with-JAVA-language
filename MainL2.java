public class MainL2{
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("Black");
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
        System.out.println(c1.toString());
    }
}
