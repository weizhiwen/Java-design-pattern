package decorator;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 * Description: 具体装饰类
 */
public class JeansFinery extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("穿上牛仔裤！");
    }
}
