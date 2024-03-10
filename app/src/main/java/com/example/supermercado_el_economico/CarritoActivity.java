package com.example.supermercado_el_economico;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CarritoActivity extends AppCompatActivity {

    BottomNavigationView btninferior;
    RecyclerView miadapter;
    SearchView misearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

    }
}