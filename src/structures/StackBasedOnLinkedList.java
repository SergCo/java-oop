package structures;

public class StackBasedOnLinkedList implements DataStorage{

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
          Pare pare = new Pare();
          Item previous =  getLast();
          int result = previous.next.value;
          last= previous;
          return result;
        } else {
        return 0;
        }
    }

    @Override
    public int size() {
        return size;
    }

    private Item getLast() {
        Item current = first;
        Item previous = first;
        while(current!=null)
        {
           if(current.next!=null) {
               previous = current;
               current = current.next;
               return previous;

           } else{
               previous=current;
            }
        }
        return null;
    }

    public class Pare {
        private Item current;
        private Item previous;

       }

    class Item {
         int value;
         Item next;

        Item(int value) {
            this.value = value;
        }
    }
}
