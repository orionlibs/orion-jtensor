package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_assert.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TensorRank0<T> extends ATensor
{
    protected Object data;


    public TensorRank0(Class<?> dataType)
    {
        super(dataType);
        this.data = createZeroValuedTensor();
    }


    public TensorRank0(Class<?> dataType, T data)
    {
        super(dataType);
        this.data = data;
    }


    private Object createZeroValuedTensor()
    {
        if(dataTypeName.equals(Boolean.class.getName()))
        {
            return Boolean.FALSE;
        }
        else if(dataTypeName.equals(Long.class.getName()))
        {
            return 0L;
        }
        else if(dataTypeName.equals(Integer.class.getName()))
        {
            return 0;
        }
        else if(dataTypeName.equals(Short.class.getName()))
        {
            return (short)0;
        }
        else if(dataTypeName.equals(Byte.class.getName()))
        {
            return (byte)0;
        }
        else if(dataTypeName.equals(Double.class.getName()))
        {
            return 0.0d;
        }
        else if(dataTypeName.equals(Float.class.getName()))
        {
            return 0.0f;
        }
        else if(dataTypeName.equals(BigDecimal.class.getName()))
        {
            return BigDecimal.ZERO;
        }
        else if(dataTypeName.equals(BigInteger.class.getName()))
        {
            return BigInteger.ZERO;
        }
        else if(dataTypeName.equals(ComplexFloat.class.getName()))
        {
            return ComplexFloat.of();
        }
        else if(dataTypeName.equals(ComplexDouble.class.getName()))
        {
            return ComplexDouble.of();
        }
        else if(dataTypeName.equals(ComplexBigDecimal.class.getName()))
        {
            return ComplexBigDecimal.of();
        }
        else
        {
            return 0.0f;
        }
    }


    @Override
    public String print()
    {
        return get().toString();
    }


    public T get()
    {
        return (T)this.data;
    }


    // Set value in tensor
    public void set(T value)
    {
        Assert.isTrue(dataTypeName.equals(value.getClass().getName()), STR."New value has to be of type \{dataTypeName} to match this tensor data type requirement");
        this.data = value;
    }
}
