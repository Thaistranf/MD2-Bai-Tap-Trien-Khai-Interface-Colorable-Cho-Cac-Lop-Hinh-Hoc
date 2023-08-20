
public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(6.1f, true);
        squares[1] = new Square(2.6f);
        squares[2] = new Square();

        for (Square square : squares) {
            System.out.println(square);
            square.howToColor();
        }
    }
}