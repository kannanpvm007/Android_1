package com.example.login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class Login extends AppCompatActivity {
 TextView lodata;
 ImageView im;
 View view= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lodata = findViewById(R.id.loginwel);
        im= findViewById(R.id.phto);
        Bundle b= getIntent().getExtras();
        String set =b.getString("log");
        String psw = b.getString("psw");
        try {
            if(set != null){
                lodata.setText("welcome mr."+set+"\n"+psw);
               // lodata.setText();
            }
        }catch (Exception e){
            Toast.makeText(this, "not page Exception", Toast.LENGTH_SHORT).show();
        }
    }


    public void selfy(View view) {
        this.view=view;
        Intent  i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivityForResult(i,5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 5 && resultCode == RESULT_OK){
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,baos);
            byte[] bya =  baos.toByteArray();

            Final(lodata,bya,view);

        }

    }

    private void Final(TextView lodata, byte[] bya,View view) {

        Bitmap bitmap = BitmapFactory.decodeByteArray(bya,0,bya.length);
        im.setImageBitmap(bitmap);



        LayoutInflater layoutInflater = LayoutInflater.from(getApplicationContext());
      view = layoutInflater.inflate(R.layout.activity_selfy,null);
        Toast toast = new Toast(getApplicationContext());
        toast.setView(view);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();






    }
}
