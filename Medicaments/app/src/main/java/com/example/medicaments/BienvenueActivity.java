package com.example.medicaments;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class BienvenueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenue);
        // Récupérer le nom d'utilisateur de l'intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");

        // Afficher le nom d'utilisateur dans le TextView approprié
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        welcomeTextView.setText("Bienvenue " + username);
        // Récupérer le bouton "Next Page"
        Button nextPageButton = findViewById(R.id.nextPageButton);

        // Ajouter un écouteur d'événements au bouton
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Démarrer Main_list_medActivity
                Intent intent = new Intent(BienvenueActivity.this, Main_list_medActivit.class);
                startActivity(intent);
            }
        });
    }
}