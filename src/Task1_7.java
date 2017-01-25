import static java.lang.Math.*;

/*
Составить программу для вычисления значений функции на заданном отрезке
*/
public class Task1_7 {

    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input 3 correct real numbers as arguments";
        if (args.length >= 3) { //проверка количества введенных аргументов
            try{
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double h = Double.parseDouble(args[2]);
                System.out.println("x   F(x)");
                for (double i = a; i <= b; i = i + h) {
                    double f = (pow(sin(i), 2)) - cos(2 * i);
                    System.out.print(i + " ");
                    System.out.printf("%.3f", f);
                    System.out.println();
                }
            } catch (NumberFormatException e){
                System.out.println(WARN_MESSAGE);
            }
        } else {
            System.out.println(WARN_MESSAGE);
        }
    }
}