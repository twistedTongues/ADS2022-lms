package by.it.group151051.klezovich.lesson09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SetC<T> implements Set<T>
{
    HashMap<T, Object> lod;
    private static final Object initObject = new Object();

    public SetC()
    {
        lod = new HashMap<>();
    }

    @Override
    public int size() {
        return lod.size();
    }

    @Override
    public boolean isEmpty() {
        return lod.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return lod.containsKey(o);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(T element) {
        return lod.put(element, initObject) == null;
    }

    @Override
    public boolean remove(Object o) {
        return lod.remove(o) != null;
    }

    @Override
    public boolean containsAll(Collection<?> list)
    {
        for (Object element : list)
            if (!contains(element))
                return false;

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> list)
    {
        boolean res = false;

        for (T element : list)
        {
            add(element);
            res = true;
        }

        return res;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> list) {
        boolean res = false;

        for (Object element : list)
        {
            remove(element);
            res = true;
        }

        return res;
    }

    @Override
    public void clear() {
        lod = new HashMap<>();
    }

    @Override
    public String toString() {
        return lod.toString();
    }
}