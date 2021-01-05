package android.com.chuanganqi;

import android.com.adapter.HistoryAdapter;
import android.com.beans.HistoryBean;
import android.com.beans.HistoryBeanCan;
import android.com.beans.QueryBean;
import android.com.beans.QueryBeanCan;
import android.com.beans.SecondBean;
import android.com.callback.ResponseCallback;
import android.com.utils.Constant;
import android.com.utils.SPUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.xutils.http.RequestParams;
import org.xutils.x;

public class HistoryActivity extends BaseActivity {
    private RecyclerView recy_history;
    private LinearLayoutManager linearLayoutManager;
    private HistoryAdapter historyAdapter;

    @Override
    public void initLayout() {
        setContentView(R.layout.activity_history);
    }

    @Override
    public void initView() {
        recy_history = findViewById(R.id.recy_history);
        linearLayoutManager = new LinearLayoutManager(this);
        historyAdapter = new HistoryAdapter(this);
        recy_history.setLayoutManager(linearLayoutManager);
        recy_history.setAdapter(historyAdapter);
    }

    @Override
    public void initData() {
        QueryBean.DeviceListBean.SensorListBean sensorListBean =
                (QueryBean.DeviceListBean.SensorListBean) getIntent().getSerializableExtra("SensorListBean");
        RequestParams params = new RequestParams("http://api.tlink.io/tlink_interface/api/device/querySensorDataById_bak.htm");
        HistoryBeanCan historyBeanCan = new HistoryBeanCan();
        historyBeanCan.setUserId(SPUtils.getInstance(HistoryActivity.this).getInt("userId"));
        historyBeanCan.setSensorId(sensorListBean.getSensorId());
        historyBeanCan.setPageSize("1000");
        historyBeanCan.setStartDate(Constant.getStartTime());
        historyBeanCan.setEndDate(Constant.getCurrenTime());
        String json = new Gson().toJson(historyBeanCan);
        params.setAsJsonContent(true);
        params.setBodyContent(json);
        params.setMultipart(true);
        x.http().post(params, new ResponseCallback(HistoryActivity.this) {
            @Override
            public void onSuccess(String s) {
                HistoryBean historyBean = new Gson().fromJson(s, HistoryBean.class);
                if (historyBean != null && historyBean.getDataList() != null && historyBean.getDataList().size() > 0) {
                    historyAdapter.setData(historyBean.getDataList());
                } else {
                    Toast.makeText(HistoryActivity.this, "暂无历史记录", Toast.LENGTH_SHORT).show();
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
    }

    @Override
    public void initEvent() {

    }
}
