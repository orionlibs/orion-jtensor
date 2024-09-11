package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_object.CloningService;
import java.math.BigDecimal;

public class ComplexBigDecimal implements Cloneable
{
    private BigDecimal realValue = BigDecimal.ZERO;
    private BigDecimal imaginaryValue = BigDecimal.ZERO;


    public ComplexBigDecimal()
    {
    }


    public ComplexBigDecimal(BigDecimal realValue)
    {
        this.realValue = realValue;
    }


    public ComplexBigDecimal(BigDecimal realValue, BigDecimal imaginaryValue)
    {
        this(realValue);
        this.imaginaryValue = imaginaryValue;
    }


    public static ComplexBigDecimal of()
    {
        return new ComplexBigDecimal();
    }


    public static ComplexBigDecimal of(BigDecimal realValue)
    {
        return new ComplexBigDecimal(realValue);
    }


    public static ComplexBigDecimal of(BigDecimal realValue, BigDecimal imaginaryValue)
    {
        return new ComplexBigDecimal(realValue, imaginaryValue);
    }


    public BigDecimal getRealValue()
    {
        return realValue;
    }


    public BigDecimal getImaginaryValue()
    {
        return imaginaryValue;
    }


    @Override
    public ComplexBigDecimal clone()
    {
        return (ComplexBigDecimal)CloningService.clone(this);
    }
}
