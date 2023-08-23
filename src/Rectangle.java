public class Rectangle extends Shape implements Comparable<Rectangle> {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Method that calculates the area of the rectangle
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    //Method that calculates the perimeter of the rectangle
    @Override
    public double getPerimeter() {
        return getWidth()+getWidth()+getHeight()+getHeight();
    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }

    @Override
    public int compareTo(Rectangle anotherRectangle) {
        return (int) (this.getArea()-anotherRectangle.getArea());
    }
}
