package strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 9:48
 * To change this template use File | Settings | File Templates.
 * Description: 策略模式测试类
 */
public class StrategyTest {
    StrategyContext strategyContext = null;

    @Test
    @DisplayName("Test normal price")
    public void testNormalStrategy() {
        strategyContext = new StrategyContext(new NormalStrategy());
        Assertions.assertEquals(100, strategyContext.getActualPrice(100));
    }

    @Test
    @DisplayName("Test discount 80%")
    public void testDiscount8Strategy() {
        strategyContext = new StrategyContext(new Discount8Strategy());
        Assertions.assertEquals(160, strategyContext.getActualPrice(200));
    }

    @Test
    @DisplayName("Test discount 70%")
    public void testDiscount6Strategy() {
        strategyContext = new StrategyContext(new Discount7Strategy());
        Assertions.assertEquals(140, strategyContext.getActualPrice(200));
    }

    @Test
    @DisplayName("Test discount 50%")
    public void testDiscount5Strategy() {
        strategyContext = new StrategyContext(new Discount5Strategy());
        Assertions.assertEquals(100, strategyContext.getActualPrice(200));
    }

    @Test
    @DisplayName("Test over 300 minus 100")
    public void testOver300Minus100() {
        strategyContext = new StrategyContext(new OverMinusStrategy());
        Assertions.assertEquals(240, strategyContext.getActualPrice(340));
    }

    @Test
    @DisplayName("Test over 500 minus 200")
    public void testOver500Minus200() {
        strategyContext = new StrategyContext(new OverMinusStrategy());
        Assertions.assertEquals(340, strategyContext.getActualPrice(540));
    }
}
