package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Work {
    private AbstractState state;
    private float hour;
    private boolean finish;

    public Work() {
        // 初始状态
        state = new ForenoonState();
    }

    public void doSomething() {
        state.doSomething(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
