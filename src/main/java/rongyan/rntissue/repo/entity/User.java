package rongyan.rntissue.repo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;


@Table(name = "vip_user")
@Entity
public class User extends AbstractPersistable<Integer> {

    //    企业id
    @Column
    private String f_companyid;
    //    关联的微信openId
    @Column
    private String f_wx_openId;
    //    关联的微信名称
    @Column
    private String f_wx_name;
    //    用户名
    @Column
    private String f_user_name;
    //    密码
    @Column
    private String f_password;
    //    用户电话
    @Column
    private String f_user_tel;
    //    vipCard邀请码个人电话号码
    @Column
    private String fvip_card_no;
    //    头像
    @Column
    private String f_photo_url;
    //    父级Id
    @Column
    private String f_parentid;
    //    用户等级 1-第一级 2-第二级 3-第三级 4-代表五次邀请中的人
    @Column
    private int f_user_level;
    //    是否删除
    @Column
    private int f_is_delete;
    //    入股金额
    @Column
    private int f_money;
    //    邀请次数固定位第三级用户邀请人次数为5次
    @Column
    private int fInviteCount = 5;
    //    添加时间
    @Column
    private Date fCreateTime;


    public String getF_companyid() {
        return f_companyid;
    }

    public void setF_companyid(String f_companyid) {
        this.f_companyid = f_companyid;
    }

    public String getF_wx_openId() {
        return f_wx_openId;
    }

    public void setF_wx_openId(String f_wx_openId) {
        this.f_wx_openId = f_wx_openId;
    }

    public String getF_wx_name() {
        return f_wx_name;
    }

    public void setF_wx_name(String f_wx_name) {
        this.f_wx_name = f_wx_name;
    }

    public String getF_user_name() {
        return f_user_name;
    }

    public void setF_user_name(String f_user_name) {
        this.f_user_name = f_user_name;
    }

    public String getF_password() {
        return f_password;
    }

    public void setF_password(String f_password) {
        this.f_password = f_password;
    }

    public String getF_user_tel() {
        return f_user_tel;
    }

    public void setF_user_tel(String f_user_tel) {
        this.f_user_tel = f_user_tel;
    }

    public String getFvip_card_no() {
        return fvip_card_no;
    }

    public void setFvip_card_no(String fvip_card_no) {
        this.fvip_card_no = fvip_card_no;
    }

    public String getF_photo_url() {
        return f_photo_url;
    }

    public void setF_photo_url(String f_photo_url) {
        this.f_photo_url = f_photo_url;
    }

    public String getF_parentid() {
        return f_parentid;
    }

    public void setF_parentid(String f_parentid) {
        this.f_parentid = f_parentid;
    }

    public int getF_user_level() {
        return f_user_level;
    }

    public void setF_user_level(int f_user_level) {
        this.f_user_level = f_user_level;
    }


    public int getF_is_delete() {
        return f_is_delete;
    }

    public void setF_is_delete(int f_is_delete) {
        this.f_is_delete = f_is_delete;
    }

    public int getF_money() {
        return f_money;
    }

    public void setF_money(int f_money) {
        this.f_money = f_money;
    }

    public int getfInviteCount() {
        return fInviteCount;
    }

    public void setfInviteCount(int fInviteCount) {
        this.fInviteCount = fInviteCount;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}
