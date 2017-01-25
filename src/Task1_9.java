/*
Заданы 2 одномерных массива с различным количеством элементов и натуральное
число k. Объединить их в один массив, включив второй массив между k-м и (k+1)-м
элементами первого
*/
public class Task1_9 {
    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input an array with natural numbers separated by ',' as a first argument, " +
                "an array with natural numbers separated by ',' as a second argument and natural number k as a third argument";
        final String EXAMPLE = "EXAMPLE: 1,2,3,4,5 6,7,8,9 3";
        final String WARN_MESSAGE1 = "Input correct natural K as a third argument";
        if (args.length >= 3) { //проверка количества введенных аргументов
            String[] array1 = args[0].split(",");
            String[] array2 = args[1].split(",");
            String[] resultArray = new String[array1.length + array2.length];
            int k =0;
            try {
                k = Integer.parseInt(args[2]);
            } catch (NumberFormatException e){
             System.out.println(WARN_MESSAGE1);
            }
                if ((k > 0) && (k < array1.length)) { // k - натуральное число
                    //копируем массивы в результирующий массив на указанные позиции
                    System.arraycopy(array1, 0, resultArray, 0, k);
                    System.arraycopy(array2, 0, resultArray, k, array2.length);
                    System.arraycopy(array1, k, resultArray, k + array2.length, array1.length - k);
                } else {
                    System.out.println(WARN_MESSAGE);
                }
                for (String number : resultArray) {
                    System.out.println(number);
                }
        } else {
            System.out.println(WARN_MESSAGE + "\n" + EXAMPLE);
        }
    }
}
