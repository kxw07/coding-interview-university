package others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

    @Test
    public void given_size_smaller_than_16_when_new_then_size_is_16() {
        DynamicArray dynamicArray = new DynamicArray(8);

        Assertions.assertEquals(16, dynamicArray.size());
    }

    @Test
    public void given_size_greater_than_16_when_new_then_size_is_ceiling_of_2_power() {
        DynamicArray dynamicArray = new DynamicArray(27);

        Assertions.assertEquals(32, dynamicArray.size());
    }
}