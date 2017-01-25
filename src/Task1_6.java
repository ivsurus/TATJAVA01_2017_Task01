public class Task1_6 {

    /*
    Написать программу нахождения суммы большего и меньшего из трех чисел
    */
    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input 3 correct real numbers as arguments";
        if (args.length >= 3) { //проверка количества введенных аргументов
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                double min = a;
                double max = a;
                //для трех чисел нет необходтмости использовать поиск в цикле
                if (b < min) {
                    min = b;
                }
                if (c < min) {
                    min = c;
                }
                if (b > max) {
                    max = b;
                }
                if (c > max) {
                    max = c;
                }
                System.out.println(max + min);
            } catch (NumberFormatException e) {
                System.out.println(WARN_MESSAGE);
            }
        } else {
            System.out.println(WARN_MESSAGE);
        }
    }
}
