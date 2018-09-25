package factoryMethod.leifeng;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 * Description: 用工厂方法模式写学习雷锋做好事不留名
 */
public class Client {
    public static void main(String[] args) {
        // 学雷锋，做好事，不留名！
        LeiFengFactory leiFengFactory = new UndergraduateFactory();
        LeiFeng studyLeiFeng1 = leiFengFactory.creteLeiFeng();
        studyLeiFeng1.BuyRice();
        studyLeiFeng1.Sweep();
        studyLeiFeng1.Wash();

        leiFengFactory = new VolunteerFactory();
        LeiFeng studyLeiFeng2 = leiFengFactory.creteLeiFeng();
        studyLeiFeng1.BuyRice();
        studyLeiFeng1.Sweep();
        studyLeiFeng1.Wash();
    }
}
