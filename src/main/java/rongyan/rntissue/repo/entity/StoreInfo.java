package rongyan.rntissue.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "t_store_info")
public class StoreInfo extends AbstractPersistable<Integer> {

//    店铺信息
    //    企业名称
    @Column
    private String fCompanyName;
    //统一社会信用代码
    @Column
    private String fOrganizationCode;
    //    营业执照号
    @Column
    private String fLicense;
    //法人姓名
    @Column
    private String fMangeMan;
    //    联系电话
    @Column
    private String fLinkTell;
    //    座机
    @Column
    private String fOfficeTell;
    //    添加时间
    @Column
    private Date fCreateTime;
    //    状态
    @Column
    private int fState;

    //    地址
    @Column
    private String fAddress;

    //    营业时间
    @Column
    private String fYeTimeMemo;

    public String getfCompanyName() {
        return fCompanyName;
    }

    public void setfCompanyName(String fCompanyName) {
        this.fCompanyName = fCompanyName;
    }

    public String getfOrganizationCode() {
        return fOrganizationCode;
    }

    public void setfOrganizationCode(String fOrganizationCode) {
        this.fOrganizationCode = fOrganizationCode;
    }

    public String getfLicense() {
        return fLicense;
    }

    public void setfLicense(String fLicense) {
        this.fLicense = fLicense;
    }

    public String getfMangeMan() {
        return fMangeMan;
    }

    public void setfMangeMan(String fMangeMan) {
        this.fMangeMan = fMangeMan;
    }

    public String getfLinkTell() {
        return fLinkTell;
    }

    public void setfLinkTell(String fLinkTell) {
        this.fLinkTell = fLinkTell;
    }

    public String getfOfficeTell() {
        return fOfficeTell;
    }

    public void setfOfficeTell(String fOfficeTell) {
        this.fOfficeTell = fOfficeTell;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public int getfState() {
        return fState;
    }

    public void setfState(int fState) {
        this.fState = fState;
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress;
    }

    public String getfYeTimeMemo() {
        return fYeTimeMemo;
    }

    public void setfYeTimeMemo(String fYeTimeMemo) {
        this.fYeTimeMemo = fYeTimeMemo;
    }
}
