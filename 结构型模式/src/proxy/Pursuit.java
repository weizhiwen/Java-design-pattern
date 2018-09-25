package proxy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 * Description: 追求者类
 */
public class Pursuit implements GiveGift{
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + ", 送你洋娃娃！");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + ", 送你鲜花！");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + ", 送你巧克力！");
    }
}
