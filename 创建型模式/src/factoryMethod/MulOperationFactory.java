package factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 21:52
 * To change this template use File | Settings | File Templates.
 * Description: 乘法运算工厂类
 */
public class MulOperationFactory implements OperationFactory {
    @Override
    public AbstractOperation createOperation() {
        return new MulOperation();
    }
}
