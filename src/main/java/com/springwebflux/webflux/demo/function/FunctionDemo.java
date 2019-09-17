package function;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 15:53 2019/09/17
 */
public class FunctionDemo {
    static int function1(int num, Function<Integer,Integer> function){
       return function.apply(num);

    }
    static int function2(int num, Function<Integer,Integer> function){
       Function<Integer,Integer> before=(m)->{
           return m-10;
       };
        Function<Integer,Integer> after=(m)->{
            return m+10;
        };
        return function.compose(before).andThen(after).apply(num);
    }
    public static void main(String[] args) {
      System.out.println(function1(10,m->10+m));
      System.out.println(function2(20,m->{
          System.out.println("买酱油前有" + m + "元");
          Integer v2 = m - 10;
          System.out.println("买完酱油后剩下" + v2 + "元");
          return v2;
      }));
    }
}
