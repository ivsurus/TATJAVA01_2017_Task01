

public class Task1_10 {
/*
Сформировать квадратную матрицу порядка N по заданному образцу
*/

    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input correct even natural number N as an argument";

        if (args.length >= 1) { //проверка количества введенных аргументов
            int n=0;
            try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e){
            System.out.println(WARN_MESSAGE);
        }
        if ((n%2 == 0) && (n > 0)) { // n - натуральное четное число
            int twoDim[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 1; j <= n; j++) {
                        twoDim[i][j - 1] = j;
                    }
                } else {
                    for (int j = n; j > 0; j--) {
                        twoDim[i][n - j] = j;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(twoDim[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println(WARN_MESSAGE);
        }
    } else {
            System.out.println(WARN_MESSAGE);
    }
    }

}
