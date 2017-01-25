import static java.lang.Math.pow;

/*Даны 3 действительных числа. Возвести в квадрат те из них, значения которых
 неотрицательны, и в четвертую степень - отрицательные
  */

public class Task1_5 {
    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input 3 real numbers as command line arguments";
        if (args.length < 3) { //проверка количества введенных аргументов
            System.out.println(WARN_MESSAGE);
        } else {
            for (String arg : args) {
                try {
                    double x = Double.parseDouble(arg);
                    x = (x >= 0) ? pow(x, 2) : pow(x, 4);
                    System.out.println(x);
                } catch (NumberFormatException e) {
                    System.out.println("\"" + arg + "\"" + " is not a real number");
                }
            }
        }
    }
}
