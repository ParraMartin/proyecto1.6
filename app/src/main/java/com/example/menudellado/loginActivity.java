package com.example.menudellado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    EditText usernameEditText;  // Declarar el EditText
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Encuentra los elementos por sus ID
        usernameEditText = findViewById(R.id.usernameEditText);
        loginButton = findViewById(R.id.loginButton);

        Button registroButton = findViewById(R.id.registroButton);

        registroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginActivity.this, registroActivity.class);
                startActivity(intent);
            }
        });

        // Agrega OnClickListener para el botón loginButton
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtiene el texto ingresado en el EditText
                String username = usernameEditText.getText().toString();

                // Crea un Intent para abrir la MainActivity
                Intent intent = new Intent(loginActivity.this, MainActivity.class);

                // Pasa el texto ingresado como un extra al Intent
                intent.putExtra("USERNAME", username);

                // Inicia la actividad MainActivity
                startActivity(intent);
            }
        });
    }
}