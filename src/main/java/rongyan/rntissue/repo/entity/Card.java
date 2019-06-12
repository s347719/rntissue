package rongyan.rntissue.repo.entity;


import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vip_card")
public class Card extends AbstractPersistable<Integer> {

    //    用户id
    @Column
    private String fUserID;

    //    卡类别对应的则是用户等级第四级不包括
    @Column
    private int fCardType;

    //    卡号(可用时间)
    @Column
    private int fVipCardNo;

    //    领取情况
    @Column
    private int fIsUsed = 0;

    //    vip卡号提取码
    @Column
    private String fVipCardNoID;

    //    是否使用
    @Column
    private int fIsUseing = 0;

    //关联的每张卡所添加的特权项目
    @Column
    private String libertyIds;

    public String getLibertyIds() {
        return libertyIds;
    }

    public void setLibertyIds(String libertyIds) {
        this.libertyIds = libertyIds;
    }

    public String getfUserID() {
        return fUserID;
    }

    public void setfUserID(String fUserID) {
        this.fUserID = fUserID;
    }

    public int getfCardType() {
        return fCardType;
    }

    public void setfCardType(int fCardType) {
        this.fCardType = fCardType;
    }

    public int getfVipCardNo() {
        return fVipCardNo;
    }

    public void setfVipCardNo(int fVipCardNo) {
        this.fVipCardNo = fVipCardNo;
    }

    public int getfIsUsed() {
        return fIsUsed;
    }

    public void setfIsUsed(int fIsUsed) {
        this.fIsUsed = fIsUsed;
    }

    public String getfVipCardNoID() {
        return fVipCardNoID;
    }

    public void setfVipCardNoID(String fVipCardNoID) {
        this.fVipCardNoID = fVipCardNoID;
    }

    public int getfIsUseing() {
        return fIsUseing;
    }

    public void setfIsUseing(int fIsUseing) {
        this.fIsUseing = fIsUseing;
    }
}
