package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //@SuppressLint("SetJavaScriptEnabled", "AddJavascriptInterface")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.myWebView)
        webView.loadUrl("http://10.15.252.238/test.html")
        webView.settings.javaScriptEnabled = true

        webView.addJavascriptInterface(JsObject(), "injectObject")
        //webView.loadData("", "text/html", null)
        //webView.loadUrl("javascript:alert(injectedObject.toString()")
        //webView.webViewClient = WebViewClient()
    }


}