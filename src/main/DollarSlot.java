package main;

import main.currency.CustomCurrency;

/**
 * Created by Maxym on 26.12.2016.
 */
public class DollarSlot extends Slot
{

    public DollarSlot(CustomCurrency.VALUE slotCurrency, Slot next) {
        super(slotCurrency, next);
    }

    @Override
    public void HandleRequest(Integer cash)
    {
        if (cash / this._slotCurrency.getValue() != 0)
        {
            System.out.println(cash / this._slotCurrency.getValue() + " " + this._slotCurrency.getValue() + " Dollars");
        }
        super.HandleRequest(cash % this._slotCurrency.getValue());
    }
}
