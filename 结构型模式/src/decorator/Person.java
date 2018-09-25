package decorator;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 15:13
 * To change this template use File | Settings | File Templates.
 * Description: 要装饰的类，这里是人
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "的装扮：");
    }
}
