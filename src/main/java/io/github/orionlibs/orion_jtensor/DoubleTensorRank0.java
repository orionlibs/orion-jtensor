package io.github.orionlibs.orion_jtensor;

public class DoubleTensorRank0 extends TensorRank0<Double>
{
    public DoubleTensorRank0()
    {
        super(Double.class);
    }


    @Override
    public String print()
    {
        return Double.toString(get());
    }
}
