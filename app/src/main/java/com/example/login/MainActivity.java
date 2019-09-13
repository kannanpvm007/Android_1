package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText user,psw;
    String name,pswod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user= findViewById(R.id.username);
        psw= findViewById(R.id.password);



    }

    public void Signup(View view) {
        Toast.makeText(this, "SiginUP()", Toast.LENGTH_SHORT).show();
Intent in = new Intent(MainActivity.this,sinupact.class);
 startActivity(in);
    }

    public void login(View view) {
        Toast.makeText(this, "Login ()", Toast.LENGTH_SHORT).show();
        String un = "admin";
        String ps="admin";
        name =  user.getText().toString();
        pswod= psw.getText().toString();

        if(name.equals(un) && pswod.equals(ps) ){
          //  StringBuffer sb = new StringBuffer();
            //sb.append(name).append(pswod);
            Bundle  b = new Bundle();
            b.putString("log",name);
            b.putString("psw",pswod);
            Intent in = new Intent(MainActivity.this,Login.class);
            in.putExtras(b);

            startActivity(in);




        }
        else{

           Signup(view);

        }


    }


}
