package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:26
 * To change this template use File | Settings | File Templates.
 * Description: 上午和中午工作状态类
 */
public class ForenoonState extends AbstractState {
    @Override
    public void doSomething(Work work) {
        if(work.getHour() < 12) {
            System.out.println("当前的时间为" + work.getHour() + "，上午工作，精神百倍");
        } else {
            // 进入中午状态
            work.setState(new NoonState());
            work.doSomething();
        }
    }
}
