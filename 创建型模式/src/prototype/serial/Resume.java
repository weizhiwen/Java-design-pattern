package prototype.serial;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/26
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 * Description: 简历类
 */
public class Resume implements Serializable {
    private String name;
    private String sex;
    private Integer age;
    private WorkExperience workExperience;

    public Resume(String name, String sex, Integer age, WorkExperience workExperience) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.workExperience = workExperience;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            // 将对象写入流内
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            // 从流中读出对象
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            object = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
        System.out.println("WorkExperience: " + workExperience.getCompany() + " " + workExperience.getWorkDate());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }
}
