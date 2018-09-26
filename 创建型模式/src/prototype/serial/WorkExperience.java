package prototype.serial;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/26
 * Time: 10:29
 * To change this template use File | Settings | File Templates.
 * Description: 工作经历类
 */
public class WorkExperience implements Serializable {
    private String workDate;
    private String company;

    public WorkExperience(String workDate, String company) {
        this.workDate = workDate;
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
