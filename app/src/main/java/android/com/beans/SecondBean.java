package android.com.beans;

import java.util.List;

/**
 * Created by Android on 2019/5/12.
 */

public class SecondBean {

    /**
     * msg :
     * flag : 00
     * devices : [{"agreement":"","createDate":"2019-05-14 20:01:17","defaultTimescale":"60","deviceName":"环境监测","deviceNo":"867J61108Y08037R","faultDelay":"2019-05-14 20:01:17","id":200042557,"iocUrl":"/images/device-icon/non_online-1.png","iotDeviceId":"","isAlarms":"0","isDelete":0,"isLine":0,"isSendConfig":0,"isSetLink":0,"isShare":0,"lat":"38.021775","linktype":"mqtt","lng":"112.454229","operateUserId":0,"parentUser":"","remark":"null","restoreStatus":0,"sendDataType":0,"sendType":0,"sendVal":"","sendcycle":0,"sensorsList":[],"sequence":0,"udp_agreement":"","userId":200023137,"wx_deId":""},{"agreement":"","createDate":"2019-05-14 20:02:44","defaultTimescale":"60","deviceName":"开关","deviceNo":"B09OAXT1GHOA74JR","faultDelay":"2019-05-14 20:02:44","id":200042558,"iocUrl":"/images/device-icon/non_online-1.png","iotDeviceId":"","isAlarms":"0","isDelete":0,"isLine":0,"isSendConfig":0,"isSetLink":0,"isShare":0,"lat":"38.022775","linktype":"mqtt","lng":"112.45351","operateUserId":0,"parentUser":"","remark":"null","restoreStatus":0,"sendDataType":0,"sendType":0,"sendVal":"","sendcycle":0,"sensorsList":[],"sequence":0,"udp_agreement":"","userId":200023137,"wx_deId":""}]
     */

    private String msg;  //提示消息
    private String flag;   //标志
    private List<DevicesBean> devices;

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

    public List<DevicesBean> getDevices() {
        return devices;
    }

    public void setDevices(List<DevicesBean> devices) {
        this.devices = devices;
    }

    public static class DevicesBean {
        /**
         * agreement :
         * createDate : 2019-05-14 20:01:17
         * defaultTimescale : 60
         * deviceName : 环境监测
         * deviceNo : 867J61108Y08037R
         * faultDelay : 2019-05-14 20:01:17
         * id : 200042557
         * iocUrl : /images/device-icon/non_online-1.png
         * iotDeviceId :
         * isAlarms : 0
         * isDelete : 0
         * isLine : 0
         * isSendConfig : 0
         * isSetLink : 0
         * isShare : 0
         * lat : 38.021775
         * linktype : mqtt
         * lng : 112.454229
         * operateUserId : 0
         * parentUser :
         * remark : null
         * restoreStatus : 0
         * sendDataType : 0
         * sendType : 0
         * sendVal :
         * sendcycle : 0
         * sensorsList : []
         * sequence : 0
         * udp_agreement :
         * userId : 200023137
         * wx_deId :
         */

        private String agreement;
        private String createDate;
        private String defaultTimescale;
        private String deviceName;
        private String deviceNo;
        private String faultDelay;
        private int id;
        private String iocUrl;
        private String iotDeviceId;
        private String isAlarms;
        private int isDelete;
        private int isLine;
        private int isSendConfig;
        private int isSetLink;
        private int isShare;
        private String lat;
        private String linktype;
        private String lng;
        private int operateUserId;
        private String parentUser;
        private String remark;
        private int restoreStatus;
        private int sendDataType;
        private int sendType;
        private String sendVal;
        private int sendcycle;
        private int sequence;
        private String udp_agreement;
        private int userId;
        private String wx_deId;
        private List<?> sensorsList;

        public String getAgreement() {
            return agreement;
        }

        public void setAgreement(String agreement) {
            this.agreement = agreement;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getDefaultTimescale() {
            return defaultTimescale;
        }

        public void setDefaultTimescale(String defaultTimescale) {
            this.defaultTimescale = defaultTimescale;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIocUrl() {
            return iocUrl;
        }

        public void setIocUrl(String iocUrl) {
            this.iocUrl = iocUrl;
        }

        public String getIotDeviceId() {
            return iotDeviceId;
        }

        public void setIotDeviceId(String iotDeviceId) {
            this.iotDeviceId = iotDeviceId;
        }

        public String getIsAlarms() {
            return isAlarms;
        }

        public void setIsAlarms(String isAlarms) {
            this.isAlarms = isAlarms;
        }

        public int getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(int isDelete) {
            this.isDelete = isDelete;
        }

        public int getIsLine() {
            return isLine;
        }

        public void setIsLine(int isLine) {
            this.isLine = isLine;
        }

        public int getIsSendConfig() {
            return isSendConfig;
        }

        public void setIsSendConfig(int isSendConfig) {
            this.isSendConfig = isSendConfig;
        }

        public int getIsSetLink() {
            return isSetLink;
        }

        public void setIsSetLink(int isSetLink) {
            this.isSetLink = isSetLink;
        }

        public int getIsShare() {
            return isShare;
        }

        public void setIsShare(int isShare) {
            this.isShare = isShare;
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

        public int getOperateUserId() {
            return operateUserId;
        }

        public void setOperateUserId(int operateUserId) {
            this.operateUserId = operateUserId;
        }

        public String getParentUser() {
            return parentUser;
        }

        public void setParentUser(String parentUser) {
            this.parentUser = parentUser;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getRestoreStatus() {
            return restoreStatus;
        }

        public void setRestoreStatus(int restoreStatus) {
            this.restoreStatus = restoreStatus;
        }

        public int getSendDataType() {
            return sendDataType;
        }

        public void setSendDataType(int sendDataType) {
            this.sendDataType = sendDataType;
        }

        public int getSendType() {
            return sendType;
        }

        public void setSendType(int sendType) {
            this.sendType = sendType;
        }

        public String getSendVal() {
            return sendVal;
        }

        public void setSendVal(String sendVal) {
            this.sendVal = sendVal;
        }

        public int getSendcycle() {
            return sendcycle;
        }

        public void setSendcycle(int sendcycle) {
            this.sendcycle = sendcycle;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public String getUdp_agreement() {
            return udp_agreement;
        }

        public void setUdp_agreement(String udp_agreement) {
            this.udp_agreement = udp_agreement;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getWx_deId() {
            return wx_deId;
        }

        public void setWx_deId(String wx_deId) {
            this.wx_deId = wx_deId;
        }

        public List<?> getSensorsList() {
            return sensorsList;
        }

        public void setSensorsList(List<?> sensorsList) {
            this.sensorsList = sensorsList;
        }
    }
}
