public class LinkedLists<E> {
    private ListNode<E> first;
    private int size;

    /** Skapar en tom lista. */
    public LinkedLists() {
        first = null;
        size = 0;
    }

    public void rotate(int k) {
        //Ifall antal rotationer är 0 eller mer än storleken på listan
        if(k < 0 || k > size) {
            throw new IllegalArgumentException("Inte bra");
        }

        if (k == 0 || size == 0) {
            return;
        }

        ListNode<E> current = first;
        for (int i = 0; i < size - k - 1; i++) {
            current = current.next;
        }

        ListNode<E> newFirst = current.next;
        current.next = null;
        current = newFirst;
        while (current.next != null) {
            current = current.next;
        }
        current.next = first;
        first = newFirst;
    }

    public void drop(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Negativ");
        }

        if(size < n) {
            first = null;
        }

        else {
            for(int i = 0; i < n; i++) {
                first = first.next;
                size--;
            }
        }
    }

    public void add(E i) {
        ListNode<E> newNode = new ListNode<>(i);
        if (first == null) {
            first = newNode;
        } else {
            ListNode<E> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode<E> current = first;
        while (current != null) {
            sb.append(current.element);
            sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    // övriga metoder - ska inte användas i lösningen av uppgiften

    /* Nästlad klass. Representerar en nod med ett element av typen E. */
    private static class ListNode<E> {
        private E element;
        private ListNode<E> next;

        /* Creates a node that contains e. */
        private ListNode(E e) {
            element = e;
            next = null;
        }
    }
}
