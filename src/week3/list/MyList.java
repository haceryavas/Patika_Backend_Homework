package week3.list;

public class MyList<T> {
    private T[] items;        // The underlying array to store list elements
    private int capacity;     // Current capacity of the list
    private int size = 0;     // Number of elements currently in the list

    // Constructor with custom capacity
    public MyList(int capacity) {
        this.capacity = capacity;
        items = (T[]) new Object[capacity];
    }

    // Default constructor with capacity 10
    public MyList() {
        this.capacity = 10;
        items = (T[]) new Object[capacity];
    }

    // Returns the current capacity
    public int getCapacity() {
        return capacity;
    }

    // Returns the number of elements in the list
    public int size() {
        return size;
    }

    // Adds a new element to the end of the list
    public void add(T data) {
        if (capacity - 1 == size) {
            resize();
        }
        items[size] = data;
        size++;
    }

    // Doubles the capacity and copies existing elements to the new array
    private void resize(){
        capacity *= 2;

        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(items, 0, newArray, 0, items.length);
        items = newArray;
    }

    // Returns the element at a given index
    public T get(int i) {
        if (i >= 0 && i < size) {
            return items[i];
        }
        return null;
    }

    // Removes the element at a specific index and shifts remaining elements left
    public T remove(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        T removed = items[i];
        int j;
        for (j = i; j < size - 1; j++) {
            items[j] = items[j + 1];
        }
        items[j] = null;
        size--;
        return removed;
    }

    // Replaces the element at a specific index with a new value
    public T set(int i, T data) {
        if (i < 0 || i >= size) {
            return null;
        }
        T oldData = items[i];
        items[i] = data;
        return oldData;
    }

    // Returns a string representation of the list
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[ ");

        sb.append(items[0]);
        for (int i = 1; i < size; i++) {
            sb.append(", ").append(items[i]);
        }

        sb.append(" ]");
        return sb.toString();
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the first index of the given data or -1 if not found
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data != null && data.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    // Returns the last index of the given data or -1 if not found
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (data != null && data.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    // Converts the list into an Object array
    public Object[] toArray() {
        Object[] objectArray = new Object[size];
        System.arraycopy(items, 0, objectArray, 0, size);
        return objectArray;
    }

    // Returns a sublist from the given start index to end index (inclusive)
    public MyList<T> subList(int start, int end) {
        if (start < 0 || end >= size || start > end) {
            throw new IndexOutOfBoundsException("Invalid subList range");
        }

        MyList<T> subList = new MyList<>();
        for (int i = start; i <= end; i++) {
            subList.add(items[i]);
        }


        return subList;
    }

    // Checks if the list contains a given element
    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (data != null && data.equals(items[i])) {
                return true;
            }
        }

        return false;
    }

    // Clears the list and resets it to default capacity
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }

        size = 0;
        capacity = 10;
        items = (T[]) new Object[capacity];
    }

}
