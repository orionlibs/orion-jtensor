package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;

public class BooleanTensorRank0 extends TensorRank0<Boolean>
{
    public BooleanTensorRank0()
    {
        super(Boolean.class);
    }
    public BooleanTensorRank0(boolean value)
    {
        super(Boolean.class);
    }


    @Override
    public String print()
    {
        return Boolean.toString(get());
    }
}
