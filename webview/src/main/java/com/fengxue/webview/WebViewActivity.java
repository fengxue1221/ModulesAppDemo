package com.fengxue.webview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.fengxue.webview.databinding.ActivityWebviewBinding;
import com.fengxue.webview.utils.Constants;

public class WebViewActivity extends AppCompatActivity {

    private ActivityWebviewBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_webview);
        binding.webview.getSettings().setJavaScriptEnabled(true);
        binding.webview.loadUrl(getIntent().getStringExtra(Constants.URL));
    }
}
