package io.github.orionlibs.orion_jtensor;

public class ComplexDoubleTensorRank0 extends TensorRank0<ComplexDouble>
{
    public ComplexDoubleTensorRank0()
    {
        super(ComplexDouble.class);
    }


    @Override
    public String print()
    {
        return get().toString();
    }
}
