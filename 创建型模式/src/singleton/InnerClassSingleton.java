package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/30
 * Time: 9:34
 * To change this template use File | Settings | File Templates.
 * Description: 静态内部类单例类
 */
public class InnerClassSingleton {
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
