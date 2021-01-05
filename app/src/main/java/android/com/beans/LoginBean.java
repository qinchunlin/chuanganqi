package android.com.beans;

import java.io.Serializable;

/**
 * Created by Android on 2019/5/12.
 */

public class LoginBean implements Serializable{

    /**
     * msg : 登录成功
     * internal : 0
     * flag : 00
     * nickName : null
     * isBind : 1
     * mobile : 19935343373
     * company_key : null
     * isAdmin : null
     * userName : 19935343373
     * userId : 200023137
     * userKey : b346d395ecf844f2a541932a9865f942
     * parentId : null
     * isEnable : 1
     * companyAdmin : 0
     * email :
     * isNewAlarm : 0
     * isComplete : 0
     * cfgnum : 1
     */

    private String msg;  //提示信息
    private int internal;
    private String flag; //标志，00为成功
    private Object nickName;   //昵称
    private int isBind;
    private String mobile;    //手机号
    private Object company_key;
    private Object isAdmin;
    private String userName;   //用户名
    private int userId;      //用户id
    private String userKey;  //apiKey
    private Object parentId;
    private int isEnable;
    private int companyAdmin;
    private String email;   //邮箱
    private int isNewAlarm;
    private int isComplete;
    private int cfgnum;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getInternal() {
        return internal;
    }

    public void setInternal(int internal) {
        this.internal = internal;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Object getNickName() {
        return nickName;
    }

    public void setNickName(Object nickName) {
        this.nickName = nickName;
    }

    public int getIsBind() {
        return isBind;
    }

    public void setIsBind(int isBind) {
        this.isBind = isBind;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Object getCompany_key() {
        return company_key;
    }

    public void setCompany_key(Object company_key) {
        this.company_key = company_key;
    }

    public Object getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Object isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public int getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(int isEnable) {
        this.isEnable = isEnable;
    }

    public int getCompanyAdmin() {
        return companyAdmin;
    }

    public void setCompanyAdmin(int companyAdmin) {
        this.companyAdmin = companyAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsNewAlarm() {
        return isNewAlarm;
    }

    public void setIsNewAlarm(int isNewAlarm) {
        this.isNewAlarm = isNewAlarm;
    }

    public int getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(int isComplete) {
        this.isComplete = isComplete;
    }

    public int getCfgnum() {
        return cfgnum;
    }

    public void setCfgnum(int cfgnum) {
        this.cfgnum = cfgnum;
    }
}
