package rongyan.rntissue.repo.entity;


import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_order_list")
public class OrderInfo extends AbstractPersistable<Integer> {

    //订单表

    //    关联id还是个人表中的电话号码
    @Column
    private String fuserId;
    //    项目id
    @Column
    private String fProjectId;
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

    //    利润价格
    @Column
    private int fEarnHPrice;

    //    是否有效 1-有效 0-删除 2-已经消费
    @Column
    private int fIsDelete;

    //    项目图片地址
    @Column
    private String fPicUrl;

    //    项目说明
    @Column
    private String fRemark;

    public String getFuserId() {
        return fuserId;
    }

    public void setFuserId(String fuserId) {
        this.fuserId = fuserId;
    }

    public String getfProjectId() {
        return fProjectId;
    }

    public void setfProjectId(String fProjectId) {
        this.fProjectId = fProjectId;
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

    public int getfEarnHPrice() {
        return fEarnHPrice;
    }

    public void setfEarnHPrice(int fEarnHPrice) {
        this.fEarnHPrice = fEarnHPrice;
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
}
