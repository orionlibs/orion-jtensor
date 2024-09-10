package io.github.orionlibs.orion_jtensor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class TensorRank1Test extends ATest
{
    @Test
    void test_tensorCreation_2()
    {
        TensorRankN<Integer> tensor = new TensorRankN<>(Integer.class, 2);
        tensor.set(42, 0);
        assertEquals(42, tensor.get(0));
        assertEquals(0, tensor.get(1));
        String tensorAsString = tensor.print();
        System.out.println(tensorAsString);
        assertEquals("[42, 0]", tensorAsString);
    }


    @Test
    void test_tensorCreation_2b()
    {
        TensorRank1<Integer> tensor = new TensorRank1<>(Integer.class, 2);
        tensor.set(42, 0);
        assertEquals(42, tensor.get(0));
        assertEquals(0, tensor.get(1));
        String tensorAsString = tensor.print();
        System.out.println(tensorAsString);
        assertEquals("[42, 0]", tensorAsString);
    }
}
