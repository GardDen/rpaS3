package task3_Stock;

/*



Stock google = new Stock("GOOG", 10);
google.printInformation();
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
google.printInformation();

Вывод в консоль:

Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10

Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15
 */

public class Stock {
    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public void updatePrice(int currentPrice) {
        this.currentPrice = currentPrice;
        if (minPrice > currentPrice) {
            minPrice = currentPrice;
        }
        if (maxPrice < currentPrice) {
            maxPrice = currentPrice;
        }

    }

    public void printInformation() {
        System.out.printf("Company  = %s, Current Price = %d, Min Price = %d, Max Price = %d\n",
                name, currentPrice, minPrice, maxPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
