package opgave05;

public class StockTest {
    public static void main(String[] args) {
        Stock oracleCorpoartion = new Stock("ORCL","Oracle Corpoartion");
        oracleCorpoartion.previousClosingPrice = 34.5;
        oracleCorpoartion.currentPrice = 34.35;

        System.out.println("The price-change percentage since yesterday of " + oracleCorpoartion.name + " is: " + oracleCorpoartion.getChanceProcent() + "%.");
    }
}
