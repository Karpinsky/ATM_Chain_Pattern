package main;

import main.currency.CustomCurrency;

/**
 * Created by Maxym on 26.12.2016.
 */
public class Slot
{
    protected CustomCurrency.VALUE _slotCurrency;
    private Slot _next;

    public Slot(CustomCurrency.VALUE slotCurrency, Slot next)
    {
        this._slotCurrency = slotCurrency;
        this._next = next;
    }

    public void setNext(Slot next)
    {
        this._next = next;
    }

    public void HandleRequest(Integer cash)
    {
        if (this._next != null)
        {
            this._next.HandleRequest(cash);
        }
    }
}
