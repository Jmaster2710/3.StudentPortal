package com.example.joel_.studentportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;
import java.util.List;

public class PortalActivity extends AppCompatActivity {

        String mUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            mUrl = extras.getString("Url"); // retrieve the data using keyName
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        String url = mUrl;
        WebView myWebView = findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.loadUrl(url);
    }
}
