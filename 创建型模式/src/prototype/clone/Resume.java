package prototype.clone;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/26
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 * Description: 简历类
 */
public class Resume implements Cloneable {
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
    protected Object clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        resume.workExperience = (WorkExperience) workExperience.clone();
        return resume;
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
