// Parent class
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Drawing a shape with color: " + color);
    }

    public static void main(String[] args) {
        // Creating objects
        Shape shape = new Shape("Red");
        Circle circle = new Circle("Blue", 5.0);

        
        System.out.println("Shape color: " + shape.getColor());
        shape.draw();

       
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle radius: " + circle.getRadius());
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());
    }
}

// Child class inheriting from Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


