package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class OperationFactory {
    public static Operation createOperation(String operation) {
        switch (operation) {
            case "加":
                return new AddOperation();
            case "减":
                return new SubOperation();
            case "乘":
                return new MulOperation();
            case "除":
                return new DivOperation();
            case "求方":
                return new SquOperation();
            default:
               throw new RuntimeException("暂不支持该运算");
        }
    }
}
