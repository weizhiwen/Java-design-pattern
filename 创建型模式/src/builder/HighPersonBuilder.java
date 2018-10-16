package builder;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 * Description: 高的人类
 */
public class HighPersonBuilder extends AbstractPersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("构建高人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("构建高人的身体");
    }

    @Override
    public void buildLeftArm() {
        System.out.println("构建高人的左手");
    }

    @Override
    public void buildRightArm() {
        System.out.println("构建高人的右手");
    }

    @Override
    public void buildLeftLeg() {
        System.out.println("构建高人的左腿");
    }

    @Override
    public void buildRightLeg() {
        System.out.println("构建高人的右腿");
    }
}
