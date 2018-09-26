package prototype.clone;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/26
 * Time: 10:44
 * To change this template use File | Settings | File Templates.
 * Description: 原型模式clone方法实现客户端模拟类
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume1 = new Resume("Tom", "男", 23, new WorkExperience("2017-2018", "Google"));
        Resume resume2 = (Resume) resume1.clone();
        resume2.getWorkExperience().setCompany("Apple");
        Resume resume3 = (Resume) resume2.clone();
        resume3.setName("Mary");
        resume3.setAge(25);
        System.out.println("打印简历");
        resume1.print();
        System.out.println("------------");
        resume2.print();
        System.out.println("------------");
        resume3.print();
        System.out.println("------------");
    }
}
