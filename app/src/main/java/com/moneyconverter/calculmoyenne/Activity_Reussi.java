package com.moneyconverter.calculmoyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity_Reussi extends AppCompatActivity {

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
            Moy.setText("Féliciation vous avez réussi avec une moyenne de "+intent.getStringExtra("Moyenne"));
        }else {Moy.setText("Rien");}


    }
}