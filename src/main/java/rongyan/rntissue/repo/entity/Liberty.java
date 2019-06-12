package rongyan.rntissue.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "vip_liberty")
public class Liberty extends AbstractPersistable<Integer> {

    //    用户等级对应
    @Column
    private String fUserLevel;

    //    特权类型名称
    @Column
    private String fName;

    //    消费说明
    @Column
    private String fMemo;


    //    是否删除
    @Column
    private int fIsDelete;

    //    次数
    @Column
    private int fCount;


    //    添加时间
    @Column
    private Date fCreateTime;

    //    有效期
    @Column
    private Date fEndTime;

    //    关联的店内项目id
    @Column
    private int projectId;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getfUserLevel() {
        return fUserLevel;
    }

    public void setfUserLevel(String fUserLevel) {
        this.fUserLevel = fUserLevel;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfMemo() {
        return fMemo;
    }

    public void setfMemo(String fMemo) {
        this.fMemo = fMemo;
    }

    public int getfIsDelete() {
        return fIsDelete;
    }

    public void setfIsDelete(int fIsDelete) {
        this.fIsDelete = fIsDelete;
    }

    public int getfCount() {
        return fCount;
    }

    public void setfCount(int fCount) {
        this.fCount = fCount;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public Date getfEndTime() {
        return fEndTime;
    }

    public void setfEndTime(Date fEndTime) {
        this.fEndTime = fEndTime;
    }
}
