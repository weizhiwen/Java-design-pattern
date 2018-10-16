package observer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 * Description: 通知者
 */
public class ConcreteSubject extends Subject {
    private ArrayList<AbstractObserver> observers = new ArrayList<>();
    @Override
    public void add(AbstractObserver observer) {
        observers.add(observer);
    }

    @Override
    public void del(AbstractObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(AbstractObserver observer : observers) {
            observer.update();
        }
    }
}
