package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 16:52
 * To change this template use File | Settings | File Templates.
 * Description: 乘法运算类
 */
public class MulOperation extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
