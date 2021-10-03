package inclass;

public class IntegerSet implements Set<Integer> {
    
    private boolean[] data;
    private int size;

    public IntegerSet() {
        this.data = new boolean[100];
    }
    
    @Override
    public void add(Integer key) {
        if (!data[key]) {
            data[key] = true;
            size++;
        }
    }

    @Override
    public boolean contains(Integer key) {
        return data[key];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void remove(Integer key) {
        if (data[key]) {
            data[key] = false;
            size--;
        }
    }
}
