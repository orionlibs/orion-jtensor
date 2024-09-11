package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;

public class LongTensorRank0 extends TensorRank0<Long>
{
    public LongTensorRank0()
    {
        super(Long.class);
    }


    @Override
    public String print()
    {
        return Long.toString(get());
    }
}
