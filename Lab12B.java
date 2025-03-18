
class Stock {
    String name, symbol;
    double closingPrice, currentPrice;

    Stock(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        closingPrice = currentPrice = 0;
    }

    String getName() {
        return name;
    }

    String getSymbol() {
        return symbol;
    }

    void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    int getChangePercent() {
        double percent = (currentPrice - closingPrice)/currentPrice * 100;
        return (int)Math.round(percent);
    }

    void print() {
        System.out.println(name + " stock");
        System.out.println("\t Symbol: " + symbol);
        System.out.println("\t Closing price: " + closingPrice);
        System.out.println("\t Current price: " + currentPrice);
        System.out.println("\t Change percent: " + getChangePercent() + "%");
    }

    public static void main(String[] args) {
        Stock stock1 = new Stock("Google", "GOG");
        Stock stock2 = new Stock("Microsoft", "MSF");

        stock1.setClosingPrice(134.67);
        stock1.setCurrentPrice(131.98);

        stock2.setClosingPrice(156.52);
        stock2.setCurrentPrice(161.22);

        stock1.print();
        stock2.print();
    }
}
