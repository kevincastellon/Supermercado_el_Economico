package com.example.supermercado_el_economico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PedidosActivity extends AppCompatActivity {

    Button btncarrito, btnhistorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        btncarrito = (Button) findViewById(R.id.btncarrito);
        btnhistorial = (Button) findViewById(R.id.btnhistorial);

        btncarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CarritoActivity.class);
                startActivity(intent);
            }
        });
        btnhistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HistorialPedidoActivity.class);
                startActivity(intent);
            }
        });

    }
}