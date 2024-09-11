package io.github.orionlibs.orion_jtensor;

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
