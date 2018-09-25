package factoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 10:34
 * To change this template use File | Settings | File Templates.
 * Description: 工厂方法模式客户端模拟类
 */
public class Client {
    private static List<String> operators = new ArrayList<>(Arrays.asList("加", "减", "乘", "除", "求方"));
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入numberA：");
            double numberA = scanner.nextDouble();
            System.out.println("运算符有：" + operators.toString());
            System.out.println("输入运算符下标（从 0 开始）：");
            int operator  = scanner.nextInt();
            OperationFactory operationFactory;
            switch (operator) {
                case 0:
                    operationFactory = new AddOperationFactory();
                    break;
                case 1:
                    operationFactory = new SubOperationFactory();
                    break;
                case 2:
                    operationFactory = new MulOperationFactory();
                    break;
                case 3:
                    operationFactory = new DivOperationFactory();
                    break;
                case 4:
                    operationFactory = new SquOperationFactory();
                    break;
                default:
                    throw new RuntimeException("暂不支持该运算");
            }
            System.out.println("输入numberB");
            double numberB = scanner.nextDouble();
            AbstractOperation operation = operationFactory.createOperation();
            operation.numberA = numberA;
            operation.numberB = numberB;
            System.out.println(numberA + operators.get(operator) + numberB + "的运算结果：" + operation.getResult());
            System.out.println("--------------------------------");
        }
    }
}
