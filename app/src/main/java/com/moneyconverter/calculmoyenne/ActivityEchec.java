package com.moneyconverter.calculmoyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityEchec extends AppCompatActivity {
    private String msg;
    private TextView Moy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echec);
        Intent intent =getIntent();
        this.Moy= findViewById(R.id.Dommage);
        if(intent.hasExtra("Moyenne")){
            msg= "Dommage, vous ayez échoué avec une moyenne de  "+intent.getStringExtra("Moyenne");
            Moy.setText("Dommage, vous ayez échoué avec une moyenne de  "+intent.getStringExtra("Moyenne"));
        }
    }
    public void backHome(View v){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void SendSms(View v){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SENDTO);
        Uri uri = Uri.parse("smsto:54310454");
        i.setData(uri);
        i.putExtra("sms_body",this.msg);
        startActivity(i);
    }


}