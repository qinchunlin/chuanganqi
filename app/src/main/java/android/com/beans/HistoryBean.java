package android.com.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Android on 2019/5/12.
 */

public class HistoryBean {

    /**
     * msg :
     * flag : 00
     * totalPage : 1
     * dataList : [{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 19:53:30","val":"27"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 19:53:29","val":"27"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 19:53:28","val":"27"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 15:51:33","val":"32"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 15:51:32","val":"32"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 15:51:31","val":"32"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 15:26:21","val":"33"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 15:26:20","val":"33"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 14:28:38","val":"32"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-22 14:28:36","val":"32"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-20 15:07:35","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-20 15:07:34","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:12","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:11","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:10","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:09","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:08","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:07","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:06","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:05","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:04","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:02","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:26:01","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:11:49","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:11:48","val":"14"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:01:04","val":"17"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:01:03","val":"17"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:01:02","val":"17"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 20:01:01","val":"17"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:20","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:19","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:18","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:15","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:14","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:03","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-19 19:58:02","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:01:23","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:01:12","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:01:08","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:01:06","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:01:00","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:00:59","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:00:58","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:00:51","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:00:50","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:00:49","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 18:00:48","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 16:41:41","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 16:41:40","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":""," 2000 unit":"","updateTime":"2019-05-17 16:41:39","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 15:56:26","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 15:56:25","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 15:33:26","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 15:33:25","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:52:39","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:52:38","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:52:37","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:52:36","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:34:48","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:34:47","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:34:46","val":"30"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:32:01","val":"29"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:32:00","val":"29"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:31:54","val":"29"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-17 14:31:53","val":"29"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 20:40:36","val":"21"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 20:40:35","val":"21"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 20:40:34","val":"21"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 20:40:33","val":"21"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 20:40:32","val":"21"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:47:04","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:47:03","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:47:02","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:47:01","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:47:00","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:46:59","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-16 19:46:58","val":"23"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:39","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:38","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:37","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:36","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:35","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:34","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:33","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:32","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:31","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:30","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:29","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:28","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 22:00:27","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:56:33","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:56:32","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:56:31","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:56:30","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:56:29","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:56:28","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:55:58","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:51:11","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:51:10","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switch 16d6 er":"","unit":"","updateTime":"2019-05-15 21:50:41","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:40","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:39","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:38","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:37","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:36","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:35","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:34","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:33","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:32","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:31","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:30","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:29","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:22","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:50:19","val":"19"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:44:02","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:44:01","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:44:00","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:58","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:13","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:12","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:11","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:10","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:09","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:08","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:07","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:06","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:05","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:04","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:03","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:02","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:01","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:43:00","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:42:50","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:39:41","val":"18"},{"deviceName":"","height":"","lat":"","lng":"","sensorName":"","sensorTypeId":"1","speed":"","switcher":"","unit":"","updateTime":"2019-05-15 21:39:12","val":"18"}]
     * pageSize : 1000
     * page : 1
     * sumRows : 540
     */

    private String msg;   //消息
    private String flag;   //标志
    private int totalPage;  //总页数
    private int pageSize;  //每页显示条数
    private String page;   //当前页
    private int sumRows;   //总条数
    private List<DataListBean> dataList;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public int getSumRows() {
        return sumRows;
    }

    public void setSumRows(int sumRows) {
        this.sumRows = sumRows;
    }

    public List<DataListBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListBean> dataList) {
        this.dataList = dataList;
    }

    public static class DataListBean {
        /**
         * deviceName :
         * height :
         * lat :
         * lng :
         * sensorName :
         * sensorTypeId : 1
         * speed :
         * switcher :
         * unit :
         * updateTime : 2019-05-22 19:53:30
         * val : 27
         *  2000 unit :
         * switch 16d6 er :
         */

        private String deviceName;    //设备名称
        private String height;
        private String lat;
        private String lng;
        private String sensorName;   //传感器名称
        private String sensorTypeId;   //传感器类型
        private String speed;
        private String switcher;
        private String unit;       //单位
        private String updateTime;    //跟新时间
        private String val;    //数值
        @SerializedName(" 2000 unit")
        private String _$2000Unit205; // FIXME check this code
        @SerializedName("switch 16d6 er")
        private String _$Switch16d6Er323; // FIXME check this code

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getSensorName() {
            return sensorName;
        }

        public void setSensorName(String sensorName) {
            this.sensorName = sensorName;
        }

        public String getSensorTypeId() {
            return sensorTypeId;
        }

        public void setSensorTypeId(String sensorTypeId) {
            this.sensorTypeId = sensorTypeId;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public String getSwitcher() {
            return switcher;
        }

        public void setSwitcher(String switcher) {
            this.switcher = switcher;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public String get_$2000Unit205() {
            return _$2000Unit205;
        }

        public void set_$2000Unit205(String _$2000Unit205) {
            this._$2000Unit205 = _$2000Unit205;
        }

        public String get_$Switch16d6Er323() {
            return _$Switch16d6Er323;
        }

        public void set_$Switch16d6Er323(String _$Switch16d6Er323) {
            this._$Switch16d6Er323 = _$Switch16d6Er323;
        }
    }
}
