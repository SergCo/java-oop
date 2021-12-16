package structures;

public final class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {

    private Item last;

    @Override
    protected void addNextItem(Item item) {
        if (last == null) {
            last = first;
        }
        last.next = item;
        last = item;
    }

    @Override
    public int get() {
        int result = super.get();
        if (size == 0) {
            last = null;
        }
        return result;
    }
}
