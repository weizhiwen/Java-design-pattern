package proxy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 * Description: 代理类
 */
public class Proxy implements GiveGift {
    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
