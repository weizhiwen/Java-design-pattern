package strategy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 9:30
 * To change this template use File | Settings | File Templates.
 * Description: 打5折策略类
 */
public class Discount5Strategy extends AbstractStrategy {

    @Override
    public double algorithmInterface(double totalPrice) {
        return totalPrice * 0.5;
    }
}
