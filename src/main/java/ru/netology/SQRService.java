package ru.netology;

public class SQRService {
    public int calcSqr(int lowerBorder, int upperBorder) {
        int iterationCount = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i <= upperBorder) {
                if (i * i >= lowerBorder) {
                    iterationCount++;
                }
            }
        }
        return iterationCount;
    }
}
