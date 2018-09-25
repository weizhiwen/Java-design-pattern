package decorator;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 * Description: 装饰模式客户端模拟类
 */
public class Client {
    private static TShirtsFinery tShirts = new TShirtsFinery();
    private static BriefsFinery briefs = new BriefsFinery();
    private static JeansFinery jeans = new JeansFinery();

    public static void main(String[] args) {
        Person person1 = new Person("Tom");
        tShirts.decorate(person1);
        briefs.decorate(tShirts);
        jeans.decorate(briefs);
        jeans.show();
        System.out.println("---------------------");
        Person person2 = new Person("超人");
        tShirts.decorate(person2);
        jeans.decorate(tShirts);
        // 内裤反穿为超人
        briefs.decorate(jeans);
        briefs.show();
    }

}
