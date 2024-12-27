package ru.netology.javaqa3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test

    public void Sale() {

        StatsService service = new StatsService();
        int[] salesList = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.saleSum(salesList);
        Assertions.assertEquals(180, actual);
    }

    @Test

    public void middleSumTest(){

        StatsService middleSumService = new StatsService();
        int[] middleSumArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = middleSumService.middleSumFun(middleSumArr);
        Assertions.assertEquals(15, actual);
    }

    public void bigSalesTest (){
        StatsService bigSalesObject = new StatsService();
        int[] bigSumArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = bigSalesObject.bigSales(bigSumArr);
        Assertions.assertEquals(20, actual);
    }
}
