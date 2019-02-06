public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return (width * length);
    }

    public double getDiagonal(){
        return Math.hypot(width, length);
    }

    public boolean isSquare(){
        if(width == length){
            return true;
        }else {
            return false;
        }
    }
}
