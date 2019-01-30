package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.webkit.WebView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_webView.loadUrl("https://www.packtpub.com/")
        val webViewClient : WebViewClient = WebViewClient()
        main_webView.webViewClient = object : WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }

            override fun onLoadResource(view: WebView?, url: String?) {
                super.onLoadResource(view, url)
            Toast.makeText(applicationContext,"Loading",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
