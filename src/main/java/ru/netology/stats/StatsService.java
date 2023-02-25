package ru.netology.stats;

public class StatsService {


    public double sumSales(double[] sales) {  //Сумма всех продаж. Складываем все значения.
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return (sum);
    }

    public double averageSale(double[] sales) { // Метод sumSales делим на кол-во месяцев, тоесть на длину массива
        double average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSalesMonthNumber(double[] sales) { // По аналогии с примером перебираем значения, условие >= так как
        // нам нужен последний месяц соотв. условям
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonthNumber(int[] sales) { // По аналогии с примером перебираем значения, условие <= так как
        // нам нужен последний месяц соотв. условям
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthNumberUnderAverageSale(double[] sales) { // Сравниваем со сначением метода averageSale
        int numUnder = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale(sales)) {
                numUnder = numUnder + 1;
            }
        }
        return numUnder;
    }

    public int monthNumberOverAverageSale(double[] sales) { // Аналогично сравниваем со значением метода averageSale
        int numOver = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale(sales)) {
                numOver = numOver + 1;
            }
        }
        return numOver;
    }
}
