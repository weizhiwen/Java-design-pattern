package strategy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 9:24
 * To change this template use File | Settings | File Templates.
 * Description: 正常收费策略类
 */
public class NormalStrategy extends AbstractStrategy {

    @Override
    public double algorithmInterface(double totalPrice) {
        return totalPrice;
    }
}
