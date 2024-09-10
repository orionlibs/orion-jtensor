package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_assert.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TensorRank0<T> extends ATensor
{
    private Object data;


    public TensorRank0(Class<?> dataType)
    {
        super(dataType);
        this.data = createZeroValuedTensor();
    }


    private Object createZeroValuedTensor()
    {
        if(dataTypeName.equals(Long.class.getName()))
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
