package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public float averageSales(long[] sales) {
        float sumSales = totalSales(sales);
        return sumSales / sales.length;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        float averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        float averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
