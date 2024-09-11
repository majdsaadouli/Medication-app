package com.example.medicaments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Inscription(View view){
        startActivities(new Intent[]{new Intent(MainActivity.this, InscriptionActivity.class)});
    }

    public void login(View view){
        // Récupérer le TextInputLayout contenant le TextInputEditText
        TextInputLayout textInputLayout = findViewById(R.id.usernameEditText);

        // Récupérer le EditText à partir du TextInputLayout
        EditText editText = textInputLayout.getEditText();

        if (editText != null) {
            // Convertir l'EditText en TextInputEditText
            TextInputEditText usernameEditText = (TextInputEditText) editText;

            // Récupérer le nom d'utilisateur saisi
            String username = usernameEditText.getText().toString();

            // Passer à l'activité BienvenueActivity en incluant le nom d'utilisateur dans l'intent
            Intent intent = new Intent(MainActivity.this, BienvenueActivity.class);
            intent.putExtra("USERNAME", username);
            startActivity(intent);
        }
    }
}
