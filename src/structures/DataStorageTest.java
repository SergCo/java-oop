package structures;

class DataStorageTest {

    public static void main(String[] args) {
        DataStorage dataStorage = new StackBasedOnLinkedList(); // new Stack() or new Queue();

        for (int i = 0; i < 5; i++) {
            dataStorage.add(i);
        }

        // 4 3 2 1 0 - for Stack
        // 0 1 2 3 4 - for Queue
        while (dataStorage.size() > 0) {
            System.out.print(dataStorage.get() + " ");
        }
        System.out.println();
    }
}