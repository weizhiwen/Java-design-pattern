package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/30
 * Time: 8:26
 * To change this template use File | Settings | File Templates.
 * Description: 饿汉式单例类，线程安全
 */
public class HungarySingleton {
    private final static HungarySingleton hungarySingleton = new HungarySingleton();

    private HungarySingleton() {
    }

    public static HungarySingleton getInstance() {
        return hungarySingleton;
    }
}
