package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 * Description: 运算工厂类
 */
public class OperationFactory {
    public static AbstractOperation createOperation(String operation) {
        switch (operation) {
            case "加":
                return new AddAbstractOperation();
            case "减":
                return new SubAbstractOperation();
            case "乘":
                return new MulAbstractOperation();
            case "除":
                return new DivAbstractOperation();
            case "求方":
                return new SquAbstractOperation();
            default:
               throw new RuntimeException("暂不支持该运算");
        }
    }
}
