package io.github.orionlibs.orion_jtensor;

public class ShortTensorRank0 extends TensorRank0<Short>
{
    public ShortTensorRank0()
    {
        super(Short.class);
    }


    @Override
    public String print()
    {
        return Short.toString(get());
    }
}
