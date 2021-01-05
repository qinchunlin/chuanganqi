package android.com.chuanganqi;

import android.com.adapter.MainAdapter;
import android.com.beans.LoginBean;
import android.com.beans.LoginBeanCan;
import android.com.beans.QueryBean;
import android.com.beans.QueryBeanCan;
import android.com.beans.SeconBeanCan;
import android.com.beans.SecondBean;
import android.com.callback.ResponseCallback;
import android.com.utils.SPUtils;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends BaseActivity {
    private TextView tv_title;     //设备名称
    private TextView tv_name;       //传感器名字
    private TextView tv_createDateTime;   //创建数据时间
    private RecyclerView recy_main;    //
    private LinearLayoutManager linearLayoutManager;    //线性布局管理
    private MainAdapter mainAdapter;

    @Override
    public void initLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        tv_title = findViewById(R.id.tv_title);
        tv_name = findViewById(R.id.tv_name);
        tv_createDateTime = findViewById(R.id.tv_createDateTime);
        recy_main = findViewById(R.id.recy_main);
        linearLayoutManager = new LinearLayoutManager(this);
        mainAdapter = new MainAdapter(this);
        recy_main.setAdapter(mainAdapter);
        recy_main.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void initData() {
        LoginBean loginBean = (LoginBean) getIntent().getSerializableExtra("LoginBean");
        RequestParams params = new RequestParams("http://api.tlink.io/tlink_interface/api/device/queryUserDevices.htm");//查询用户设备接口
        SeconBeanCan loginBeanCan = new SeconBeanCan();
        loginBeanCan.setUserId(SPUtils.getInstance(this).getInt("userId"));
        loginBeanCan.setApiKey(loginBean.getUserKey());
        String json = new Gson().toJson(loginBeanCan);
        params.setAsJsonContent(true);
        params.setBodyContent(json);
        params.setMultipart(true);
        x.http().post(params, new ResponseCallback(MainActivity.this) {
            @Override
            public void onSuccess(String s) {
                SecondBean secondBean = new Gson().fromJson(s, SecondBean.class);
                RequestParams params = new RequestParams("http://api.tlink.io/tlink_interface/api/device/queryDevicesIndex.htm");//查询设备监控数据接口
                QueryBeanCan loginBeanCan = new QueryBeanCan();
                loginBeanCan.setUserId(SPUtils.getInstance(MainActivity.this).getInt("userId"));
                loginBeanCan.setDeviceId(secondBean.getDevices().get(0).getId());
                String json = new Gson().toJson(loginBeanCan);
                params.setAsJsonContent(true);
                params.setBodyContent(json);
                params.setMultipart(true);
                x.http().post(params, new ResponseCallback(MainActivity.this) {
                    @Override
                    public void onSuccess(String s) {
                        QueryBean queryBean = new Gson().fromJson(s, QueryBean.class);
                        tv_title.setText(queryBean.getDeviceList().get(0).getDeviceName());//设置设备名称
                        tv_name.setText(queryBean.getDeviceList().get(0).getDeviceName());//设置传感器名称
                        tv_createDateTime.setText(queryBean.getDeviceList().get(0).getCreateDateTime());//创建时间
                        mainAdapter.setData(queryBean.getDeviceList().get(0).getSensorList());//获取传感器列表
                        SPUtils.getInstance(MainActivity.this).put("deviceNo", queryBean.getDeviceList().get(0).getDeviceNo());
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
    }

    @Override
    public void initEvent() {

    }
}
