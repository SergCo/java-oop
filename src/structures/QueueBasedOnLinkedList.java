package structures;

public class QueueBasedOnLinkedList implements DataStorage{

    private Item first;
    private Item last;
    private int size=0;

    @Override
    public void add(int value) {
      Item newItem = new Item(value);
      if(first==null) {
          first=last=newItem;
      } else {
          last.next=newItem;
          last=newItem;
                }
      size++;
    }

    @Override
    public int get() {
          if(size>0) {
          int result=first.value;
          first=first.next;
          size--;
          return result;
        } else {
        return 0;
        }
    }

    @Override
    public int size() {
        return size;
    }

    class Item {
         int value;
         Item next;

        Item(int value) {
            this.value = value;
        }
    }
}
