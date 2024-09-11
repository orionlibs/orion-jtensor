package io.github.orionlibs.orion_jtensor.complex;

import io.github.orionlibs.orion_object.CloningService;

public class ComplexFloat implements Cloneable
{
    public static final ComplexFloat ZERO = ComplexFloat.of();
    private float realValue = 0.0f;
    private float imaginaryValue = 0.0f;


    public ComplexFloat()
    {
    }


    public ComplexFloat(float realValue)
    {
        this.realValue = realValue;
    }


    public ComplexFloat(float realValue, float imaginaryValue)
    {
        this(realValue);
        this.imaginaryValue = imaginaryValue;
    }


    public static ComplexFloat of()
    {
        return new ComplexFloat();
    }


    public static ComplexFloat of(float realValue)
    {
        return new ComplexFloat(realValue);
    }


    public static ComplexFloat of(float realValue, float imaginaryValue)
    {
        return new ComplexFloat(realValue, imaginaryValue);
    }


    public float getRealValue()
    {
        return realValue;
    }


    public float getImaginaryValue()
    {
        return imaginaryValue;
    }


    @Override
    public boolean equals(Object other)
    {
        if(other instanceof ComplexFloat temp)
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
        if(realValue == Float.NaN || imaginaryValue == Float.NaN)
        {
            return "NaN";
        }
        else if(realValue == Float.NEGATIVE_INFINITY || imaginaryValue == Float.NEGATIVE_INFINITY)
        {
            return "-inf";
        }
        else if(realValue == Float.POSITIVE_INFINITY || imaginaryValue == Float.POSITIVE_INFINITY)
        {
            return "inf";
        }
        else
        {
            if(imaginaryValue < 0.0f)
            {
                return STR."\{Float.toString(realValue)} - \{Float.toString(-imaginaryValue)}i";
            }
            else
            {
                return STR."\{Float.toString(realValue)} + \{Float.toString(imaginaryValue)}i";
            }
        }
    }


    @Override
    public ComplexFloat clone()
    {
        return (ComplexFloat)CloningService.clone(this);
    }
}
