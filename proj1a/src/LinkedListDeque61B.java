import java.util.List;
import java.util.ArrayList;

public class LinkedListDeque61B<T>  implements Deque61B<T> {

    private class Node<T> {
        Node<T> next;
        Node<T> prev;
        T item;
        public Node(T item) {
            this.item = item;
        }
        public Node() {

        }
    }

    private final Node<T> sentinel;
    int size = 0;
    private Node<T> current;

    @Override
    public void addFirst(T x) {
        Node<T> newfirst = new Node<T>(x);
        newfirst.next = sentinel.next;
        sentinel.next = newfirst;
        size++;
    }

    @Override
    public void addLast(T x) {
        Node<T> newlast = new Node<T>(x);
        newlast.prev = sentinel.prev;
        sentinel.prev.next = newlast;
        sentinel.prev = newlast;
        newlast.next = sentinel;
        size++;
    }

    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>();
        Node<T> current = sentinel.next;
        while (current != sentinel) {
            if (current != null) {
                list.add(current.item);
                current = current.next;
            }
            else break;

        }
        return list;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        T temp;
        temp = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        size--;
        return temp;
    }

    @Override
    public T removeLast() {
        T temp;
        temp = sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size--;
        return temp;
    }

    @Override
    public T get(int index) {
        current = sentinel;
        if(index < 0 || index >= size) {
            return null;
        }
        return getRecursive(index);
    }

    @Override
    public T getRecursive(int index) {
        if(index==0){
            return current.item;
        }
        else return getRecursive(index-1);
    }

    public LinkedListDeque61B() {
        sentinel = new Node<>();
        sentinel.next = sentinel;
        sentinel.prev = sentinel;

    }


}
