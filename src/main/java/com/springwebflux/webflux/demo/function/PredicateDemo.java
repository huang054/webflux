package function;

import java.util.function.Predicate;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 15:53 2019/09/17
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate =t->t.equals("predicate");
        Predicate<String> predicate1 =t->t.length()<5;
       System.out.println(predicate.test("predicate"));
       System.out.println(predicate.negate().test("predicate"));
       System.out.println(predicate.and(predicate1).test("predicate"));
       System.out.println(predicate.or(predicate1).test("predicate"));

    }
}
