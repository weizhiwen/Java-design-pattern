package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/30
 * Time: 8:36
 * To change this template use File | Settings | File Templates.
 * Description: 双重校验锁单例类
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
