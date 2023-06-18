package com.example.myqq;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText edtUserName,edtPWD;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = (EditText) this.findViewById(R.id.edtUserName);
        edtPWD = (EditText) this.findViewById(R.id.edtPWD);
        btnLogin = (Button) this.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUserName=edtUserName.getText().toString();
                String sPWD=edtPWD.getText().toString();

                //账号为20212140，密码为12345678
                if(sUserName.equals("20212140")&&sPWD.equals("12345678")){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"QQ号或密码错误，请重新输入！",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
