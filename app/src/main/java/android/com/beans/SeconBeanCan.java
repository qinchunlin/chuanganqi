package android.com.beans;

/**
 * Created by Android on 2019/5/12.
 */
//查询用户设备。
public class SeconBeanCan {
    int userId;    //用户ID
    String apiKey;    //apiKey

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
