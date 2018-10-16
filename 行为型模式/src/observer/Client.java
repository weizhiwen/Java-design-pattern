package observer;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 * Description: 观察者模式客户端模拟类
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        StockObserver stockObserver = new StockObserver(subject);
        subject.add(stockObserver);
        NBAObserver nbaObserver = new NBAObserver(subject);
        subject.add(nbaObserver);

        subject.setNotifyContent("老板回来啦！");
        subject.notifyObserver();
    }
}
