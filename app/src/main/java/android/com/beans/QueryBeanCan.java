package android.com.beans;

/**
 * Created by Android on 2019/5/12.
 */
//调用用户ID 和设备 ID 查询传感器数值
public class QueryBeanCan {
    int userId;   //用户ID
    int deviceId;   //设备ID

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}
