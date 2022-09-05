public class ShowFigures {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape sphere = new Sphere();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        showShapeName(circle);
        showShapeName(sphere);
        showShapeName(triangle);
        showShapeName(rectangle);
        showShapeName(square);

    }

    private static<T extends Shape> void showShapeName(T t){
        System.out.println(t.getName());
    }
}
