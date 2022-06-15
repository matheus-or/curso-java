package utils;

public class CurrencyConverter {

    public static double IOF = 1.06;

    public static double calculator(double dollar, double dollarBought) {
        return dollar * dollarBought * IOF;
    }
}
