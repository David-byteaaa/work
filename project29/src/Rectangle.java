class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public String getShapeName() {
        return "Rectangle";
    }

    public void displayInfo() {
        System.out.println(getShapeName() + " 宽：" + width + " 高：" + height +
                " 面积：" + calculateArea() +
                " 周长：" + calculatePerimeter());
    }
}
