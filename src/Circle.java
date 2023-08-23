public class Circle extends Shape {
    double radius;

    public double getDiameter() {
        return radius;
    }

    public void setDiameter(double value){
        this.radius = value;
    }

    //Method that calculates the area of the circle 
    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    //Method that calculates the perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
