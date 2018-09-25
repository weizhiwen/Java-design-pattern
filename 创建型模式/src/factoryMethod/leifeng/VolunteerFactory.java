package factoryMethod.leifeng;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 * Description: 社区志愿者工厂类
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng creteLeiFeng() {
        return new Volunteer();
    }
}
