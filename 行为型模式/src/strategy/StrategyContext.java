package strategy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 9:43
 * To change this template use File | Settings | File Templates.
 * Description: 策略调用类
 */
public class StrategyContext {
    private AbstractStrategy strategy;

    public StrategyContext(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public double getActualPrice(double totalPrice) {
        return strategy.algorithmInterface(totalPrice);
    }
}
