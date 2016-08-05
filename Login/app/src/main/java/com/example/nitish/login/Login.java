package com.example.nitish.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);
        Button go = (Button)findViewById(R.id.login);
        final String conv_name,conv_pass;
        conv_name = username.getText().toString();
        conv_pass = password.getText().toString();
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(conv_name != null && conv_pass != null)
                {
                    Intent move = new Intent(Login.this,Googlemap.class);
                    startActivity(move);
                }
                else
                {
                    Toast.makeText(Login.this,"usename or password is empty",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
