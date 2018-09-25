package factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 * Description: 减法运算类
 */
public class SubOperation extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
