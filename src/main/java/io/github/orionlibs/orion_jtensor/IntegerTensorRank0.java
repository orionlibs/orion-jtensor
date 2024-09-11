package io.github.orionlibs.orion_jtensor;

public class IntegerTensorRank0 extends TensorRank0<Integer>
{
    public IntegerTensorRank0()
    {
        super(Integer.class);
    }


    @Override
    public String print()
    {
        return Integer.toString(get());
    }
}
