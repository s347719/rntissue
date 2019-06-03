package rongyan.rntissue.repo.entity;


import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
@Table(name = "t_store_news")
public class StoreNews extends AbstractPersistable<Integer> {

    //类型
    @Column
    private String fCode;
    //    标题
    @Column
    private String fTitle;
    //    封面图片
    @Column
    private String fFacePic;
    //    内容
    @Column
    private String fContent;
    //    添加人
    @Column
    private String fAddUser;
    //    发布人
    @Column
    private String fPubUser;
    //    发布时间
    @Column
    private Date fPubtime;
    //    修改时间
    @Column
    private Date fUpdateTime;
    //    添加时间
    @Column
    private Date fCreatetime;
    //    状态
    @Column
    private int fState;
    //    是否有效 1-有效  2-无效
    @Column
    private int fIsDelete;
    /**
     * 修改人
     */
    @Column(name = "lastModified_by")
    @LastModifiedBy
    private String lastModifiedBy;

    @Column(name = "lastModified_time")
    @LastModifiedDate
    private Date lastModifiedTime;


    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getfTitle() {
        return fTitle;
    }

    public void setfTitle(String fTitle) {
        this.fTitle = fTitle;
    }

    public String getfFacePic() {
        return fFacePic;
    }

    public void setfFacePic(String fFacePic) {
        this.fFacePic = fFacePic;
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    public String getfAddUser() {
        return fAddUser;
    }

    public void setfAddUser(String fAddUser) {
        this.fAddUser = fAddUser;
    }

    public String getfPubUser() {
        return fPubUser;
    }

    public void setfPubUser(String fPubUser) {
        this.fPubUser = fPubUser;
    }

    public Date getfPubtime() {
        return fPubtime;
    }

    public void setfPubtime(Date fPubtime) {
        this.fPubtime = fPubtime;
    }

    public Date getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(Date fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }

    public Date getfCreatetime() {
        return fCreatetime;
    }

    public void setfCreatetime(Date fCreatetime) {
        this.fCreatetime = fCreatetime;
    }

    public int getfState() {
        return fState;
    }

    public void setfState(int fState) {
        this.fState = fState;
    }

    public int getfIsDelete() {
        return fIsDelete;
    }

    public void setfIsDelete(int fIsDelete) {
        this.fIsDelete = fIsDelete;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}
