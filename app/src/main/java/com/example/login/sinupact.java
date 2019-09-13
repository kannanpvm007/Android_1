package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sinupact extends AppCompatActivity {
    EditText name, fathername, username, username2, pawd;

    //String un, fn, us2, us1, psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinupact);
        name = findViewById(R.id.name);
        fathername = findViewById(R.id.fname);
        username = findViewById(R.id.username);
        username2 = findViewById(R.id.username2);
        pawd = findViewById(R.id.pasword1);
        Toast.makeText(this, "enter onCreate() on sinupact", Toast.LENGTH_SHORT).show();


    }


    public void hi(View view) {
      String  un = name.getText().toString();
        String fn = fathername.getText().toString();
        String us1 = username.getText().toString();
        String us2 = username2.getText().toString();
        String  psw= pawd.getText().toString();
        Toast.makeText(this, "enter hi()", Toast.LENGTH_SHORT).show();


        if (us1.equals(us2)) {
            Toast.makeText(this, "welcome mr." + us1 + " " + fn, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "woring entry" + us1 + " AND " + us2 + " ARE mismathch ", Toast.LENGTH_LONG).show();
        }
    }
}
