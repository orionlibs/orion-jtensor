package io.github.orionlibs.orion_jtensor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class JTensorTest extends ATest
{
    @Test
    void test_BooleanTensorRank0_creation()
    {
        BooleanTensorRank0 t = JTensor.newBooleanTensorRank0();
        assertEquals(Boolean.FALSE, t.get());
        t.set(Boolean.TRUE);
        assertEquals(Boolean.TRUE, t.get());
        assertEquals("true", t.print());
    }


    @Test
    void test_LongTensorRank0_creation()
    {
        LongTensorRank0 t = JTensor.newLongTensorRank0();
        assertEquals(0L, t.get());
        t.set(15L);
        assertEquals(15L, t.get());
        assertEquals("15", t.print());
    }


    @Test
    void test_IntegerTensorRank0_creation()
    {
        IntegerTensorRank0 t = JTensor.newIntegerTensorRank0();
        assertEquals(0, t.get());
        t.set(15);
        assertEquals(15, t.get());
        assertEquals("15", t.print());
    }


    @Test
    void test_ShortTensorRank0_creation()
    {
        ShortTensorRank0 t = JTensor.newShortTensorRank0();
        assertEquals((short)0, t.get());
        t.set((short)15);
        assertEquals((short)15, t.get());
        assertEquals("15", t.print());
    }


    @Test
    void test_ByteTensorRank0_creation()
    {
        ByteTensorRank0 t = JTensor.newByteTensorRank0();
        assertEquals((byte)0, t.get());
        t.set((byte)15);
        assertEquals((byte)15, t.get());
        assertEquals("15", t.print());
    }


    @Test
    void test_FloatTensorRank0_creation()
    {
        FloatTensorRank0 t = JTensor.newFloatTensorRank0();
        assertEquals(0.0f, t.get());
        t.set(15.2f);
        assertEquals(15.2f, t.get());
        assertEquals("15.2", t.print());
    }


    @Test
    void test_DoubleTensorRank0_creation()
    {
        DoubleTensorRank0 t = JTensor.newDoubleTensorRank0();
        assertEquals(0.0d, t.get());
        t.set(15.2d);
        assertEquals(15.2d, t.get());
        assertEquals("15.2", t.print());
    }


    @Test
    void test_BigIntegerTensorRank0_creation()
    {
        BigIntegerTensorRank0 t = JTensor.newBigIntegerTensorRank0();
        assertEquals(BigInteger.ZERO, t.get());
        t.set(BigInteger.valueOf(100));
        assertEquals(BigInteger.valueOf(100), t.get());
        assertEquals("100", t.print());
    }


    @Test
    void test_BigDecimalTensorRank0_creation()
    {
        BigDecimalTensorRank0 t = JTensor.newBigDecimalTensorRank0();
        assertEquals(BigDecimal.ZERO, t.get());
        t.set(new BigDecimal("100.64"));
        assertEquals(new BigDecimal("100.64"), t.get());
        assertEquals("100.64", t.print());
    }


    @Test
    void test_ComplexFloatTensorRank0_creation()
    {
        ComplexFloatTensorRank0 t = JTensor.newComplexFloatTensorRank0();
        assertEquals(ComplexFloat.ZERO.getRealValue(), t.get().getRealValue());
        assertEquals(ComplexFloat.ZERO.getImaginaryValue(), t.get().getImaginaryValue());
        assertEquals(ComplexFloat.ZERO, t.get());
        assertEquals("0.0 + 0.0i", t.print());
        t.set(ComplexFloat.of(15.2f, 25.2f));
        assertEquals(ComplexFloat.of(15.2f, 25.2f), t.get());
        assertEquals("15.2 + 25.2i", t.print());
    }


    @Test
    void test_ComplexDoubleTensorRank0_creation()
    {
        ComplexDoubleTensorRank0 t = JTensor.newComplexDoubleTensorRank0();
        assertEquals(ComplexDouble.ZERO.getRealValue(), t.get().getRealValue());
        assertEquals(ComplexDouble.ZERO.getImaginaryValue(), t.get().getImaginaryValue());
        assertEquals(ComplexDouble.ZERO, t.get());
        assertEquals("0.0 + 0.0i", t.print());
        t.set(ComplexDouble.of(15.2d, 25.2d));
        assertEquals(ComplexDouble.of(15.2d, 25.2d), t.get());
        assertEquals("15.2 + 25.2i", t.print());
    }


    @Test
    void test_ComplexBigDecimalTensorRank0_creation()
    {
        ComplexBigDecimalTensorRank0 t = JTensor.newComplexBigDecimalTensorRank0();
        assertEquals(ComplexBigDecimal.ZERO.getRealValue(), t.get().getRealValue());
        assertEquals(ComplexBigDecimal.ZERO.getImaginaryValue(), t.get().getImaginaryValue());
        assertEquals(ComplexBigDecimal.ZERO, t.get());
        assertEquals("0 + 0i", t.print());
        t.set(ComplexBigDecimal.of(new BigDecimal("15.2"), new BigDecimal("25.2")));
        assertEquals(ComplexBigDecimal.of(new BigDecimal("15.2"), new BigDecimal("25.2")), t.get());
        assertEquals("15.2 + 25.2i", t.print());
    }
}
