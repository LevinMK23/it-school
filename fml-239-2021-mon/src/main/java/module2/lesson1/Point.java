package module2.lesson1;

// класс = тип данных
// классы состоят из свойств и методов
// свойство класса - переменная, относящаяся к
// экземпляру класса (переменная внутри класса)

// метод класса - это функция внутри класса
// static - привязка к классу, а не к экземпляру класса
// final - значение нельзя поменять
// модификаторы доступа
// private - внутри класса
// public - везде
// protected - внутри папки а так же для наследников
// пустой - внутри папки
public class Point {

    static int cnt = 0;

    // свойства класса
    private double x;
    private double y;

    // конструктор - специальная функция с именем класса
    public Point() {
        cnt++;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // setters
    // this - ссылка на себя (self)
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // метод класса
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return String.format("(%f; %f)", x, y);
    }
}
