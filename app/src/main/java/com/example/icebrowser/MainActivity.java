package com.example.icebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private Button ButtonReturn;
    private Button ButtonForward;
    private Button ButtonReload;


   // @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    webView = findViewById(R.id.webView);
    ButtonReturn = findViewById(R.id.ButtonReturn);
    ButtonForward = findViewById(R.id.ButtonForward);
    ButtonReload = findViewById(R.id.ButtonReload);


    webView.getSettings().setJavaScriptEnabled(true);
    webView.loadUrl("https://www.google.com");

    ButtonReturn.setOnClickListener(new View.OnClickListener(){
   //     @Override
        public void onClick(View view){
            webView.goBack();
        }
    });

        ButtonForward.setOnClickListener(new View.OnClickListener() {
     //       @Override
            public void onClick(View view){
                webView.goForward();
            }
        });




    ButtonReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                webView.reload();
            }
        });

    }
}