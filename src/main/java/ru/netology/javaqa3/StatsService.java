package ru.netology.javaqa3;


public class StatsService {
    public int saleSum(int[] salesList) {
        int sum = 0;
        for (int i = 0; i < salesList.length; i++) {
            sum = sum + salesList[i];
        }
        return sum;
    }

    public int middleSumFun(int[] middleSumArr) {
        int sum = 0;

        for (int i = 0; i < middleSumArr.length; i++) {
            sum = sum + middleSumArr[i];
        }
        int middleSum = sum / 12;
        return middleSum;
    }

    public int bigSales(int[] bigSumArr) {
        int bigSumVariable = 0;
        for (int i = 0; i < bigSumArr.length; i++) {
            if (bigSumArr[i] > bigSumArr[bigSumVariable]) {
                bigSumVariable = i;
            }
        }
        return bigSumVariable;
    }
}
