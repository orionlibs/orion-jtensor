package io.github.orionlibs.orion_jtensor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class TensorRank0Test extends ATest
{
    @Test
    void test_tensorRank0_creation()
    {
        TensorRank0<Integer> tensor = new TensorRank0<>(Integer.class);
        tensor.set(42);
        assertEquals(42, tensor.get());
        String tensorAsString = tensor.print();
        assertEquals("42", tensorAsString);
    }
}
