package observer;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 20:23
 * To change this template use File | Settings | File Templates.
 * Description: 看股票的观察者
 */
public class StockObserver extends AbstractObserver{

    public StockObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getNotifyContent() + "关掉股票行情，继续工作！");
    }
}
