package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 * Description: 求方运算类
 */
public class SquOperation extends Operation{

    @Override
    public double getResult() {
        return Math.pow(numberA, numberB);
    }
}
