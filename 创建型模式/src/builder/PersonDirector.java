package builder;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/16
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 * Description: 指挥类，指挥构建人
 */
public class PersonDirector {
    private AbstractPersonBuilder abstractPersonBuilder;

    public PersonDirector(AbstractPersonBuilder abstractPersonBuilder) {
        this.abstractPersonBuilder = abstractPersonBuilder;
    }

    // 构建人的整个过程
    public void createPerson() {
        abstractPersonBuilder.buildHead();
        abstractPersonBuilder.buildBody();
        abstractPersonBuilder.buildLeftArm();
        abstractPersonBuilder.buildRightArm();
        abstractPersonBuilder.buildLeftLeg();
        abstractPersonBuilder.buildRightLeg();
    }
}
