package state;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/19
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 * Description: 状态模式客户端模拟类
 */
public class Client {
    public static void main(String[] args) {
        // 紧急项目
        Work emergencyProject = new Work();
        emergencyProject.setHour(9);
        emergencyProject.doSomething();
        emergencyProject.setHour(10);
        emergencyProject.doSomething();
        emergencyProject.setHour(12);
        emergencyProject.doSomething();
        emergencyProject.setHour(13);
        emergencyProject.doSomething();
        emergencyProject.setHour(14);
        emergencyProject.doSomething();
        emergencyProject.setHour(17);
        emergencyProject.doSomething();
        emergencyProject.setFinish(true);
//        emergencyProject.setFinish(false);
        emergencyProject.setHour(19);
        emergencyProject.doSomething();
        emergencyProject.setHour(22);
        emergencyProject.doSomething();
    }
}
