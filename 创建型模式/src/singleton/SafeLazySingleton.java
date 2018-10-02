package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/30
 * Time: 8:23
 * To change this template use File | Settings | File Templates.
 * Description: 懒汉式单例类，线程安全
 */
public class SafeLazySingleton {
    private static SafeLazySingleton lazySingleton;

    private SafeLazySingleton() {
    }

    public static synchronized SafeLazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new SafeLazySingleton();
        }
        return lazySingleton;
    }
}
