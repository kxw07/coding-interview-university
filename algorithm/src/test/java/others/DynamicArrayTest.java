package others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @Test
    public void given_expectCapacity_smaller_than_16_when_calling_capacity_then_return_16() {
        dynamicArray = new DynamicArray(8);

        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    @Test
    public void given_expectCapacity_equal_16_when_calling_capacity_then_return_16() {
        dynamicArray = new DynamicArray(16);

        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    @Test
    public void given_expectCapacity_greater_than_16_when_calling_capacity_then_return_ceiling_of_2_power() {
        dynamicArray = new DynamicArray(27);

        Assertions.assertEquals(32, dynamicArray.capacity());
    }

    @Test
    public void given_push_two_objects_when_calling_size_then_return_2() {
        dynamicArray = new DynamicArray();
        dynamicArray.push(1);
        dynamicArray.push(2);

        Assertions.assertEquals(2, dynamicArray.size());
    }

    @Test
    public void given_nothing_when_calling_size_then_return_0() {
        dynamicArray = new DynamicArray();

        Assertions.assertEquals(0, dynamicArray.size());
    }

    @Test
    public void given_nothing_when_calling_isEmpty_then_true() {
        dynamicArray = new DynamicArray();

        Assertions.assertTrue(dynamicArray.isEmpty());
    }

    @Test
    public void given_push_one_object_when_calling_isEmpty_then_false() {
        dynamicArray = new DynamicArray();
        dynamicArray.push(1);

        Assertions.assertFalse(dynamicArray.isEmpty());
    }

    @Test
    public void call_at_when_index_out_of_bounds_then_throw_runtime_exception() {
        dynamicArray = new DynamicArray(16);

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.at(999));
        Assertions.assertEquals("out of bounds", actual.getMessage());
    }

    @Test
    public void call_at_when_item_exists_then_return_item() {
        dynamicArray = new DynamicArray();
        Object expectItem = new Object();
        dynamicArray.push(expectItem);

        Assertions.assertEquals(expectItem, dynamicArray.at(0));
    }

    @Test
    public void call_at_when_item_not_exists_then_return_null() {
        dynamicArray = new DynamicArray(16);

        Assertions.assertNull(dynamicArray.at(8));
    }
}