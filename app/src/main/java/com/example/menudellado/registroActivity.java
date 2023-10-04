package com.example.menudellado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registroActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button volverlogin = findViewById(R.id.registroButton);


        volverlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acción a realizar cuando se hace clic en el botón
                Intent intent = new Intent(registroActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
    }
}