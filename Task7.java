
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


class ShapeFactory {
    private Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    public void createShape() {
        shape.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new ShapeFactory(new Circle());
        circleFactory.createShape();

        ShapeFactory rectangleFactory = new ShapeFactory(new Rectangle());
        rectangleFactory.createShape();
    }
}
