class Triangle implements Shape {
    private double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String getShapeName() {
        return "Triangle";
    }

    public void displayInfo() {
        System.out.println(getShapeName() + " 三边：" + a + "," + b + "," + c +
                " 面积：" + calculateArea() +
                " 周长：" + calculatePerimeter());
    }
}
