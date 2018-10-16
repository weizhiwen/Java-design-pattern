package observer;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 * Description: 看NBA直播的观察者
 */
public class NBAObserver extends AbstractObserver {

    public NBAObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getNotifyContent() + "关掉NBA直播，继续工作！");
    }
}
