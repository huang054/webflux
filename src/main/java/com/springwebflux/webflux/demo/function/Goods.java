package function;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 14:58 2019/09/17
 */
public class Goods {

    private String goodsName;

    private int cost;

    public Goods(String goodsName, int cost) {
        this.goodsName = goodsName;
        this.cost = cost;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
