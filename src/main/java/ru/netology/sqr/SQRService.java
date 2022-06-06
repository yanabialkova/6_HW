package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int a, int b) {

        int summSQR = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= a && i * i <= b) {
                summSQR++;
            }
        }
        return summSQR;
    }
}
