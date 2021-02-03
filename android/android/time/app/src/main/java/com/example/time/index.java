package com.example.time;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class index extends Activity {
    private Button button_home;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        button_home = (Button)findViewById(R.id.button_home);

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
//                Notification notification = new NotificationCompat.Builder(index.this)
//                        .setContentTitle("title")
//                        .setContentText("content")
//                        .setSmallIcon(R.drawable.icon)
//                        .setWhen(System.currentTimeMillis())
//                        .build();
//                manager.notify(1,notification);
                //通知渠道的ID
                String id = "channel_01";
                //用户可以看到的通知渠道的名字
                CharSequence name = "channel name";
                //用户可看到的通知描述
                String description = "channel_description";
                //构建NotificationChannel实例
                NotificationChannel notificationChannel = new NotificationChannel(id,name,NotificationManager.IMPORTANCE_HIGH);
                //配置通知渠道的属性
                notificationChannel.setDescription(description);
                //在notificationManager中创建通知渠道
                notificationManager.createNotificationChannel(notificationChannel);
                Notification notification = new NotificationCompat.Builder(index.this,id)
                        //指定通知的标题内容
                        .setContentTitle("This is content title")
                        //设置通知的内容
                        .setContentText("This is content text")
                        //指定通知被创建的时间
                        .setWhen(System.currentTimeMillis())
                        //设置通知的小图标
                        .setSmallIcon(R.drawable.icon)

                        //添加点击跳转通知跳转
//                        .setContentIntent(pendingIntent)
                        //实现点击跳转后关闭通知
                        .setAutoCancel(true)
                        .build();

/*
调用NotificationManager的notify()方法将通知显示出来
传入的第一个参数是通知的id
传入的第二个参数是notification对象
 */
                notificationManager.notify(1,notification);
                Log.d("index","send msg");
            }
        });

    }
}
