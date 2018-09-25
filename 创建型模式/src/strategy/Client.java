package strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 10:02
 * To change this template use File | Settings | File Templates.
 * Description: 策略模式客户端模拟类
 */
public class Client {
    private static List<String> strategys = new ArrayList<>(Arrays.asList("正常收费", "打8折", "打7折", "打5折", "满减活动"));
    public static void main(String[] args) throws IOException, InterruptedException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("获取原本收费：");
            double totalPrice = scanner.nextDouble();
            System.out.println("收费策略有：" + strategys.toString());
            System.out.println("选择收费策略（输入下标即可，从 0 开始）：");
            int strategy = scanner.nextInt();
            StrategyContext strategyContext = null;
            double actualPrice = totalPrice;
            switch (strategy) {
                case 0:
                    // 正常收费
                    strategyContext = new StrategyContext(new NormalStrategy());
                    actualPrice = strategyContext.getActualPrice(totalPrice);
                    break;
                case 1:
                    // 打 8 折
                    strategyContext = new StrategyContext(new Discount8Strategy());
                    actualPrice = strategyContext.getActualPrice(totalPrice);
                    break;
                case 2:
                    // 打 7 折
                    strategyContext = new StrategyContext(new Discount7Strategy());
                    actualPrice = strategyContext.getActualPrice(totalPrice);
                    break;
                case 3:
                    // 打 5 折
                    strategyContext = new StrategyContext(new Discount5Strategy());
                    actualPrice = strategyContext.getActualPrice(totalPrice);
                    break;
                case 4:
                    // 满减
                    strategyContext = new StrategyContext(new OverMinusStrategy());
                    actualPrice = strategyContext.getActualPrice(totalPrice);
                    break;
                default:
                    throw new RuntimeException("暂无该收费策略");
            }
            System.out.println("原本收费：" + totalPrice);
            System.out.println("实际收费：" + actualPrice);
            System.out.println("------------------------");
        }
    }
}
