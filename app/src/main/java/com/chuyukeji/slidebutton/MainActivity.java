package com.chuyukeji.slidebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyToggleButton toggleButton;
    private MyToggleButton toggleButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        toggleButton = (MyToggleButton) findViewById(R.id.myToggle);
        //设置按钮的状态
        toggleButton.setToggleStste(true);
        //创建一个监听
        MyListener myListener = new MyListener();
        //设置监听
        toggleButton.setOnToggleStateChangedListener(myListener);

        //初始化控件
        toggleButton2 = (MyToggleButton) findViewById(R.id.myToggle2);
        //设置按钮的状态
        toggleButton2.setToggleStste(true);
        //创建一个监听
        MyListener myListener2 = new MyListener();
        //设置监听
        toggleButton2.setOnToggleStateChangedListener(myListener2);

    }

    //创建一个监听
    class MyListener implements MyToggleButton.onToggleStateChangedListener {

        @Override
        public void onToggleStateChange(MyToggleButton button, boolean isToggleOn) {

            //判定是哪个按钮触发了监听
            switch (button.getId()) {
                case R.id.myToggle:
                    Toast.makeText(MainActivity.this, isToggleOn ? "开1" : "关1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.myToggle2:
                    Toast.makeText(MainActivity.this, isToggleOn ? "开2" : "关2", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
