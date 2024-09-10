package io.github.orionlibs.orion_jtensor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class TensorTest extends ATest
{
    @Test
    void test_tensorCreation_0()
    {
        Tensor<Integer> tensor = new Tensor<>(Integer.class, 0);
        tensor.set(42);
        assertEquals(42, tensor.get());
        String tensorAsString = tensor.printTensor();
        assertEquals("42", tensorAsString);
    }
    @Test
    void test_tensorCreation_2()
    {
        Tensor<Integer> tensor = new Tensor<>(Integer.class, 2);
        tensor.set(42, 0);
        assertEquals(42, tensor.get(0));
        assertEquals(0, tensor.get(1));
        String tensorAsString = tensor.printTensor();
        assertEquals("[42, 0]", tensorAsString);
    }


    @Test
    void test_tensorCreation_2x2()
    {
        Tensor<Integer> tensor = new Tensor<>(Integer.class, 2, 2);
        tensor.set(42, 0, 0);
        tensor.set(7, 1, 1);
        assertEquals(42, tensor.get(0, 0));
        assertEquals(7, tensor.get(1, 1));
        String tensorAsString = tensor.printTensor();
        System.out.println(tensorAsString);
        assertEquals("[[42 0][0 7]]", tensorAsString);
    }


    @Test
    void test_tensorCreation_3x3x3()
    {
        Tensor<Integer> tensor = new Tensor<>(Integer.class, 3, 3, 3);
        tensor.set(42, 0, 0, 0);
        tensor.set(7, 1, 1, 1);
        tensor.set(99, 2, 2, 2);
        assertEquals(42, tensor.get(0, 0, 0));
        assertEquals(7, tensor.get(1, 1, 1));
        assertEquals(99, tensor.get(2, 2, 2));
        String tensorAsString = tensor.printTensor();
        System.out.println(tensorAsString);
        assertEquals("[[42 0][0 7]]", tensorAsString);
    }
}
