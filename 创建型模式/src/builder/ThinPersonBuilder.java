package builder;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 * Description: 瘦的人类
 */
public class ThinPersonBuilder extends AbstractPersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("构建瘦人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("构建瘦人的身体");
    }

    @Override
    public void buildLeftArm() {
        System.out.println("构建瘦人的左手");
    }

    @Override
    public void buildRightArm() {
        System.out.println("构建瘦人的右手");
    }

    @Override
    public void buildLeftLeg() {
        System.out.println("构建瘦人的左腿");
    }

    @Override
    public void buildRightLeg() {
        System.out.println("构建瘦人的右腿");
    }
}
