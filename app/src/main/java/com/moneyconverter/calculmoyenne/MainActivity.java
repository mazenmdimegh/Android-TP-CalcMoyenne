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
        if(note1.isEmpty()||note2.isEmpty()||note3.isEmpty()){
            alert("Veuillez saisier les 3 notes");
        }else{
            openActivityReussi();
        }


    }
    public void openActivityReussi(){
        Intent intent= new Intent(this,FullscreenActivity.class);
        startActivity(intent);
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