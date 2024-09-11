package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.complex.ComplexDouble;
import io.github.orionlibs.orion_jtensor.TensorRank0;

public class ComplexDoubleTensorRank0 extends TensorRank0<ComplexDouble>
{
    public ComplexDoubleTensorRank0()
    {
        super(ComplexDouble.class);
    }


    @Override
    public String print()
    {
        return get().toString();
    }
}
