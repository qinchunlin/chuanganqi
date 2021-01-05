package android.com.beans;

/**
 * Created by Android on 2019/5/13.
 */

public class SwitchBean {

    /**
     * flag : 00
     * msg : 操作成功!
     */

    private String flag;   //标志
    private String msg;     //提示消息

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
