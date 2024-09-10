package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_string.StringsService;
import java.util.Arrays;

public abstract class ATensor<T>
{
    protected Object data;  // A tensor is essentially a nested object array.
    protected final int[] dimensions;  // Stores the shape of the tensor (size in each dimension).
    protected String dataTypeName;
    protected StringBuilder tensorAsString;


    public ATensor(Class<?> dataType, int... dimensions)
    {
        Assert.isTrue(dimensions == null || dimensions.length >= 0, "A tensor must have non-negative dimension");
        this.dataTypeName = dataType.getName();
        if(dimensions == null || dimensions.length == 1)
        {
            this.dimensions = new int[0];
        }
        else
        {
            this.dimensions = Arrays.copyOf(dimensions, dimensions.length);
        }
    }


    // Get value from tensor
    @SuppressWarnings("unchecked")
    public T get(int... indices)
    {
        if(indices == null || indices.length == 0)
        {
            return (T)data;
        }
        else
        {
            Assert.isTrue(indices.length == dimensions.length, "Number of indices must match tensor dimensions");
            Object current = data;
            for(int i = 0; i < indices.length; i++)
            {
                current = ((Object[])current)[indices[i]];
            }
            return (T)current;
        }
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
        if(dimensions == null || dimensions.length == 0)
        {
            tensorAsString.append(current.toString());
        }
        else
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
}
