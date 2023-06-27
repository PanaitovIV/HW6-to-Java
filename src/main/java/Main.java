import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new Set();

        System.out.println("Add: ");
        System.out.println(set.add(555));
        System.out.println(set.add(555));
        System.out.println(set.add(123));
        System.out.println(set.add(876));
        System.out.println(set.add(333));
        System.out.println(set.add(132));
        System.out.println(set.add(443));
        System.out.println(set.add(231));
        System.out.println();

        System.out.println("Remove: ");
        System.out.println(set.remove(123));
        System.out.println(set.remove(234));
        System.out.println();

        System.out.println("Size: ");
        System.out.println(set.add(777));
        System.out.println(set.size());
        System.out.println();

        System.out.println("Is Empty: ");
        System.out.println(set.isEmpty());
        System.out.println();

        System.out.println("Iterator и вывод всех элементов: ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("To String:");
        System.out.println(set.toStr());
    }
}
class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VALL = new Object();
    public boolean add(E tel) {
        return set.put(tel, VALL) == null;
    }
    public boolean remove(E tel) {
        return set.remove(tel) == VALL;
    }
    public int size() {
        return set.size();
    }
    public boolean isEmpty() {
        return set.isEmpty();
    }
    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }
    public String toStr() {
        return set.keySet().toString().replace("[", "").replace("]", "");
    }
}