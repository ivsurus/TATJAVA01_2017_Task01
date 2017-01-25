import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов
 */

public class Task1_3 {

    public static void main(String[] args) {

        final String WARN_MESSAGE = "Input correct length of legs of a right triangle as arguments";

        if (args.length >= 2) { //проверка количества введенных аргументов
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);

                if ((a > 0) && (b > 0)) { // правильность введения катетов треугольника
                    double area = a * b / 2;
                    double perimeter = a + b + sqrt(pow(a, 2) + pow(b, 2));
                    System.out.println("area: " + area);
                    System.out.println("perimeter: " + perimeter);
                } else {
                    System.out.println(WARN_MESSAGE);
                }
            } catch (NumberFormatException e) {
                System.out.println(WARN_MESSAGE);
            }
        }
        else {
            System.out.println(WARN_MESSAGE);
        }
    }
}
