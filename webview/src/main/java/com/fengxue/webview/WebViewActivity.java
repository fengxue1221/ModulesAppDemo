package com.fengxue.webview;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.fengxue.webview.databinding.ActivityWebviewBinding;
import com.fengxue.webview.utils.Constants;

public class WebViewActivity extends AppCompatActivity {

    private ActivityWebviewBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_webview);
        binding.webview.getSettings().setJavaScriptEnabled(true);
        binding.webview.loadUrl(getIntent().getStringExtra(Constants.URL));

        if (getIntent().getBooleanExtra(Constants.IS_SHOW_ACTIONBAR, false)) {
            binding.toolbar.setVisibility(View.VISIBLE);
            setSupportActionBar(binding.toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getIntent().getStringExtra(Constants.TITLE));
            binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        } else {
            binding.toolbar.setVisibility(View.GONE);
        }
    }
}
