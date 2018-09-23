package com.example.joel_.studentportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PortalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        String url = "https://www.google.com";
        WebView myWebView = findViewById(R.id.webview);
        myWebView.loadUrl(url);
    }
}
