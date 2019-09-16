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
        Bundle b= getIntent().getExtras();


        try {
            if (b  != null) {
                String setname =b.getString("unn");
                String setpsw = b.getString("psss");
                user.setText(setname);
                psw.setText(setpsw);

            }


    }
        catch (Exception e){
            Toast.makeText(this, "exepatin", Toast.LENGTH_SHORT).show();

        }
    }

    public void Signup(View view) {
        Toast.makeText(this, "SiginUP()", Toast.LENGTH_SHORT).show();
Intent in = new Intent(MainActivity.this,sinupact.class);
 startActivity(in);
    }


    public void login(View view) {
        Toast.makeText(this, "Login ()", Toast.LENGTH_SHORT).show();
        name =  user.getText().toString();
        pswod= psw.getText().toString();

        boolean emty = name.isEmpty();
        boolean emty2 = pswod.isEmpty();


        if(emty != true && emty2 != true && name.equals(pswod)) {
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
