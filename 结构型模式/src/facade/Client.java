package facade;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 * Description: 门面模式客户端模拟类
 */
public class Client {

    public static void main(String[] args) {
        Fund jijin = new Fund();
        jijin.buyFund();
        jijin.sellFund();
    }
}
