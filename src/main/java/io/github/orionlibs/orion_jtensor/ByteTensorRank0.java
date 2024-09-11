package io.github.orionlibs.orion_jtensor;

public class ByteTensorRank0 extends TensorRank0<Byte>
{
    public ByteTensorRank0()
    {
        super(Byte.class);
    }


    @Override
    public String print()
    {
        return Byte.toString(get());
    }
}
