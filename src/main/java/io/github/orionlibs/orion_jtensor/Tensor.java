package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_string.StringsService;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Tensor<T>
{
    private final Object data;  // A tensor is essentially a nested object array.
    private final int[] dimensions;  // Stores the shape of the tensor (size in each dimension).
    private String dataTypeName;
    private StringBuilder tensorAsString;


    public Tensor(Class<?> dataType, int... dimensions)
    {
        Assert.isTrue(dimensions.length > 0, "A tensor must have at least one dimension");
        this.dataTypeName = dataType.getName();
        this.dimensions = Arrays.copyOf(dimensions, dimensions.length);
        this.data = createZeroValuedTensor(dimensions, 0);
    }


    // Recursively create the tensor array
    private Object createZeroValuedTensor(int[] dims, int depth)
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


    // Get value from tensor
    @SuppressWarnings("unchecked")
    public T get(int... indices)
    {
        Assert.isTrue(indices.length == dimensions.length, "Number of indices must match tensor dimensions");
        Object current = data;
        for(int i = 0; i < indices.length; i++)
        {
            current = ((Object[])current)[indices[i]];
        }
        return (T)current;
    }


    // Set value in tensor
    public void set(T value, int... indices)
    {
        Assert.isTrue(indices.length == dimensions.length, "Number of indices must match tensor dimensions");
        Object current = data;
        for(int i = 0; i < indices.length - 1; i++)
        {
            current = ((Object[])current)[indices[i]];
        }
        ((Object[])current)[indices[indices.length - 1]] = value;
    }


    // Get the dimensions (shape) of the tensor
    public int[] getDimensions()
    {
        return dimensions;
    }


    public int[] getShape()
    {
        return getDimensions();
    }


    // Print the tensor for demonstration purposes (recursive method)
    public String printTensor()
    {
        this.tensorAsString = new StringBuilder();
        printRecursive(data, 0);
        return tensorAsString.toString();
    }


    private void printRecursive(Object current, int depthToBeginWith)
    {
        if(current instanceof Object[])
        {
            tensorAsString.append(STR."\{"[".repeat(depthToBeginWith)}[");
            Object[] currentArray = (Object[])current;
            for(int i = 0; i < currentArray.length; i++)
            {
                printRecursive(currentArray[i], depthToBeginWith + 1);
                if(i == currentArray.length - 1)
                {
                    tensorAsString = StringsService.deleteCharacterFromTheEnd(tensorAsString, " ");
                }
            }
            tensorAsString.append(STR."\{"]".repeat(depthToBeginWith)}]");
        }
        else
        {
            tensorAsString.append(STR."\{current} ");
        }
    }
}
