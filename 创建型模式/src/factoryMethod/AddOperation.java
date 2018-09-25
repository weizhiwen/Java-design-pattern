package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 16:42
 * To change this template use File | Settings | File Templates.
 * Description: 加法运算类
 */
public class AddOperation extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
