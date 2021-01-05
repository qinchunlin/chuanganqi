package android.com.adapter;

import android.com.beans.HistoryBean;
import android.com.beans.QueryBean;
import android.com.chuanganqi.HistoryActivity;
import android.com.chuanganqi.R;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 2019/5/14.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MainViewHolder> {
    private Context context;
    private List<HistoryBean.DataListBean> dataBeans = new ArrayList<>();

    public HistoryAdapter(Context context) {
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
    public HistoryAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_history, parent, false);
        return new HistoryAdapter.MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final HistoryAdapter.MainViewHolder holder, final int position) {
        holder.tv_sensorName.setText(dataBeans.get(position).getUpdateTime());
        holder.tv_unit.setText(dataBeans.get(position).getVal()+""+dataBeans.get(position).getUnit());

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
        private TextView tv_sensorName;
        private TextView tv_unit;
        private LinearLayout llt_root;

        public MainViewHolder(View itemView) {
            super(itemView);
            iv_iocUrl = itemView.findViewById(R.id.iv_iocUrl);
            tv_sensorName = itemView.findViewById(R.id.tv_sensorName);
            tv_unit = itemView.findViewById(R.id.tv_unit);
            llt_root = itemView.findViewById(R.id.llt_root);
        }
    }


}

