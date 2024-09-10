package io.github.orionlibs.orion_jtensor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class TensorRank3Test extends ATest
{
    @Test
    void test_tensorCreation_3x3x3()
    {
        TensorRankN<Integer> tensor = new TensorRankN<>(Integer.class, 3, 3, 3);
        tensor.set(42, 0, 0, 0);
        tensor.set(7, 1, 1, 1);
        tensor.set(99, 2, 2, 2);
        assertEquals(42, tensor.get(0, 0, 0));
        assertEquals(7, tensor.get(1, 1, 1));
        assertEquals(99, tensor.get(2, 2, 2));
        String tensorAsString = tensor.print();
        System.out.println(tensorAsString);
        assertEquals("[[[[42, 0, 0]][[0, 0, 0]][[0, 0, 0]]][[[0, 0, 0]][[0, 7, 0]][[0, 0, 0]]][[[0, 0, 0]][[0, 0, 0]][[0, 0, 99]]]]", tensorAsString);
    }
}
