package others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @Test
    public void call_capacity_when_expectCapacity_smaller_than_16_then_return_16() {
        dynamicArray = new DynamicArray(8);

        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    @Test
    public void call_capacity_when_expectCapacity_equal_16_then_return_16() {
        dynamicArray = new DynamicArray(16);

        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    @Test
    public void call_capacity_when_expectCapacity_greater_than_16_then_return_ceiling_of_2_power() {
        dynamicArray = new DynamicArray(27);

        Assertions.assertEquals(32, dynamicArray.capacity());
    }

    @Test
    public void call_size_when_push_two_objects_then_return_2() {
        dynamicArray = new DynamicArray();
        dynamicArray.push(1);
        dynamicArray.push(2);

        Assertions.assertEquals(2, dynamicArray.size());
    }

    @Test
    public void call_size_when_nothing_then_return_0() {
        dynamicArray = new DynamicArray();

        Assertions.assertEquals(0, dynamicArray.size());
    }

    @Test
    public void call_isEmpty_when_nothing_then_true() {
        dynamicArray = new DynamicArray();

        Assertions.assertTrue(dynamicArray.isEmpty());
    }

    @Test
    public void call_isEmpty_when_push_one_object_then_false() {
        dynamicArray = prepareWithItems(1);

        Assertions.assertFalse(dynamicArray.isEmpty());
    }

    @Test
    public void call_at_when_index_out_of_bounds_then_throw_runtimeException() {
        dynamicArray = new DynamicArray(16);

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.at(999));
        Assertions.assertEquals("out of bounds", actual.getMessage());
    }

    @Test
    public void call_at_when_index_same_with_capacity_then_throw_runtimeException() {
        dynamicArray = new DynamicArray(32);

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.at(32));
        Assertions.assertEquals("out of bounds", actual.getMessage());
    }

    @Test
    public void call_at_when_index_smaller_than_capacity_then_throw_runtimeException() {
        dynamicArray = new DynamicArray(32);

        Assertions.assertNull(dynamicArray.at(31));
    }

    @Test
    public void call_at_when_item_exists_then_return_item() {
        Object expectItem = new Object();
        dynamicArray = prepareWithItems(expectItem);

        Assertions.assertEquals(expectItem, dynamicArray.at(0));
    }

    @Test
    public void call_at_when_item_not_exists_then_return_null() {
        dynamicArray = new DynamicArray(16);

        Assertions.assertNull(dynamicArray.at(8));
    }

    @Test
    public void call_push_when_capacity_full_then_size_grow_two_times_and_move_items() {
        dynamicArray = prepareItemsSameWithCapacity(16);

        dynamicArray.push(16);

        Assertions.assertArrayEquals(prepareItemsSameWithCapacity(17).get(), dynamicArray.get());
        Assertions.assertEquals(32, dynamicArray.capacity());
    }

    @Test
    public void given_three_items_when_insert_into_middle_then_pushback_item() {
        dynamicArray = prepareWithItems(1, 2, 3);

        dynamicArray.insert(1, 4);

        Assertions.assertArrayEquals(prepareWithItems(1, 4, 2, 3).get(), dynamicArray.get());
    }

    @Test
    public void given_one_item_when_prepend_then_pushback_existed_item() {
        dynamicArray = prepareWithItems(1);

        dynamicArray.prepend(100);

        Assertions.assertArrayEquals(prepareWithItems(100, 1).get(), dynamicArray.get());
    }

    @Test
    public void given_one_item_when_pop_then_return_item_and_become_empty() {
        Object expect = 1;
        dynamicArray = prepareWithItems(1);

        Object actual = dynamicArray.pop();

        Assertions.assertEquals(expect, actual);
        Assertions.assertTrue(dynamicArray.isEmpty());
    }

    @Test
    public void given_no_item_when_pop_then_throw_runtimeException() {
        dynamicArray = new DynamicArray();

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.pop());
        Assertions.assertEquals("no item", actual.getMessage());
    }

    private DynamicArray prepareItemsSameWithCapacity(int capacity) {
        DynamicArray array = new DynamicArray(capacity);
        for (int i = 0; i < capacity; i++) {
            array.push(i);
        }

        return array;
    }

    private DynamicArray prepareWithItems(Object... obj) {
        DynamicArray array = new DynamicArray(obj.length);
        for (int i = 0; i < obj.length; i++) {
            array.push(obj[i]);
        }

        return array;
    }
}