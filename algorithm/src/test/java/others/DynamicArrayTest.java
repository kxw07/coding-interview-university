package others;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @Test
    public void given_two_items_when_call_size_then_return_2() {
        dynamicArray = prepareWith(new Item(1), new Item(2));

        Assertions.assertEquals(2, dynamicArray.size());
    }

    @Test
    public void given_no_item_when_call_size_then_return_0() {
        dynamicArray = new DynamicArray();

        Assertions.assertEquals(0, dynamicArray.size());
    }

    @Test
    public void given_no_item_when_call_isEmpty_then_return_true() {
        dynamicArray = new DynamicArray();

        Assertions.assertTrue(dynamicArray.isEmpty());
    }

    @Test
    public void given_items_when_call_isEmpty_then_return_false() {
        dynamicArray = prepareWith(new Item(1));

        Assertions.assertFalse(dynamicArray.isEmpty());
    }

    @Test
    public void initial_with_capacity_smaller_than_default_16_when_call_capacity_then_return_16() {
        dynamicArray = new DynamicArray(8);

        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    @Test
    public void initial_without_specific_capacity_when_call_capacity_then_return_default_16() {
        dynamicArray = new DynamicArray();

        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    @Test
    public void initial_with_capacity_greater_then_default16_when_call_capacity_then_return_ceiling_of_2_power() {
        dynamicArray = new DynamicArray(27);

        Assertions.assertEquals(32, dynamicArray.capacity());
    }

    @Test
    public void given_items_when_call_get_then_return_items() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        Item[] expect = {new Item(1), new Item(2), new Item(3), null, null, null, null, null, null, null, null, null, null, null, null, null};
        Assertions.assertArrayEquals(expect, dynamicArray.get());
    }

    @Test
    public void given_capacity_16_when_call_at_with_999_then_throw_runtimeException_with_message_out_of_bounds() {
        dynamicArray = new DynamicArray(16);

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.at(999));
        Assertions.assertEquals("out of bounds", actual.getMessage());
    }

    @Test
    public void given_capacity_16_when_call_at_with_16_then_throw_runtimeException_with_message_out_of_bounds() {
        dynamicArray = new DynamicArray(32);

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.at(32));
        Assertions.assertEquals("out of bounds", actual.getMessage());
    }

    @Test
    public void given_capacity_16_when_call_at_with_15_then_return_item() {
        dynamicArray = new DynamicArray(16);

        Assertions.assertNull(dynamicArray.at(15));
    }

    @Test
    public void given_item_at_index_0_when_call_at_then_return_item() {
        Item expectItem = new Item(0);
        dynamicArray = prepareWith(expectItem);

        Assertions.assertEquals(expectItem, dynamicArray.at(0));
    }

    @Test
    public void given_empty_when_push_then_status_correct() {
        Item expect = new Item(1);
        dynamicArray = new DynamicArray(16);
        dynamicArray.push(expect);

        Assertions.assertEquals(1, dynamicArray.size());
        Assertions.assertEquals(16, dynamicArray.capacity());
        Assertions.assertFalse(dynamicArray.isEmpty());
        Assertions.assertEquals(expect, dynamicArray.at(0));
        Assertions.assertNull(dynamicArray.at(1));
    }

    @Test
    public void given_capacity_full_when_push_then_capacity_grow_two_times_and_move_items() {
        dynamicArray = prepareFullCapacityItems(16);

        dynamicArray.push(16);

        Assertions.assertArrayEquals(prepareFullCapacityItems(17).get(), dynamicArray.get());
        Assertions.assertEquals(32, dynamicArray.capacity());
    }

    @Test
    public void given_one_item_when_prepend_then_pushback_existed_item() {
        dynamicArray = prepareWith(new Item(1));

        dynamicArray.prepend(new Item(100));

        Assertions.assertArrayEquals(prepareWith(new Item(100), new Item(1)).get(), dynamicArray.get());
    }

    @Test
    public void given_three_items_when_insert_into_middle_then_pushback_item() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        dynamicArray.insert(1, new Item(4));

        Assertions.assertArrayEquals(prepareWith(new Item(1), new Item(4), new Item(2), new Item(3)).get(), dynamicArray.get());
    }

    @Test
    public void given_one_item_when_pop_then_return_item_and_become_empty() {
        Item expect = new Item(1);
        dynamicArray = prepareWith(new Item(1));

        Object actual = dynamicArray.pop();

        Assertions.assertEquals(expect, actual);
        Assertions.assertTrue(dynamicArray.isEmpty());
    }

    @Test
    public void given_no_item_when_pop_then_throw_runtimeException_with_message_no_objects() {
        dynamicArray = new DynamicArray();

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.pop());
        Assertions.assertEquals("no objects", actual.getMessage());
    }

    @Test
    public void given_one_quarter_capacity_items_when_popped_then_shrink_capacity_half() {
        dynamicArray = prepareFullCapacityItems(17);
        Assertions.assertEquals(32, dynamicArray.capacity());

        int leftOneQuarter = 10;

        popMultipleTimes(leftOneQuarter);

        System.out.println(dynamicArray.size());
        Assertions.assertEquals(16, dynamicArray.capacity());
    }

    private void popMultipleTimes(int times) {
        for (int i = 0; i < times; i++) {
            dynamicArray.pop();
        }
    }

    private DynamicArray prepareFullCapacityItems(int capacity) {
        DynamicArray array = new DynamicArray(capacity);
        for (int i = 0; i < capacity; i++) {
            array.push(i);
        }

        return array;
    }

    private DynamicArray prepareWith(Item... item) {
        DynamicArray array = new DynamicArray(item.length);
        for (int i = 0; i < item.length; i++) {
            array.push(item[i]);
        }

        return array;
    }

    @Test
    public void given_items_1_2_3_when_delete_index_1_then_be_1_3() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        dynamicArray.delete(1);

        Assertions.assertArrayEquals(prepareWith(new Item(1), new Item(3)).get(), dynamicArray.get());
    }

    @Test
    public void when_delete_out_of_range_then_throw_runtimeException() {
        dynamicArray = new DynamicArray(16);

        RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> dynamicArray.delete(99999));
        Assertions.assertEquals("out of bounds", actual.getMessage());
    }

    @Test
    public void given_items_with_1_2_3_when_remove_item_2_then_be_1_null_3() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        dynamicArray.remove(new Item(2));

        Assertions.assertArrayEquals(prepareWith(new Item(1), null, new Item(3)).get(), dynamicArray.get());

    }

    @Test
    public void given_items_with_1_2_2_3_when_remove_item_2_then_be_1_null_null_3() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(2), new Item(3));

        dynamicArray.remove(new Item(2));

        Assertions.assertArrayEquals(prepareWith(new Item(1), null, null, new Item(3)).get(), dynamicArray.get());
    }

    @Test
    public void given_1_2_3_when_remove_4_then_no_change() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        dynamicArray.remove(4);

        Assertions.assertArrayEquals(prepareWith(new Item(1), new Item(2), new Item(3)).get(), dynamicArray.get());
    }

    @Test
    public void given_items_1_2_3_when_find_item_2_then_return_index_1() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        int foundIndex = dynamicArray.find(new Item(2));

        Assertions.assertEquals(1, foundIndex);
    }

    @Test
    public void given_items_1_2_3_when_find_item_100_then_return_minus_1() {
        dynamicArray = prepareWith(new Item(1), new Item(2), new Item(3));

        int actual = dynamicArray.find(new Item(100));

        Assertions.assertEquals(-1, actual);
    }

    class Item {
        private final int value;

        public Item(int value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(value);
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;

            if (!(o instanceof Item))
                return false;

            Item other = (Item) o;
            return this.value == other.value;
        }
    }
}