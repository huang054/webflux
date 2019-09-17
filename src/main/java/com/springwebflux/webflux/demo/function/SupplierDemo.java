package function;

import java.util.function.Supplier;

/**
 * @author huangjun
 * @version V1.0
 * @Description: Supplier
 * @Date Create in 15:53 2019/09/17
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> stringSupplier=()->"test ";
        Supplier<String> stringSupplier1=()->"supplier";
        System.out.println(stringSupplier.get()+stringSupplier1.get());
    }
}
