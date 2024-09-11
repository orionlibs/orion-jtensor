package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_object.CloningService;

public class ComplexFloat implements Cloneable
{
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
    public ComplexFloat clone()
    {
        return (ComplexFloat)CloningService.clone(this);
    }
}
