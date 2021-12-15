package structures;

public abstract class BaseDataStructure implements DataStructure {

    protected int count;

    @Override
    public void add(int[] array) {
        for (int value : array) {
            add(value);
        }
    }

    @Override
    public void add(DynaArray dynaArray) {
        add(dynaArray.toArray());
    }

    @Override
    public void add(LinkedList list) {
        add(list.toArray());
    }

    @Override
    public final int size() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
    }
}