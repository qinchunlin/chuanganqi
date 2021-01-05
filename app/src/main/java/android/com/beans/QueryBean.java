package android.com.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Android on 2019/5/12.
 */

public class QueryBean {

    /**
     * msg :
     * flag : 00
     * deviceList : [{"createDateTime":"2019-05-14 20:01:17","defaultTimescale":"60","deviceId":"200042557","deviceIoc":"/images/device-icon/non_online-1.png","deviceName":"环境监测","deviceNo":"867J61108Y08037R","faultDelay":"","isAlarms":"0","isDelete":"0","isSetLink":"0","lat":"38.021775","linktype":"mqtt","lng":"112.454229","sensorList":[{"decimalPlacse":"","height":"","hls":"","iocUrl":"/images/temperature.png","isAlarm":"0","isHide":"0","isLine":"0","isMapping":"0","lat":"","lng":"","rtmp":"","sensorId":"200292192","sensorMapping":null,"sensorName":"温度","sensorSwitch":"","sensorType":"1","speed":"","switcher":"","unit":"摄氏度","updateDateTime":"2019-05-22 14:28:38","value":"32"},{"decimalPlacse":"","height":"","hls":"","iocUrl":"/images/humidity.png","isAlarm":"0","isHide":"0","isLine":"0","isMapping":"0","lat":"","lng":"","rtmp":"","sensorId":"200292193","sensorMapping":null,"sensorName":"湿度","sensorSwitch":"","sensorType":"1","speed":"","switcher":"","unit":"百分比","updateDateTime":"2019-05-22 14:28:38","value":"14"},{"decimalPlacse":"","height":"","hls":"","iocUrl":"/images/switch.png","isAlarm":"0","isHide":"0","isLine":"0","isMapping":"0","lat":"","lng":"","rtmp":"","sensorId":"200294115","sensorMapping":null,"sensorName":"小灯","sensorSwitch":"","sensorType":"2","speed":"","switcher":"","unit":"","updateDateTime":"","value":""}]}]
     */

    private String msg;
    private String flag;
    private List<DeviceListBean> deviceList;

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

    public List<DeviceListBean> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<DeviceListBean> deviceList) {
        this.deviceList = deviceList;
    }

    public static class DeviceListBean {
        /**
         * createDateTime : 2019-05-14 20:01:17
         * defaultTimescale : 60
         * deviceId : 200042557
         * deviceIoc : /images/device-icon/non_online-1.png
         * deviceName : 环境监测
         * deviceNo : 867J61108Y08037R
         * faultDelay :
         * isAlarms : 0
         * isDelete : 0
         * isSetLink : 0
         * lat : 38.021775
         * linktype : mqtt
         * lng : 112.454229
         * sensorList : [{"decimalPlacse":"","height":"","hls":"","iocUrl":"/images/temperature.png","isAlarm":"0","isHide":"0","isLine":"0","isMapping":"0","lat":"","lng":"","rtmp":"","sensorId":"200292192","sensorMapping":null,"sensorName":"温度","sensorSwitch":"","sensorType":"1","speed":"","switcher":"","unit":"摄氏度","updateDateTime":"2019-05-22 14:28:38","value":"32"},{"decimalPlacse":"","height":"","hls":"","iocUrl":"/images/humidity.png","isAlarm":"0","isHide":"0","isLine":"0","isMapping":"0","lat":"","lng":"","rtmp":"","sensorId":"200292193","sensorMapping":null,"sensorName":"湿度","sensorSwitch":"","sensorType":"1","speed":"","switcher":"","unit":"百分比","updateDateTime":"2019-05-22 14:28:38","value":"14"},{"decimalPlacse":"","height":"","hls":"","iocUrl":"/images/switch.png","isAlarm":"0","isHide":"0","isLine":"0","isMapping":"0","lat":"","lng":"","rtmp":"","sensorId":"200294115","sensorMapping":null,"sensorName":"小灯","sensorSwitch":"","sensorType":"2","speed":"","switcher":"","unit":"","updateDateTime":"","value":""}]
         */

        private String createDateTime;  //创建时间
        private String defaultTimescale;   //默认时间间隔
        private String deviceId;     //设备ID
        private String deviceIoc;   //设备图标
        private String deviceName;   //设备名称
        private String deviceNo;   //设备序列号
        private String faultDelay;   //默认延迟
        private String isAlarms;   //0
        private String isDelete;  //是否删除，0否1是
        private String isSetLink;   //是否公开
        private String lat;     //经度
        private String linktype;  //
        private String lng;  //纬度
        private List<SensorListBean> sensorList;

        public String getCreateDateTime() {
            return createDateTime;
        }

        public void setCreateDateTime(String createDateTime) {
            this.createDateTime = createDateTime;
        }

        public String getDefaultTimescale() {
            return defaultTimescale;
        }

        public void setDefaultTimescale(String defaultTimescale) {
            this.defaultTimescale = defaultTimescale;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceIoc() {
            return deviceIoc;
        }

        public void setDeviceIoc(String deviceIoc) {
            this.deviceIoc = deviceIoc;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getDeviceNo() {
            return deviceNo;
        }

        public void setDeviceNo(String deviceNo) {
            this.deviceNo = deviceNo;
        }

        public String getFaultDelay() {
            return faultDelay;
        }

        public void setFaultDelay(String faultDelay) {
            this.faultDelay = faultDelay;
        }

        public String getIsAlarms() {
            return isAlarms;
        }

        public void setIsAlarms(String isAlarms) {
            this.isAlarms = isAlarms;
        }

        public String getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(String isDelete) {
            this.isDelete = isDelete;
        }

        public String getIsSetLink() {
            return isSetLink;
        }

        public void setIsSetLink(String isSetLink) {
            this.isSetLink = isSetLink;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLinktype() {
            return linktype;
        }

        public void setLinktype(String linktype) {
            this.linktype = linktype;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public List<SensorListBean> getSensorList() {
            return sensorList;
        }

        public void setSensorList(List<SensorListBean> sensorList) {
            this.sensorList = sensorList;
        }

        public static class SensorListBean implements Serializable{
            /**
             * decimalPlacse :
             * height :
             * hls :
             * iocUrl : /images/temperature.png
             * isAlarm : 0
             * isHide : 0
             * isLine : 0
             * isMapping : 0
             * lat :
             * lng :
             * rtmp :
             * sensorId : 200292192
             * sensorMapping : null
             * sensorName : 温度
             * sensorSwitch :
             * sensorType : 1
             * speed :
             * switcher :
             * unit : 摄氏度
             * updateDateTime : 2019-05-22 14:28:38
             * value : 32
             */

            private String decimalPlacse;
            private String height;
            private String hls;
            private String iocUrl;     //图标
            private String isAlarm;
            private String isHide;
            private String isLine;
            private String isMapping;
            private String lat;
            private String lng;
            private String rtmp;
            private String sensorId;   //传感器ID
            private Object sensorMapping;
            private String sensorName;    //传感器名称
            private String sensorSwitch;
            private String sensorType;    //类型
            private String speed;
            private String switcher;
            private String unit;    //单位
            private String updateDateTime;
            private String value;   //数值

            public String getDecimalPlacse() {
                return decimalPlacse;
            }

            public void setDecimalPlacse(String decimalPlacse) {
                this.decimalPlacse = decimalPlacse;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }

            public String getHls() {
                return hls;
            }

            public void setHls(String hls) {
                this.hls = hls;
            }

            public String getIocUrl() {
                return iocUrl;
            }

            public void setIocUrl(String iocUrl) {
                this.iocUrl = iocUrl;
            }

            public String getIsAlarm() {
                return isAlarm;
            }

            public void setIsAlarm(String isAlarm) {
                this.isAlarm = isAlarm;
            }

            public String getIsHide() {
                return isHide;
            }

            public void setIsHide(String isHide) {
                this.isHide = isHide;
            }

            public String getIsLine() {
                return isLine;
            }

            public void setIsLine(String isLine) {
                this.isLine = isLine;
            }

            public String getIsMapping() {
                return isMapping;
            }

            public void setIsMapping(String isMapping) {
                this.isMapping = isMapping;
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

            public String getRtmp() {
                return rtmp;
            }

            public void setRtmp(String rtmp) {
                this.rtmp = rtmp;
            }

            public String getSensorId() {
                return sensorId;
            }

            public void setSensorId(String sensorId) {
                this.sensorId = sensorId;
            }

            public Object getSensorMapping() {
                return sensorMapping;
            }

            public void setSensorMapping(Object sensorMapping) {
                this.sensorMapping = sensorMapping;
            }

            public String getSensorName() {
                return sensorName;
            }

            public void setSensorName(String sensorName) {
                this.sensorName = sensorName;
            }

            public String getSensorSwitch() {
                return sensorSwitch;
            }

            public void setSensorSwitch(String sensorSwitch) {
                this.sensorSwitch = sensorSwitch;
            }

            public String getSensorType() {
                return sensorType;
            }

            public void setSensorType(String sensorType) {
                this.sensorType = sensorType;
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

            public String getUpdateDateTime() {
                return updateDateTime;
            }

            public void setUpdateDateTime(String updateDateTime) {
                this.updateDateTime = updateDateTime;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}
