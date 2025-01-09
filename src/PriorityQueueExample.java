import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    //easy exmaple of priority queue
    public static void main(String[] args) {




        TopElements<Integer> top = new TopElements<>((n1, n2) -> n1 - n2, 3);
        top.add(1);
        top.add(3);
        top.add(2);

        top.add(7);
        top.add(5);

        System.out.println(top.largest());
    }
}
