import java.util.function.Predicate;

public class PredicateExample {
    //easy example of predicates
    public static void main(String[] args) {
        //create a predicate
        Predicate<Integer> p = n -> n % 2 == 0;
        //test the predicate
        System.out.println(p.test(4));
        System.out.println(p.test(5));
    }
}
