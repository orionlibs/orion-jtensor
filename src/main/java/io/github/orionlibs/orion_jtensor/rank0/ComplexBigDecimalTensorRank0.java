package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.complex.ComplexBigDecimal;
import io.github.orionlibs.orion_jtensor.TensorRank0;

public class ComplexBigDecimalTensorRank0 extends TensorRank0<ComplexBigDecimal>
{
    public ComplexBigDecimalTensorRank0()
    {
        super(ComplexBigDecimal.class);
    }


    @Override
    public String print()
    {
        return get().toString();
    }
}
