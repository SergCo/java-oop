package structures;

import java.util.Arrays;

public class LinkedList {

    private Item first;

    private Item last;

    private int count;

    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    public int[] toArray() {
        DynaArray dynaArray = new DynaArray();
        Item current = first;
        while (current != null) {
            dynaArray.add(current.value);
            current = current.next;
        }
        return dynaArray.toArray();
    }

    public String asString() {
        StringBuilder builder = new StringBuilder().append('[');
        Item current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }
        return builder.append(']').toString();
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean remove(int value) {
        Pair pair = findPair(value);
        if (pair != null) {
            if (pair.current == first && pair.current == last) {
                first = null;
                last = null;
            } else if (pair.current == first) {
                first = pair.current.next;
            } else {
                pair.previous.next = pair.current.next;
                if (pair.current == last) {
                    last = pair.previous;
                }
            }
            count--;
            return true;
        }
        return false;
    }

    private Pair findPair(int value) {
        Item previous = first;
        Item current = first;
        while (current != null) {
            if (current.value == value) {
                return new Pair(previous, current);
            } else {
                previous = current;
                current = current.next;
            }
        }
        return null;
    }

    public int size() {
        return count;
    }
    public boolean contains(int value) {
        return findPair(value) != null;
    }

    private static class Pair {

        private Item previous;

        private Item current;

        private Pair(Item previous, Item current) {
            this.previous = previous;
            this.current = current;
        }
    }


    private static class Item {

        private int value;

        private Item next;

        private Item(int value) {
            this.value = value;
        }
    }


}
