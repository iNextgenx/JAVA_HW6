package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void shouldFindSum() { // Сумма всех продаж
        StatsService service = new StatsService();
        double[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 180;
        double actual = service.sumSales(month);
        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма всех продаж: " + service.sumSales(month));
    }

    @Test
    public void shouldFindAverage() { // Средняя продажа
        StatsService service = new StatsService();
        double[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.averageSale(month);
        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSale(month));
    }

    @Test
    public void shouldFindMaxSalesMonth() { // Пик продаж
        StatsService service = new StatsService();
        double[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSalesMonthNumber(month);
        Assertions.assertEquals(expected, actual);
        System.out.println("Пик продаж в месяце номер: " + service.maxSalesMonthNumber(month));
    }

    @Test
    public void shouldFindMinSalesMonth() { // Минимум продаж в месяц
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 9;
        double actual = service.minSalesMonthNumber(month);
        Assertions.assertEquals(expected, actual);
        System.out.println("Минимум продаж в месяце: " + service.minSalesMonthNumber(month));
    }

    @Test
    public void shouldFindNumMonthUnderAverageSale() { // Продажи ниже среднего
        StatsService service = new StatsService();
        double[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthNumberUnderAverageSale(month);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяцев с продажами НИЖЕ среднего: " + service.monthNumberUnderAverageSale(month));
    }

    @Test
    public void shouldFindNumMonthOverAverageSale() { // Продажи выше среднего
        StatsService service = new StatsService();
        double[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthNumberOverAverageSale(month);
        Assertions.assertEquals(expected, actual);
        System.out.println("Месяцев с продажами ВЫШЕ среднего: " + service.monthNumberOverAverageSale(month));
    }
}
