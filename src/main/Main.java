package main;

import main.currency.CustomCurrency;

/**
 * Created by Maxym on 26.12.2016.
 */
public class Main
{
    public static void main(String... args)
    {
        DollarSlot slot = new DollarSlot(CustomCurrency.VALUE.ONE_HUNDRED,
                new DollarSlot(CustomCurrency.VALUE.FIFTY,
                        new DollarSlot(CustomCurrency.VALUE.TWENTY,
                                new DollarSlot(CustomCurrency.VALUE.TEN,
                                        new DollarSlot(CustomCurrency.VALUE.FIVE,
                                                new DollarSlot(CustomCurrency.VALUE.TWO,
                                                        new DollarSlot(CustomCurrency.VALUE.ONE, null)))))));
        CashMachine cashMachine = new CashMachine(slot, 10000);

        cashMachine.cashIssuance(3447);
    }
}
