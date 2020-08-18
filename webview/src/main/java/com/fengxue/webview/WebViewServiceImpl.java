package com.fengxue.webview;

import android.content.Context;
import android.content.Intent;

import com.fengxue.common.autoservice.IWebViewService;
import com.fengxue.webview.utils.Constants;
import com.google.auto.service.AutoService;

@AutoService({IWebViewService.class})
public class WebViewServiceImpl implements IWebViewService {
    @Override
    public void startWebViewActivity(Context context, String url, String title) {
        if (context != null) {
            Intent intent = new Intent(context,WebViewActivity.class);
            intent.putExtra(Constants.TITLE,title);
            intent.putExtra(Constants.URL,url);
            context.startActivity(intent);
        }
    }
}
