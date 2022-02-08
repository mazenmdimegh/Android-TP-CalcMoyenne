package com.moneyconverter.calculmoyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityEchec extends AppCompatActivity {
    private TextView Moy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echec);
        Intent intent =getIntent();
        this.Moy= findViewById(R.id.Dommage);
        if(intent.hasExtra("Moyenne")){
            Moy.setText("Dommage, vous ayez échoué avec une moyenne de  "+intent.getStringExtra("Moyenne"));
        }
    }
}