package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/30
 * Time: 8:23
 * To change this template use File | Settings | File Templates.
 * Description: 懒汉式单例类，线程不安全
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
