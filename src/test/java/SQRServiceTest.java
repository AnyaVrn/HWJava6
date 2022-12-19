package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.SQRService;


public class SQRServiceTest {

    @Test
    public void testveryhardhw() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(200,300) ;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testveryveryhardhw() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSQR(100,200) ;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testiwastealotoftime() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQR(1,2) ;

        Assertions.assertEquals(expected, actual);
    }

}
