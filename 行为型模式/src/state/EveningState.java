package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 * Description: 晚间工作状态类
 */
public class EveningState extends AbstractState {

    @Override
    public void doSomething(Work work) {
        if(work.isFinish()) {
            work.setState(new RestState());
            work.doSomething();
        } else {
            if(work.getHour() < 21) {
                System.out.println("当前时间为" + work.getHour() + "，加班哦，疲惫至极");
            } else {
                // 转入睡眠状态
                work.setState(new SleepState());
                work.doSomething();
            }
        }
    }
}
