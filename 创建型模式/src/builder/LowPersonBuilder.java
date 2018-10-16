package builder;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 * Description: 低的人类
 */
public class LowPersonBuilder extends AbstractPersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("构建低人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("构建低人的身体");
    }

    @Override
    public void buildLeftArm() {
        System.out.println("构建低人的左手");
    }

    @Override
    public void buildRightArm() {
        System.out.println("构建低人的右手");
    }

    @Override
    public void buildLeftLeg() {
        System.out.println("构建低人的左腿");
    }

    @Override
    public void buildRightLeg() {
        System.out.println("构建低人的右腿");
    }
}
