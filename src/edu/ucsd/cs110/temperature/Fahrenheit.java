package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float v_get = this.getValue();
        v_get = (v_get - 32) /9 * 5;
        Temperature new_one = new Fahrenheit (v_get);
        return new_one;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue() + " F";
    }
}