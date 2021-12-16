package structures;

public abstract class BaseDataStorage implements DataStorage {

    protected int size;

    @Override
    public final int size() {
        return size;
    }
}