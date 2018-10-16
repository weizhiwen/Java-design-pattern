package builder;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 * Description: 抽象人类
 */
public abstract class AbstractPersonBuilder {
    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildLeftArm();
    public abstract void buildRightArm();
    public abstract void buildLeftLeg();
    public abstract void buildRightLeg();
}
