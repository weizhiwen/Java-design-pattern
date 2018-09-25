package factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 * Description: 运算工厂接口
 */
public interface OperationFactory {
    AbstractOperation createOperation();
}
