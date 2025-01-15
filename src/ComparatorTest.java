import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        String n1 = "CDE";
        String n2 = "ABC";

        Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);

        System.out.println(comp.compare(n1, n2));
    }
}
