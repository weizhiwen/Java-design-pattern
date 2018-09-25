package factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 * Description: 求方运算工厂类
 */
public class SquOperationFactory implements OperationFactory {
    @Override
    public AbstractOperation createOperation() {
        return new SquOperation();
    }
}
