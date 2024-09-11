package io.github.orionlibs.orion_jtensor.rank0;

import io.github.orionlibs.orion_jtensor.TensorRank0;
import java.math.BigInteger;

public class BigIntegerTensorRank0 extends TensorRank0<BigInteger>
{
    public BigIntegerTensorRank0()
    {
        super(BigInteger.class);
    }


    @Override
    public String print()
    {
        return get().toString();
    }
}
