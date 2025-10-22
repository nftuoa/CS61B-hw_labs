public class tests {
    public static void main(String[] args) {
        Deque61B<Integer> a = new LinkedListDeque61B<>();
        a.addFirst(1);
        a.addFirst(2);
        a.addFirst(3);
        System.out.println(a.size());
        a.removeLast();
        System.out.println(a.size());
        a.addLast(4);
    }
}
