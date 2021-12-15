package structures;


public interface DataStructure {

    void add(int value);

    void add(int[] array);

    void add(DynaArray dynaArray);

    void add(LinkedList list);

    int size();

    void clear();

    int[] toArray();

    boolean remove(int value);

    boolean contains(int value);
}


