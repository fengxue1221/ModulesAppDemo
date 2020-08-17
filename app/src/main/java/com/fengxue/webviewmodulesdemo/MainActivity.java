package com.fengxue.webviewmodulesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fengxue.common.autoservice.IWebViewService;
import com.fengxue.webview.WebViewActivity;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.open_webviewactivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IWebViewService webviewService = ServiceLoader.load(IWebViewService.class).iterator().next();
                webviewService.startWebViewActivity(MainActivity.this,"https://www.baidu.com","百度");
            }
        });
    }
}
