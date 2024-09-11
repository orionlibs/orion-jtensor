package io.github.orionlibs.orion_jtensor;

import java.math.BigDecimal;

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
