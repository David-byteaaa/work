class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public String getShapeName() {
        return "Circle";
    }

    public void displayInfo() {
        System.out.println(getShapeName() + " 半径：" + radius +
                " 面积：" + calculateArea() +
                " 周长：" + calculatePerimeter());
    }
}
