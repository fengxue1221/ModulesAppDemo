package com.fengxue.webview;

import android.content.Context;
import android.content.Intent;

import com.fengxue.common.autoservice.IWebViewService;
import com.google.auto.service.AutoService;

@AutoService({IWebViewService.class})
public class WebViewServiceImpl implements IWebViewService {
    @Override
    public void startWebViewActivity(Context context, String url, String title) {
        if (context != null) {
            context.startActivity(new Intent(context, WebViewActivity.class));
        }
    }
}
