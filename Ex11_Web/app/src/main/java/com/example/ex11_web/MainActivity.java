package com.example.ex11_web;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent != null && intent.getData() != null) {
            String url = intent.getData().toString();
            // Open the URL in the browser
            webView = findViewById(R.id.web_search);
            webView.loadUrl(url);

        }

    }
}