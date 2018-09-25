package factoryMethod.leifeng;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 23:01
 * To change this template use File | Settings | File Templates.
 * Description: 大学生工厂类
 */
public class UndergraduateFactory implements LeiFengFactory {

    @Override
    public LeiFeng creteLeiFeng() {
        return new Undergraduate();
    }
}
