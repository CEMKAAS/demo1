public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long medium() {
        int maxSale = max();
        int minSale = min();
        int medium;
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        medium = (total - minSale - maxSale) / (sales.length - 2);
        return medium;
    }

}