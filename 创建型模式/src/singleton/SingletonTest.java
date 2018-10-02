package singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/30
 * Time: 9:38
 * To change this template use File | Settings | File Templates.
 * Description: 单列模式测试类
 */
public class SingletonTest {
    @Test
    @DisplayName("Test LazySingleton Class")
    public void testLazySingleton() {
        System.out.println("懒汉单例模式在单线程环境下");
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
        System.out.println("懒汉单例模式在多线程环境下");
        for (int i = 0; i < 100; i++) {
            // lambda 表达式简化写法
            new Thread(() -> System.out.println(LazySingleton.getInstance().hashCode())).start();
        }
    }

    @Test
    @DisplayName("Test SafeLazySingleton Class")
    public void testSafeLazySingleton() {
        System.out.println("线程安全懒汉单例模式在单线程环境下");
        SafeLazySingleton singleton1 = SafeLazySingleton.getInstance();
        SafeLazySingleton singleton2 = SafeLazySingleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
        System.out.println("线程安全懒汉单例模式在多线程环境下");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(SafeLazySingleton.getInstance().hashCode())).start();
        }
    }

    @Test
    @DisplayName("Test HungarySingleton Class")
    public void testHungarySingleton() {
        System.out.println("饿汉单例模式在单线程环境下");
        HungarySingleton singleton1 = HungarySingleton.getInstance();
        HungarySingleton singleton2 = HungarySingleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
        System.out.println("饿汉单例模式在多线程环境下");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(HungarySingleton.getInstance().hashCode())).start();
        }
    }

    @Test
    @DisplayName("Test DoubleCheckSingleton Class")
    public void testDoubleCheckSingleton() {
        System.out.println("双重检查单例模式在单线程环境下");
        DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singleton2 = DoubleCheckSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
        System.out.println("双重检查单例模式在多线程环境下");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(DoubleCheckSingleton.getInstance().hashCode())).start();
        }
    }

    @Test
    @DisplayName("Test InnerClassSingleton Class")
    public void testInnerClassSingleton() {
        System.out.println("静态内部类单例模式在单线程环境下");
        InnerClassSingleton singleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton singleton2 = InnerClassSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
        System.out.println("静态内部类单例模式在多线程环境下");
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(InnerClassSingleton.getInstance().hashCode())).start();
        }
    }

    @Test
    @DisplayName("Test SingletonEnum Enum")
    public void testLazySingletonEnum() {
        System.out.println("枚举实现单例模式在单线程环境下");
        SingletonEnum.Singleton singleton1 = SingletonEnum.INSTANCE.getInstance();
        SingletonEnum.Singleton singleton2 = SingletonEnum.INSTANCE.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
        System.out.println("枚举实现单例模式在多线程环境下");
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> System.out.println(SingletonEnum.INSTANCE.getInstance().hashCode())).start();
        }
    }
}
