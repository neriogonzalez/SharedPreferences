package com.example.nerio.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditText_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText_Email = findViewById(R.id.editText_email);
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        EditText_Email.setText(preferencias.getString("email",""));
    }

    public void Boton_Guardar (View vista) {
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_Editor = preferencias.edit();
        Obj_Editor.putString("email", EditText_Email.getText().toString());
        Obj_Editor.apply();
        finish();
    }
}
