package task3_Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE", 10);
        google.printInformation();
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.printInformation();
    }
}
