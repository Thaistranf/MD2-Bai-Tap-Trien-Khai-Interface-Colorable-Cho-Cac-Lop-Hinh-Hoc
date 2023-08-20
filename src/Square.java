public class Square implements Colorable{
    private boolean colorable = false;
    private double size;
    public Square(){

    }
    public Square(double size){
        this.size = size;
    }
    public Square(double size, boolean colorable){
        this.size = size;
        this.colorable = colorable;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return (Math.pow(getSize(), 2));
    }
    @Override
    public String toString() {
        return "Square{" +
                "size = " + size +
                ", area = " + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        if (this.colorable){
            System.out.println("Color all four sides..");
        }
    }
}
