package android.com.beans;

/**
 * Created by Android on 2019/5/12.
 */

public class HistoryBeanCan {
    /*  "userId": "用户ID",  //用户ID：200023137
  //温度传感器ID：200292192 ；湿度传感器ID：200292193
              "sensorId": "传感器ID", "page": "页数",
              "pageSize":"每页显示的条数默认10条",
              "startDate": "开始时间，格式:yyyy-MM-dd HH:mm:ss",
              "endDate": "结束时间"*/
    int userId;
    String sensorId;   //传感器ID
    String pageSize;   //每页显示的条数
    String startDate;   //开始时间
    String endDate;    //结束时间

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
