package strategy.simpleFactory;

import strategy.simpleFactory.StrategyContext;

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
 * Description: 策略模式与简单工厂模式结合客户端模拟类
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
            StrategyContext strategyContext = new StrategyContext(strategy);
            double actualPrice = strategyContext.getActualPrice(totalPrice);
            System.out.println("原本收费：" + totalPrice);
            System.out.println(strategys.get(strategy) + "后实际收费：" + actualPrice);
            System.out.println("------------------------");
        }
    }
}
