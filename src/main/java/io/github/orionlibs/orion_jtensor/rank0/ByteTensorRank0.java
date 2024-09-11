package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;

public class ByteTensorRank0 extends TensorRank0<Byte>
{
    public ByteTensorRank0()
    {
        super(Byte.class);
    }


    @Override
    public String print()
    {
        return Byte.toString(get());
    }
}
