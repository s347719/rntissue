package rongyan.rntissue.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tstore_teacher")
public class StoreTeacher extends AbstractPersistable<Integer> {

//    店内老师表

    //    所属企业id
    @Column
    private String fCompanyID;

    //    名称
    @Column
    private String fName;

    //    昵称
    @Column
    private String fDisplayName;

    //    头像
    @Column
    private String fPhotoUrl;

    //    职称
    @Column
    private String fNumber;

    //    说明
    @Column
    private String fRemark;

    //    状态
    @Column
    private int fState;

    //    联系电话
    @Column
    private String fTell;

    //    添加时间
    @Column
    private Date fCreatetime;
    //    修改时间
    @Column
    private Date fUpdateTime;

    public String getfCompanyID() {
        return fCompanyID;
    }

    public void setfCompanyID(String fCompanyID) {
        this.fCompanyID = fCompanyID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfDisplayName() {
        return fDisplayName;
    }

    public void setfDisplayName(String fDisplayName) {
        this.fDisplayName = fDisplayName;
    }

    public String getfPhotoUrl() {
        return fPhotoUrl;
    }

    public void setfPhotoUrl(String fPhotoUrl) {
        this.fPhotoUrl = fPhotoUrl;
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public String getfRemark() {
        return fRemark;
    }

    public void setfRemark(String fRemark) {
        this.fRemark = fRemark;
    }

    public int getfState() {
        return fState;
    }

    public void setfState(int fState) {
        this.fState = fState;
    }

    public String getfTell() {
        return fTell;
    }

    public void setfTell(String fTell) {
        this.fTell = fTell;
    }

    public Date getfCreatetime() {
        return fCreatetime;
    }

    public void setfCreatetime(Date fCreatetime) {
        this.fCreatetime = fCreatetime;
    }

    public Date getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(Date fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }
}
