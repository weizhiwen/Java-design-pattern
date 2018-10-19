package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 * Description: 下午和傍晚工作状态类
 */
public class AfternoonState extends AbstractState {
    @Override
    public void doSomething(Work work) {
        if(work.getHour() < 17) {
            System.out.println("当前时间为" + work.getHour() + "，下午状态还不错，继续努力");
        } else {
            work.setState(new EveningState());
            work.doSomething();
        }
    }
}
