package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_object.CloningService;

public class ComplexDouble implements Cloneable
{
    private double realValue = 0.0d;
    private double imaginaryValue = 0.0d;


    public ComplexDouble()
    {
    }


    public ComplexDouble(double realValue)
    {
        this.realValue = realValue;
    }


    public ComplexDouble(double realValue, double imaginaryValue)
    {
        this(realValue);
        this.imaginaryValue = imaginaryValue;
    }


    public static ComplexDouble of()
    {
        return new ComplexDouble();
    }


    public static ComplexDouble of(double realValue)
    {
        return new ComplexDouble(realValue);
    }


    public static ComplexDouble of(double realValue, double imaginaryValue)
    {
        return new ComplexDouble(realValue, imaginaryValue);
    }


    public double getRealValue()
    {
        return realValue;
    }


    public double getImaginaryValue()
    {
        return imaginaryValue;
    }


    @Override
    public ComplexDouble clone()
    {
        return (ComplexDouble)CloningService.clone(this);
    }
}
