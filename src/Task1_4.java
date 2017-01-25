import static java.lang.Math.abs;

public class Task1_4 {

    /*Для данных областей составить линейную программу которая печатает true,
    если точка с координатами (x,y) принадлежит закрашенной области и false - в противном случае
    */
    
    
    public static void main(String[] args) {
        final String WARN_MESSAGE = "Input correct real numbers X and Y as arguments";
        if (args.length >= 2 ) { //проверка количества введенных аргументов
            try {
                double x = Double.parseDouble(args[0]);
                double y = Double.parseDouble(args[1]);
                //закрашенную область делим на 2 области
                System.out.println(((abs(x)<=2)&&((y>=0)&&(y<=4))) || ((abs(x)<=4)&&((y<=0)&&(y>=-3))));
            } catch (NumberFormatException e) {
                System.out.println(WARN_MESSAGE);
            }
        } else {
            System.out.println(WARN_MESSAGE);
        }
    }
}
