package structures;

public final class QueueBasedOnArray extends BasedOnArrayDataStorage {

    public QueueBasedOnArray(int size) {
        super(size);
    }

    public QueueBasedOnArray() {
    }

    @Override
    protected int getItNotEmpty() {
        int result = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        size--;
        return result;
    }

   /* @Override
    public int get() {
        if (size > 0) {
            int result = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            size--;
            return result;
        } else {
            // TODO throw Exception
            return 0;
        }
    }*/

}