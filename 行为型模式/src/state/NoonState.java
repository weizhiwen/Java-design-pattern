package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 * Description: 中午工作状态类
 */
public class NoonState extends AbstractState {
    @Override
    public void doSomething(Work work) {
        if(work.getHour() < 13) {
            System.out.println("当前时间为" + work.getHour() + "，饿了，午饭：犯困，午休");
        } else {
            // 进入下午状态
            work.setState(new AfternoonState());
            work.doSomething();
        }
    }
}
