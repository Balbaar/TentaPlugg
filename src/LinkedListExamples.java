

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(11);
        list.add(7);
        list.add(5);
        System.out.println(list.toString());
        list.drop(3);
        System.out.println(list.toString());
    }
}
