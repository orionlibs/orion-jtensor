package io.github.orionlibs.orion_jtensor.complex;

import io.github.orionlibs.orion_object.CloningService;
import java.math.BigDecimal;

public class ComplexBigDecimal implements Cloneable
{
    public static final ComplexBigDecimal ZERO = ComplexBigDecimal.of();
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
    public boolean equals(Object other)
    {
        if(other instanceof ComplexBigDecimal temp)
        {
            return this.realValue.equals(temp.getRealValue()) && this.imaginaryValue.equals(temp.getImaginaryValue());
        }
        else
        {
            return false;
        }
    }


    @Override
    public String toString()
    {
        if(realValue == null || imaginaryValue == null)
        {
            return "NaN";
        }
        else
        {
            if(imaginaryValue.compareTo(BigDecimal.ZERO) < 0)
            {
                return STR."\{realValue.toPlainString()} - \{imaginaryValue.negate().toPlainString()}i";
            }
            else
            {
                return STR."\{realValue.toPlainString()} + \{imaginaryValue.toPlainString()}i";
            }
        }
    }


    @Override
    public ComplexBigDecimal clone()
    {
        return (ComplexBigDecimal)CloningService.clone(this);
    }
}
