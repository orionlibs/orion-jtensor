package io.github.orionlibs.orion_jtensor;

import java.math.BigDecimal;

public class BigDecimalTensorRank0 extends TensorRank0<BigDecimal>
{
    public BigDecimalTensorRank0()
    {
        super(BigDecimal.class);
    }


    @Override
    public String print()
    {
        return get().toPlainString();
    }
}
