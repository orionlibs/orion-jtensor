package io.github.orionlibs.orion_jtensor;

import io.github.orionlibs.orion_jtensor.rank0.BigDecimalTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.BigIntegerTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.BooleanTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.ByteTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.ComplexBigDecimalTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.ComplexDoubleTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.ComplexFloatTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.DoubleTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.FloatTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.IntegerTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.LongTensorRank0;
import io.github.orionlibs.orion_jtensor.rank0.ShortTensorRank0;

public class JTensor
{
    private JTensor()
    {
    }


    public static BooleanTensorRank0 newBooleanTensorRank0()
    {
        return new BooleanTensorRank0();
    }


    public static LongTensorRank0 newLongTensorRank0()
    {
        return new LongTensorRank0();
    }


    public static IntegerTensorRank0 newIntegerTensorRank0()
    {
        return new IntegerTensorRank0();
    }


    public static ShortTensorRank0 newShortTensorRank0()
    {
        return new ShortTensorRank0();
    }


    public static ByteTensorRank0 newByteTensorRank0()
    {
        return new ByteTensorRank0();
    }


    public static FloatTensorRank0 newFloatTensorRank0()
    {
        return new FloatTensorRank0();
    }


    public static DoubleTensorRank0 newDoubleTensorRank0()
    {
        return new DoubleTensorRank0();
    }


    public static BigIntegerTensorRank0 newBigIntegerTensorRank0()
    {
        return new BigIntegerTensorRank0();
    }


    public static BigDecimalTensorRank0 newBigDecimalTensorRank0()
    {
        return new BigDecimalTensorRank0();
    }


    public static ComplexFloatTensorRank0 newComplexFloatTensorRank0()
    {
        return new ComplexFloatTensorRank0();
    }


    public static ComplexDoubleTensorRank0 newComplexDoubleTensorRank0()
    {
        return new ComplexDoubleTensorRank0();
    }


    public static ComplexBigDecimalTensorRank0 newComplexBigDecimalTensorRank0()
    {
        return new ComplexBigDecimalTensorRank0();
    }
}
