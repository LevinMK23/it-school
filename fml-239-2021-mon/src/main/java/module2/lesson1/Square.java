package module2.lesson1;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(new Point(0, 0), new Point(side, side));
        this.side = side;
    }

}
