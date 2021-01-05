package android.com.adapter;


import android.com.beans.LoginBean;
import android.com.beans.LoginBeanCan;
import android.com.beans.QueryBean;
import android.com.beans.SwitchBean;
import android.com.beans.SwitchBeanCan;
import android.com.callback.ResponseCallback;
import android.com.chuanganqi.HistoryActivity;
import android.com.chuanganqi.LoginActivity;
import android.com.chuanganqi.MainActivity;
import android.com.chuanganqi.R;
import android.com.utils.SPUtils;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Android on 2019/3/8.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private Context context;
    private List<QueryBean.DeviceListBean.SensorListBean> dataBeans = new ArrayList<>();
    boolean isOpen = false;

    public MainAdapter(Context context) {
        this.context = context;
    }

    public void setData(List list) {
        if (dataBeans != null && dataBeans.size() > 0) {
            dataBeans.clear();
        }
        dataBeans = list;
        notifyDataSetChanged();
    }


    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MainViewHolder holder, final int position) {
        Glide.with(context).load(dataBeans.get(position).getIocUrl()).into(holder.iv_iocUrl);
        holder.tv_sensorName.setText(dataBeans.get(position).getSensorName());
        holder.tv_unit.setText(dataBeans.get(position).getValue() + "" + dataBeans.get(position).getUnit());
        holder.llt_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dataBeans.get(position).getSensorType().equals("1")) {
                    Intent intent = new Intent(context, HistoryActivity.class);
                    intent.putExtra("SensorListBean", dataBeans.get(position));
                    context.startActivity(intent);
                }

            }
        });
        if (dataBeans.get(position).getSensorType().equals("1")) {
            holder.iv_switch.setVisibility(View.GONE);
        } else {
            holder.iv_switch.setVisibility(View.VISIBLE);
        }
        holder.iv_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpen) {
                    RequestParams params = new RequestParams("http://api.tlink.io/tlink_interface/api/device/sendSwitchValue.htm");
                    SwitchBeanCan switchBeanCan = new SwitchBeanCan();
                    switchBeanCan.setValue("1");
                    switchBeanCan.setUserKey(SPUtils.getInstance(context).getString("userKey"));
                    switchBeanCan.setDeviceNo(SPUtils.getInstance(context).getString("deviceNo"));
                    switchBeanCan.setSensorId(dataBeans.get(position).getSensorId());
                    String json = new Gson().toJson(switchBeanCan);
                    params.setAsJsonContent(true);
                    params.setBodyContent(json);
                /*params.addQueryStringParameter("userName", zhanghao);
                params.addQueryStringParameter("password", password);*/
                    params.setMultipart(true);
                    x.http().post(params, new ResponseCallback(context) {
                        @Override
                        public void onSuccess(String s) {
                            SwitchBean switchBean = new Gson().fromJson(s, SwitchBean.class);
                            if (switchBean.getFlag().equals("00")) {
                                Toast.makeText(context, "操作成功", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(context, "操作失败", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onError(Throwable ex, boolean isOnCallback) {
                            super.onError(ex, isOnCallback);
                        }

                        @Override
                        public void onFinished() {
                            super.onFinished();
                        }
                    });
                    holder.iv_switch.setImageResource(R.mipmap.off);
                    isOpen = false;
                } else {
                    RequestParams params = new RequestParams("http://api.tlink.io/tlink_interface/api/device/sendSwitchValue.htm");
                    SwitchBeanCan switchBeanCan = new SwitchBeanCan();
                    switchBeanCan.setValue("0");
                    switchBeanCan.setUserKey(SPUtils.getInstance(context).getString("userKey"));
                    switchBeanCan.setDeviceNo(SPUtils.getInstance(context).getString("deviceNo"));
                    switchBeanCan.setSensorId(dataBeans.get(position).getSensorId());
                    String json = new Gson().toJson(switchBeanCan);
                    params.setAsJsonContent(true);
                    params.setBodyContent(json);
                /*params.addQueryStringParameter("userName", zhanghao);
                params.addQueryStringParameter("password", password);*/
                    params.setMultipart(true);
                    x.http().post(params, new ResponseCallback(context) {
                        @Override
                        public void onSuccess(String s) {
                            SwitchBean switchBean = new Gson().fromJson(s, SwitchBean.class);
                            if (switchBean.getFlag().equals("00")) {
                                Toast.makeText(context, "操作成功", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(context, "操作失败", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onError(Throwable ex, boolean isOnCallback) {
                            super.onError(ex, isOnCallback);
                        }

                        @Override
                        public void onFinished() {
                            super.onFinished();
                        }
                    });
                    holder.iv_switch.setImageResource(R.mipmap.open);
                    isOpen = true;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (dataBeans != null && dataBeans.size() > 0) {
            return dataBeans.size();
        } else {
            return 0;
        }
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_iocUrl;
        private ImageView iv_switch;
        private TextView tv_sensorName;
        private TextView tv_unit;
        private LinearLayout llt_root;

        public MainViewHolder(View itemView) {
            super(itemView);
            iv_iocUrl = itemView.findViewById(R.id.iv_iocUrl);
            iv_switch = itemView.findViewById(R.id.iv_switch);
            tv_sensorName = itemView.findViewById(R.id.tv_sensorName);
            tv_unit = itemView.findViewById(R.id.tv_unit);
            llt_root = itemView.findViewById(R.id.llt_root);
        }
    }


}
