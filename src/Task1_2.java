import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/*Вычислить значение выражения по формуле*/
public class Task1_2 {

    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input 3 real numbers A B C as arguments";
        if (args.length >= 3) { //проверка количества введенных аргументов
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                double result = (b + (sqrt(pow(b, 2) + 4 * a * c))) / (2 * a) - pow(a, 3) * c + pow(b, -2);
                if (!Double.isNaN(result)) { //возможно извлечение квадратного корня из отрицательного числа
                    System.out.println(result);
                } else {
                    System.out.println("Result is not a real number");
                }
            } catch (NumberFormatException e) {
                System.out.println(WARN_MESSAGE);
            }
        } else {
            System.out.println(WARN_MESSAGE);
        }
}
}
