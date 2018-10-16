package observer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 20:12
 * To change this template use File | Settings | File Templates.
 * Description: 通知者接口
 */
public abstract class Subject {

    private ArrayList<AbstractObserver> observers = new ArrayList<>();
    public String notifyContent;
    public abstract void add(AbstractObserver observer);
    public abstract void del(AbstractObserver observer);
    public abstract void notifyObserver();

    public String getNotifyContent() {
        return notifyContent;
    }

    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
    }
}
