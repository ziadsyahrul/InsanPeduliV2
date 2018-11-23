package com.ziadsyahrul.demowebview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutWebView.settings.javaScriptEnabled
        layoutWebView.loadUrl("https://insanpeduli.com/")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when (item?.itemId) {

        R.id.webProfil -> {
            layoutWebView.loadUrl("https://insanpeduli.com/profil/")
            true
        }

        R.id.webBantuan -> {
            layoutWebView.loadUrl("https://insanpeduli.com/bantuan/")
            true
        }

        R.id.webDonasi -> {
            layoutWebView.loadUrl("https://insanpeduli.com/donasi-sip/")
            true
        }

        R.id.webVerifikator -> {
            layoutWebView.loadUrl("https://insanpeduli.com/verifikator-sip/")
            true
        }

        R.id.webLaporan -> {
            layoutWebView.loadUrl("https://insanpeduli.com/keuangan/")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
