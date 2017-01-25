/*
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K
*/
public class Task1_8 {
    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input an array with natural numbers separated by ',' as a first argument " +
                "and natural number K as a second argument";
        final String EXAMPLE = "EXAMPLE: 6,12,34,4,7,3 3";
        if (args.length >= 2) { //проверка количества введенных аргументов
            String[] numbers = args[0].split(",");
            try {
                int k = Integer.parseInt(args[1]);
                int sum = 0;
                for (String numberStr : numbers) {
                    int number = Integer.parseInt(numberStr);
                    if (number % k == 0) {
                        sum += number;
                    }
                }
                System.out.println(sum);
            } catch (NumberFormatException e){
                System.out.println(WARN_MESSAGE + "\n" + EXAMPLE);
            }
        } else {
            System.out.println(WARN_MESSAGE + "\n" + EXAMPLE);
        }
    }
}
