package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_assert.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Tensor<T> extends ATensor
{
    public Tensor(Class<?> dataType, int... dimensions)
    {
        super(dataType, dimensions);
        this.data = createZeroValuedTensor(dimensions, 0);
    }


    // Recursively create the tensor array
    private Object createZeroValuedTensor(int[] dims, int depth)
    {
        if(depth == 0)
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
        else
        {
            int size = dims[depth];
            if(depth == dims.length - 1)
            {
                Object[] values = new Object[size];
                for(int i = 0; i < values.length; i++)
                {
                    if(dataTypeName.equals(Long.class.getName()))
                    {
                        values[i] = 0L;
                    }
                    else if(dataTypeName.equals(Integer.class.getName()))
                    {
                        values[i] = 0;
                    }
                    else if(dataTypeName.equals(Short.class.getName()))
                    {
                        values[i] = (short)0;
                    }
                    else if(dataTypeName.equals(Byte.class.getName()))
                    {
                        values[i] = (byte)0;
                    }
                    else if(dataTypeName.equals(Double.class.getName()))
                    {
                        values[i] = 0.0d;
                    }
                    else if(dataTypeName.equals(Float.class.getName()))
                    {
                        values[i] = 0.0f;
                    }
                    else if(dataTypeName.equals(BigDecimal.class.getName()))
                    {
                        values[i] = BigDecimal.ZERO;
                    }
                    else if(dataTypeName.equals(BigInteger.class.getName()))
                    {
                        values[i] = BigInteger.ZERO;
                    }
                    else
                    {
                        values[i] = 0.0f;
                    }
                }
                return values;  // Last level, create the array for elements.
            }
            else
            {
                Object[] tensor = new Object[size];
                for(int i = 0; i < size; i++)
                {
                    tensor[i] = createZeroValuedTensor(dims, depth + 1);
                }
                return tensor;
            }
        }
    }


    // Set value in tensor
    public void set(T value, int... indices)
    {
        if(indices == null || indices.length == 0)
        {
            System.out.println(data);
            Object current = data;
            current = value;
            System.out.println(data);
        }
        else
        {
            Assert.isTrue(indices.length == dimensions.length, "Number of indices must match tensor dimensions");
            Object current = data;
            for(int i = 0; i < indices.length - 1; i++)
            {
                current = ((Object[])current)[indices[i]];
            }
            ((Object[])current)[indices[indices.length - 1]] = value;
        }
    }
}
