package rongyan.rntissue.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "t_consume_list")
public class ConsumeInfo extends AbstractPersistable<Integer> {

//    已经消费表
    //    消费用户id
    @Column
    private String fUserID;


    //    消费用户名称
    @Column
    private String fUserName;

    //    项目id
    @Column
    private int fProjectID;

    //    项目名称
    @Column
    private String fProjectName;

    //    项目类型
    @Column
    private String fProjectType;

    //    原始价格
    @Column
    private int fPrice;

    //    当前价格
    @Column
    private int fCurrenPrice;

    //    利润价格
    @Column
    private int fEarnPrice;


    //    是否有效
    @Column
    private int fIsDelete;

    //    项目图片地址
    @Column
    private String fPicUrl;

    //    项目说明
    @Column
    private String fRemark;

    //    消费时间
    @Column
    private Date fTime;


    public String getfUserID() {
        return fUserID;
    }

    public void setfUserID(String fUserID) {
        this.fUserID = fUserID;
    }

    public String getfUserName() {
        return fUserName;
    }

    public void setfUserName(String fUserName) {
        this.fUserName = fUserName;
    }

    public int getfProjectID() {
        return fProjectID;
    }

    public void setfProjectID(int fProjectID) {
        this.fProjectID = fProjectID;
    }

    public String getfProjectName() {
        return fProjectName;
    }

    public void setfProjectName(String fProjectName) {
        this.fProjectName = fProjectName;
    }

    public String getfProjectType() {
        return fProjectType;
    }

    public void setfProjectType(String fProjectType) {
        this.fProjectType = fProjectType;
    }

    public int getfCurrenPrice() {
        return fCurrenPrice;
    }

    public void setfCurrenPrice(int fCurrenPrice) {
        this.fCurrenPrice = fCurrenPrice;
    }

    public int getfPrice() {
        return fPrice;
    }

    public void setfPrice(int fPrice) {
        this.fPrice = fPrice;
    }

    public int getfEarnPrice() {
        return fEarnPrice;
    }

    public void setfEarnPrice(int fEarnPrice) {
        this.fEarnPrice = fEarnPrice;
    }

    public int getfIsDelete() {
        return fIsDelete;
    }

    public void setfIsDelete(int fIsDelete) {
        this.fIsDelete = fIsDelete;
    }

    public String getfPicUrl() {
        return fPicUrl;
    }

    public void setfPicUrl(String fPicUrl) {
        this.fPicUrl = fPicUrl;
    }

    public String getfRemark() {
        return fRemark;
    }

    public void setfRemark(String fRemark) {
        this.fRemark = fRemark;
    }

    public Date getfTime() {
        return fTime;
    }

    public void setfTime(Date fTime) {
        this.fTime = fTime;
    }
}
