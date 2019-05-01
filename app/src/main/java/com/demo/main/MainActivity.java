package com.demo.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.util.Linkify;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hi
        // Hello Shobhit

        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView url = findViewById(R.id.url);

        Linkify.addLinks(email,Linkify.EMAIL_ADDRESSES);
        Linkify.addLinks(phone,Linkify.PHONE_NUMBERS);
        Linkify.addLinks(url,Linkify.WEB_URLS);

        final TextView showOrHideText = findViewById(R.id.showOrHideText);
        final EditText eT_password = findViewById(R.id.eT_password);
        showOrHideText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = showOrHideText.getText().toString();
                if (text.equals("show")){
                    eT_password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    showOrHideText.setText("hide");
                }else {
                    eT_password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    showOrHideText.setText("show");
                }
            }
        });
    }
}
