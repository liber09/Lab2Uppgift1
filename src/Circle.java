public class Circle extends Shape implements Comparable<Circle>{
    double radius;

    public Circle(Double radius){
        this.radius = radius;
    }
    public double getDiameter() {
        return radius;
    }

    public void setRadius(double value){
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

    @Override
    public int compareTo(Circle anotherCircle) {
        return (int) (this.getArea()-anotherCircle.getArea());
    }
}
