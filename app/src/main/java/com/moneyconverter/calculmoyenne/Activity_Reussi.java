package com.moneyconverter.calculmoyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity_Reussi extends AppCompatActivity {
    private String msg ;
    private TextView Moy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow ().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_reussi);
        Intent intent =getIntent();
        this.Moy= findViewById(R.id.Felicitation);
        if(intent.hasExtra("Moyenne")){
            msg = "Féliciation vous avez réussi avec une moyenne de "+intent.getStringExtra("Moyenne");
            Moy.setText("Féliciation vous avez réussi avec une moyenne de "+intent.getStringExtra("Moyenne"));
        }else {Moy.setText("Rien");}


    }
    public void backHome(View v){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void SmsApp(View v){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SENDTO);
        Uri uri = Uri.parse("sms to :54310454");
        i.setData(uri);
        i.putExtra("sms_body",msg);
                startActivity(i);
    }
}