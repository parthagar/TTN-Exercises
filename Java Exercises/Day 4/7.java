import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Vector;

class SpecialStack<E> extends Vector<E> {

    HashMap<E, Integer> elements = new HashMap<>();

    SpecialStack(){}

    E push(E item) {
        addElement(item);

        if(elements.containsKey(item))
            elements.put(item, elements.get(item) + 1);
        else
            elements.put(item, 1);

        return item;
    }

    E pop() {
        E obj;
        int len = size();
        obj = peek();
        removeElementAt(len - 1);

        if(elements.get(obj) > 1)
            elements.put(obj, elements.get(obj) - 1);
        else
            elements.remove(obj);

        return obj;
    }

    synchronized E peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    boolean empty() {
        return size() == 0;
    }

    synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    Object getMin() {
        return elements.keySet().toArray()[0];
    }
}

class Exercise_4_7{

    public static void main(String[] args) {

        SpecialStack<Integer> nums = new SpecialStack<>();

        nums.push(2);
        nums.push(1);
        nums.push(3);

        System.out.println(nums.getMin());
    }
}