import lab6.Coffee;

import java.util.*;

public class List implements InterfaceList<Coffee> {


    private int capacity;
    private int size;
    private Coffee[] array = null;

    public List() {
        array = new Coffee[15];
    }

    public List(int capacity) {
        array = new Coffee[capacity];
    }

    public List(Coffee Coffee) {
        array = new Coffee[15];
        array[0] = Coffee;
        this.size++;
    }

    public List(java.util.List<Coffee> list) {
        if (list.size() > 15) {
            array = new Coffee[list.size() + 2];
            array = list.toArray(array);
        } else {
            array = new Coffee[15];
            array = list.toArray(array);
        }
    }


    @Override
    public boolean add(Coffee coffee) {


        if (this.size <= array.length - 2) {
            array[this.size++] = coffee;
            return true;
        } else {
            int newCapacity = array.length + ((array.length * 30) / 100) + 1;
            Coffee[] oldData = array;
            array = new Coffee[newCapacity];

            System.arraycopy(oldData, 0, array, 0, size);

            array[this.size++] = coffee;
            return true;
        }
    }


    private int getIndexExistObject(Coffee coffee) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null && this.array[i].equals(coffee)) {
                return i;
            }
        }
        return -1;
    }


    void getSet() {
        System.out.println(Arrays.toString(this.array));
    }

    @Override
    public boolean remove(Coffee coffee) {
        int indexOfObject = getIndexExistObject(coffee);
        if (indexOfObject == -1) {
            return false;
        } else {
            this.array[indexOfObject] = null;


            int numMoved = size - indexOfObject - 1;
            if (numMoved > 0)
                System.arraycopy(array, indexOfObject + 1, array, indexOfObject,
                        numMoved);

            this.size--;
            return true;
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Coffee coffee) {
        return Arrays.asList(this.array).contains(coffee);
    }

    @Override
    public Coffee get(int index) {
        return this.array[index];
    }


    @Override
    public Iterator<Coffee> iterator() {

        Iterator<Coffee> it = new Iterator<Coffee>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public Coffee next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }


    @Override
    public String toString() {


        Iterator iterator = this.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        return "";
    }
}

