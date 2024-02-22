package com.example.supermercado_el_economico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    // Variables para los componentes de Material Design
    private TextInputEditText txtcorreoEn;
    private TextInputEditText txtpasswordEntrada;
    private MaterialButton btnentrar,btnCrear,btnestablecer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcorreoEn = findViewById(R.id.txtcorreoEn);
        txtpasswordEntrada = findViewById(R.id.txtpasswordEn);
        btnentrar = findViewById(R.id.btnentrar);
        btnCrear = findViewById(R.id.btnCrear);
        btnestablecer = findViewById(R.id.btnrestablecer);

        btnestablecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Restablecer_contra.class);
                startActivity(intent);
            }
        });
    }

}