package android.com.chuanganqi;

import android.com.beans.LoginBean;
import android.com.beans.LoginBeanCan;
import android.com.callback.ResponseCallback;
import android.com.utils.SPUtils;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONObject;
import org.xutils.ex.DbException;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

public class LoginActivity extends BaseActivity {

    private EditText et_zhanghao;   //初始化账号
    private EditText et_password;    //初始化密码
    TextView tv_main_enter;      //enter按钮
    TextView tv_main_register;

    @Override
    public void initLayout() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initView() {
        et_zhanghao = findViewById(R.id.et_zhanghao);    //获取输入的账号和密码
        et_password = findViewById(R.id.et_password);
        tv_main_enter = (TextView) findViewById(R.id.tv_main_enter);
        tv_main_register = (TextView) findViewById(R.id.tv_main_register);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {
        tv_main_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String zhanghao = et_zhanghao.getText().toString().trim();   //去掉空格
                String password = et_password.getText().toString().trim();
                if (TextUtils.isEmpty(zhanghao)) {
                    Toast.makeText(LoginActivity.this, "请输入账号", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }
                /*zhanghao = "19935343373";
                password = "809580361@";*/
                RequestParams params = new RequestParams("http://api.tlink.io/tlink_interface/api/user/userLogin.htm");
                LoginBeanCan loginBeanCan = new LoginBeanCan();
                loginBeanCan.setUserName(zhanghao);
                loginBeanCan.setPassword(password);
                String json = new Gson().toJson(loginBeanCan);//转换java 对象到JSON
                params.setAsJsonContent(true);
                params.setBodyContent(json);
                /*params.addQueryStringParameter("userName", zhanghao);
                params.addQueryStringParameter("password", password);*/
                params.setMultipart(true);
                x.http().post(params, new ResponseCallback(LoginActivity.this) {
                    @Override
                    public void onSuccess(String s) {
                        LoginBean loginBean = new Gson().fromJson(s, LoginBean.class);// 转换JSON到java对象
                        if (loginBean.getFlag().equals("00")) {   //校验标志是否是00，是则表示账号密码正确。
                            SPUtils.getInstance(LoginActivity.this).put("userId", loginBean.getUserId());   //传参
                            SPUtils.getInstance(LoginActivity.this).put("userKey", loginBean.getUserKey());

                           // Intent是一种运行时绑定机制，它能在程序运行的过程中连接两个不同的组件。
                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            intent.putExtra("LoginBean",loginBean);
                            startActivity(intent);
                            Toast.makeText(LoginActivity.this, loginBean.getMsg(), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(LoginActivity.this, loginBean.getMsg(), Toast.LENGTH_SHORT).show();
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
        });


    }
}
