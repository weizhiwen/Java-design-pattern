package builder;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 19:21
 * To change this template use File | Settings | File Templates.
 * Description: 建造者模式客户端模拟类
 */
public class Client {

    public static void main(String[] args) {
        AbstractPersonBuilder abstractPersonBuilder = new FatPersonBuilder();
        PersonDirector personDirector = new PersonDirector(abstractPersonBuilder);
        personDirector.createPerson();

        abstractPersonBuilder = new HighPersonBuilder();
        personDirector = new PersonDirector(abstractPersonBuilder);
        personDirector.createPerson();
    }
}
