package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 16:51
 * To change this template use File | Settings | File Templates.
 * Description: 除法运算类
 */
public class DivOperation extends AbstractOperation {

    @Override
    public double getResult() {
        if (numberB == 0) {
            throw new RuntimeException("除数不能为 0 ！");
        }
        return numberA / numberB;
    }
}
