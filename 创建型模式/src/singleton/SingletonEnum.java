package singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/10/1
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 * Description: 枚举实现的单例模式类
 */
public enum SingletonEnum {
    // 枚举类型，默认有 final static 关键字修饰
    INSTANCE;

    // 单例实例
    private Singleton singleton;

    // 默认的构造方法省略了 private 关键字，在构造函数中初始化
    SingletonEnum() {
        System.out.println("枚举类的构造方法在枚举类加载时执行");
        singleton = new Singleton();
    }

    public Singleton getInstance() {
        return singleton;
    }

    // 要单例的类
    class Singleton {}
}
