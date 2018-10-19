package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:42
 * To change this template use File | Settings | File Templates.
 * Description: 下班休息状态类
 */
public class RestState extends AbstractState{

    @Override
    public void doSomething(Work work) {
        System.out.println("当前时间为" + work.getHour() + "，今天工作完成了，下班回家了");
    }
}
