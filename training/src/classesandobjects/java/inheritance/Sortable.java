package classesandobjects.java.inheritance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Sortable<T extends Comparable<T>> extends Iterable<T> {
    default public List<T> sort() {
        List<T> list = new ArrayList<>();

        for (T element : this) {
            list.add(element);
        }

        list.sort(Comparator.naturalOrder());
        return list;
    }
}


