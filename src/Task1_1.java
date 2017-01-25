import java.util.ArrayList;

public class Task1_1 {

    /* Составить линейную программу, печатающую значение true если сумма двух первых чисел заданного четырехзначного
    числа равна сумме двух его последних цифр, и false - в противном случае
     */
    public static void main(String[] args) {

        final String HELP_MESSAGE = "Input a four-digit integer number as an argument";

        if (args.length < 1) { //проверка количества введенных аргументов
            System.out.println(HELP_MESSAGE);
        } else {
            int number = 0;
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            number = Math.abs(number);
            ArrayList<Integer> digits = new ArrayList<>();

            while (number >= 1) {  // формируем коллекцию чисел из цифр числа
                digits.add(number % 10);
                number = number / 10;
            }
            if (digits.size() == 4) { // работаем только с четырехзначным числом
                System.out.println(digits.get(0) + digits.get(1) == digits.get(2) + digits.get(3));
            } else {
                System.out.println(HELP_MESSAGE);
            }
        }
    }
}

