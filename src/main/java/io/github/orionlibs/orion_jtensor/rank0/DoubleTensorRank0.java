package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;

public class DoubleTensorRank0 extends TensorRank0<Double>
{
    public DoubleTensorRank0()
    {
        super(Double.class);
    }


    @Override
    public String print()
    {
        return Double.toString(get());
    }
}
