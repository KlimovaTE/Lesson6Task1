package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };
    StatsService service = new StatsService();

    @Test
    public void shouldTotalSales() {
        StatsService service = new StatsService();

        long expected = 180;
        long actualTotalSales = service.totalSales(sales);
        Assertions.assertEquals(expected, actualTotalSales);
    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();

        long expected = 15;
        float actualAverageSales = service.averageSales(sales);
        Assertions.assertEquals(expected, actualAverageSales);
    }

    @Test
    public void shouldMaxMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        int actualMaxMonth = service.maxMonthSales(sales);
        Assertions.assertEquals(expected, actualMaxMonth);
    }

    @Test
    public void shouldMinMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        int actualMinMonth = service.minMonthSales(sales);
        Assertions.assertEquals(expected, actualMinMonth);
    }

    @Test
    public void shouldMonthsBelowAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        int actualMonthsBelowAverage = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actualMonthsBelowAverage);
    }

    @Test
    public void shouldMonthsAboveAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        int actualMonthsAboveAverage = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expected, actualMonthsAboveAverage);
    }
}
