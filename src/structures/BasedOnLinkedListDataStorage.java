package structures;

public abstract class BasedOnLinkedListDataStorage extends BaseDataStorage {

    protected Item first;

    @Override
    public final void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = item;
        } else {
            addNextItem(item);
        }
        size++;
    }

    protected abstract void addNextItem(Item item);

    @Override
    public int get() {
        if (size > 0) {
            int result = first.value;
            first = first.next;
            size--;
            return result;
        } else {
            // TODO throw Exception
            return 0;
        }
    }

     protected static class Item {

        protected int value;

        protected Item next;

        private Item(int value) {
            this.value = value;
        }
    }
}