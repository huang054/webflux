package function;

import java.util.function.Consumer;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 15:52 2019/09/17
 */
public class ConsumerDemo {
    static void goodsConshmer(Goods goods, Consumer<Goods> goodsConsumer){
          goodsConsumer.accept(goods);
    }

    static void goodsConshmer1(Goods goods, Consumer<Goods> goodsConsumer){
        goodsConsumer.andThen(x->System.out.println(x.getGoodsName()+x.getCost()))
                .accept(goods);
    }

    public static void main(String[] args) {
        Goods goods = new Goods("西瓜",20);
        goodsConshmer(goods,g->System.out.println(g.getCost()));
        goodsConshmer1(goods,g->System.out.println(g.getCost()));
    }
}
