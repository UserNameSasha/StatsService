package ru.netology.statsservice;

public class StatsService {

    public int sum(int[] sales) {
        int result = 0;
        for (int sale : sales) {

            result += sale;

        }
        return result;
    }

    public int mediumSales(int[] sales) {
        int result = 0;
        for (int sale : sales) {

            result += sale;
        }
        return result / 12;
    }

    public int max(int[] sales) {
        int month = 0;
        int maxSale = sales[0];
        for (int i = 0; i <sales.length ; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                month = i;
            }

        }
        return month + 1;
    }

    public int min(int[] sales) {
        int month = 0;
        int minSale = sales[0];
        for (int i = 0; i <sales.length ; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                month = i;
            }

        }
        return month + 1;
    }

    public int belowAverage(int[] sales) {
        int counter = 0;
        int mediumSales = mediumSales(sales);
        for (int sale : sales) {
            if (sale < mediumSales(sales)) {
                counter++;
            }
        }
        return counter;
    }


    public int aboveAverage(int[] sales) {
        int counter = 0;
        int mediumSales = mediumSales(sales);
        for (int sale : sales) {
            if (sale > mediumSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

}