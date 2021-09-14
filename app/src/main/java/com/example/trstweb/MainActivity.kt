package com.example.trstweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //AndroidアプリからChromeブラウザを起動する
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse
            ("https://192.168.11.33/api/websocket/"))
        startActivity(intent)

        //WebViewの残骸
        //val webView: WebView = findViewById(R.id.webView)
        //webView.loadUrl("file:///android_asset/kari/tes_2.html")
        
    }
}
