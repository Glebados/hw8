package Module8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rhombus rhombus = new Rhombus();
        Oval oval = new Oval();

        ShapeTester shapeTester = new ShapeTester();
        shapeTester.getShapeName(circle);
        shapeTester.getShapeName(quad);
        shapeTester.getShapeName(triangle);
        shapeTester.getShapeName(rhombus);
        shapeTester.getShapeName(oval);
    }
}
