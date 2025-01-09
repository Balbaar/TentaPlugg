import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TopElements<E> {
    private PriorityQueue<E> q;
    private int max;
    private Comparator<E> c;

    public TopElements(Comparator<E> c, int max) {
        if(c == null || max <= 0) {
            throw new IllegalArgumentException("Aja baja!");
        }
        this.c = c;
        this.max = max;
        q = new PriorityQueue<E>(c);
    }

    public void add(E e) {
        if(q.size() < max) {
            q.add(e);
        }
        else {
            if(c.compare(e, q.peek()) > 0) {
                q.poll();
                q.add(e);
            }
        }
    }

    public List<E> largest() {
        return new ArrayList<E>(q);
    }
}