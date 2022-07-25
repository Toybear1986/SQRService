package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/expectsAndBorders.csv")
    public void shouldCalcExact(int expected, int lowerBorder, int upperBorder) {
        SQRService service = new SQRService();

//        int expected = 5;
        int actual = service.calcSqr(lowerBorder, upperBorder);

        Assertions.assertEquals(expected, actual);
    }

}
