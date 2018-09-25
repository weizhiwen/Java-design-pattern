package strategy.simpleFactory;

import strategy.*;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 * Description: 策略模模式与简单工厂结合
 */
public class StrategyContext {
    private AbstractStrategy AbstractStrategy;

    public StrategyContext(int strategy) {
        switch (strategy) {
            case 0:
                // 正常收费
                AbstractStrategy = new NormalStrategy();
                break;
            case 1:
                // 打 8 折
                AbstractStrategy = new Discount8Strategy();
                break;
            case 2:
                // 打 7 折
                AbstractStrategy = new Discount7Strategy();
                break;
            case 3:
                // 打 5 折
                AbstractStrategy = new Discount5Strategy();
                break;
            case 4:
                // 满减
                AbstractStrategy = new OverMinusStrategy();
                break;
            default:
                throw new RuntimeException("暂无该收费策略");
        }
    }

    public double getActualPrice(double totalPrice) {
        return AbstractStrategy.algorithmInterface(totalPrice);
    }
}
