package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;

public class ShortTensorRank0 extends TensorRank0<Short>
{
    public ShortTensorRank0()
    {
        super(Short.class);
    }


    @Override
    public String print()
    {
        return Short.toString(get());
    }
}
