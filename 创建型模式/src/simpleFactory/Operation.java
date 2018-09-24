package simpleFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 * Description: 运算抽象类
 */
public abstract class Operation {
    protected double numberA;
    protected double numberB;

    public abstract double getResult();
}
