package design_patterns.factory_method;

public abstract class Shape {

    public static final Triangle TRIANGLE = new Triangle();

    public static final Square SQUARE = new Square();

    public static final Pentagon PENTAGON = new Pentagon();

    protected abstract void draw();

    public static final void draw(int noOfVertices) {
        switch(noOfVertices) {
            case 3:
                TRIANGLE.draw();
                break;
            case 4:
                SQUARE.draw();
                break;
            case 5:
                PENTAGON.draw();
                break;
            default:
                System.out.println("Shape not known");;
        }
    }

}
