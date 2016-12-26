package main.currency;

/**
 * Created by Maxym on 26.12.2016.
 */
public class CustomCurrency implements ICustomCurrency
{
    public enum VALUE
    {
        ONE_HUNDRED(100), FIFTY(50), TWENTY(20), TEN(10), FIVE(5), TWO(2), ONE(1);

        private Integer _value;

        VALUE(Integer value)
        {
            this._value = value;
        }

        public Integer getValue()
        {
            return this._value;
        }
    }

    private VALUE _value;

    public CustomCurrency(VALUE value)
    {
        this._value = value;
    }

    public VALUE getValue()
    {
        return this._value;
    }

    public Integer getCashValue()
    {
        return this._value.getValue();
    }
}
