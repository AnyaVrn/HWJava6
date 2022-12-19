package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
    public int calcSQR(int x, int a) {
        int count = 0;
        for (int i = 10; i < 100; i++)
            if (i * i >= x) {
                if (i * i <= a) {
                    count++;
                }

            }
        return count;
    }
}

