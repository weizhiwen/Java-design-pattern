package observer;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 20:17
 * To change this template use File | Settings | File Templates.
 * Description: 观察者抽象类
 */
public abstract class AbstractObserver {
    protected Subject subject;

    public AbstractObserver(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
