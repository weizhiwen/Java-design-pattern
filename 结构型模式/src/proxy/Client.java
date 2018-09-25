package proxy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 20:52
 * To change this template use File | Settings | File Templates.
 * Description: 代理模式客户端模拟类
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("校花");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
