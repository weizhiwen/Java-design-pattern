package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 * Description: 睡眠工作状态
 */
public class SleepState extends AbstractState {
    @Override
    public void doSomething(Work work) {
        System.out.println("当前时间为" + work.getHour() + "，不行了，睡着了");
    }
}
