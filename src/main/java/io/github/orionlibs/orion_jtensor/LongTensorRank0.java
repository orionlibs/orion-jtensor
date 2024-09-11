package io.github.orionlibs.orion_jtensor;

public class LongTensorRank0 extends TensorRank0<Long>
{
    public LongTensorRank0()
    {
        super(Long.class);
    }


    @Override
    public String print()
    {
        return Long.toString(get());
    }
}
