package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.complex.ComplexFloat;
import io.github.orionlibs.orion_jtensor.TensorRank0;

public class ComplexFloatTensorRank0 extends TensorRank0<ComplexFloat>
{
    public ComplexFloatTensorRank0()
    {
        super(ComplexFloat.class);
    }


    @Override
    public String print()
    {
        return get().toString();
    }
}
