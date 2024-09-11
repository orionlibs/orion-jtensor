package io.github.orionlibs.orion_jtensor.complex;

import io.github.orionlibs.orion_object.CloningService;

public class ComplexDouble implements Cloneable
{
    public static final ComplexDouble ZERO = ComplexDouble.of();
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
    public boolean equals(Object other)
    {
        if(other instanceof ComplexDouble temp)
        {
            return this.realValue == temp.getRealValue() && this.imaginaryValue == temp.getImaginaryValue();
        }
        else
        {
            return false;
        }
    }


    @Override
    public String toString()
    {
        if(realValue == Double.NaN || imaginaryValue == Double.NaN)
        {
            return "NaN";
        }
        else if(realValue == Double.NEGATIVE_INFINITY || imaginaryValue == Double.NEGATIVE_INFINITY)
        {
            return "-inf";
        }
        else if(realValue == Double.POSITIVE_INFINITY || imaginaryValue == Double.POSITIVE_INFINITY)
        {
            return "inf";
        }
        else
        {
            if(imaginaryValue < 0.0f)
            {
                return STR."\{Double.toString(realValue)} - \{Double.toString(-imaginaryValue)}i";
            }
            else
            {
                return STR."\{Double.toString(realValue)} + \{Double.toString(imaginaryValue)}i";
            }
        }
    }


    @Override
    public ComplexDouble clone()
    {
        return (ComplexDouble)CloningService.clone(this);
    }
}
