package structures;

public final class StackBasedOnArray extends BasedOnArrayDataStorage{

    public StackBasedOnArray(int size) {
        super(size);
    }

    public StackBasedOnArray() {
    }

    @Override // не понятно что происходит с size, см. мое решение ниже
    public int get() {
        if (size > 0) {
            return array[--size];
        } else {
            // TODO throw Exception
            return 0;
        }
    }

     /*@Override
    public int get() {
        int result = array[array.length-1];
        if(size>0) {
            System.arraycopy(array,0,array,1,array.length-1);
            size--;
            return result;
        } else {
        return 0;
        }
    }*/
}
