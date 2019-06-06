package rongyan.rntissue.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "t_peoject_list")
public class ProjectInfo extends AbstractPersistable<Integer> {

    //    项目名称
    @Column
    private String fProjectName;

    //    类别
    @Column
    private String fProjectType;

    //    原始价格
    @Column
    private int fSPrice;

    //    当前价格
    @Column
    private int fCurrenPrice;

    //    利润
    @Column
    private String fEarnPrice;

    //    是否有效
    @Column
    private int fIsDelete;

    //    项目图片地址
    @Column
    private String fPicUrl;

    //    项目说明
    @Column
    private String fRemark;

    //    状态
    @Column
    private int fState;

    //    添加时间
    @Column
    private Date fCreatetime;

    //    修改时间
    @Column
    private Date fUpdateTime;

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

    public int getfSPrice() {
        return fSPrice;
    }

    public void setfSPrice(int fSPrice) {
        this.fSPrice = fSPrice;
    }

    public int getfCurrenPrice() {
        return fCurrenPrice;
    }

    public void setfCurrenPrice(int fCurrenPrice) {
        this.fCurrenPrice = fCurrenPrice;
    }

    public String getfEarnPrice() {
        return fEarnPrice;
    }

    public void setfEarnPrice(String fEarnPrice) {
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

    public int getfState() {
        return fState;
    }

    public void setfState(int fState) {
        this.fState = fState;
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
