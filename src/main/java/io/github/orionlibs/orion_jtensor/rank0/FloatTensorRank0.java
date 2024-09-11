package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;

public class FloatTensorRank0 extends TensorRank0<Float>
{
    public FloatTensorRank0()
    {
        super(Float.class);
    }


    @Override
    public String print()
    {
        return Float.toString(get());
    }
}
