import ru.netology.javaqa.javaqamvn.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService(); // Не работающий вариант решения, цикл прерывается на первом правильном варианте
        System.out.println(service.calcSQR(200, 300));
        System.out.println();

        int i;
        int x = 200;
        int a = 300;
        for (i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= a)) {


            }
        }
    }
}