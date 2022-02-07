package com.moneyconverter.calculmoyenne;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText E1;
    private EditText E2;
    private EditText E3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.E1=findViewById(R.id.one);
        this.E2=findViewById(R.id.two);
        this.E3=findViewById(R.id.three);

        getSupportActionBar().setTitle("MoyenneApp");
    }
    public void Calculer(View v){
        String note1 = E1.getText().toString();
        String note2 = E2.getText().toString();
        String note3 = E3.getText().toString();
        float n1 = Float.parseFloat(note1) ;
        float n2 = Float.parseFloat(note2) ;
        float n3 = Float.parseFloat(note3) ;
        float Moyenne= n1+n2+n3/3;
        if(note1.isEmpty()||note2.isEmpty()||note3.isEmpty()){
            alert("Veuillez saisier les 3 notes");
        }else if (n1>20||n2>20||n3>20||n1<0||n2<0||n3<0){
            alert("les 3 notes doivent étre comprise entre 0 et 20");
        }else if (Moyenne>10){
            Intent intent= new Intent(this,FullscreenActivity.class);
            intent.putExtra("Moyenne",Moyenne);
            startActivity(intent);
            openActivityReussi();
        }


    }
    public void openActivityReussi(){

    }
    private void alert (String message){
        AlertDialog dlg =new AlertDialog.Builder(MainActivity.this)
                .setTitle("Veuillez saisier les 3 notes")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        dlg.show();
    }


}