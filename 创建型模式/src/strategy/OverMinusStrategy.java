package strategy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 9:31
 * To change this template use File | Settings | File Templates.
 * Description: 满减策略类
 */
public class OverMinusStrategy extends AbstractStrategy {
    private final double OVER_500_MINUS_200 = 500;
    private final double OVER_300_MINUS_100 = 300;

    @Override
    public double algorithmInterface(double totalPrice) {
        if (totalPrice > OVER_500_MINUS_200) {
            return totalPrice - 200;
        } else if (totalPrice > OVER_300_MINUS_100) {
            return totalPrice - 100;
        }
        return totalPrice;
    }
}
