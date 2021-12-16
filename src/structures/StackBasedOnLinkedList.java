package structures;

public final class StackBasedOnLinkedList extends BasedOnLinkedListDataStorage {

    @Override
    protected void addNextItem(Item item) {
        item.next = first;
        first = item;
    }
}
