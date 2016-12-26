package main;

/**
 * Created by Maxym on 26.12.2016.
 */
public class CashMachine
{
    private Integer _cashAmount;
    // private Dictionary<CustomCurrency.VALUE, Queue<CustomCurrency>> _cash;
    private Slot _startingSlot;

    /*
    No need to do this in actual cash machine as it would simply look if there are any currencies in slot
    and then behave depending on this info - no need for initialization of the cash

    public CashMachine(CustomCurrency... currencies)
    {
        for (CustomCurrency currency : currencies)
        {
            Queue<CustomCurrency> currencyQueue = this._cash.get(currency.getValue());
            if (currencyQueue != null) {
                currencyQueue.enqueue(currency);
            }
            else
            {
                Queue<CustomCurrency> newQueue = new Queue<>();
                this._cash.put(currency.getValue(), newQueue);
                newQueue.enqueue(currency);
            }
        }
    }
    */

    public CashMachine(Slot slot, Integer cashAmount)
    {
        this._startingSlot = slot;
        this._cashAmount = cashAmount;
    }

    public void cashIssuance(Integer amount)
    {
        if (this._cashAmount >= amount)
        {
            this._startingSlot.HandleRequest(amount);
            return;
        }
        System.out.println("No money! Take your card back.");
    }
}
