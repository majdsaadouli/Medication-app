package com.example.medicaments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;


public class Main_list_medActivit extends AppCompatActivity {
    String medicamentslist[] = {"Doliprane  classe : ", "Panadol  classe : ", "Grippex  classe : ", "Algesic  classe : "};
    int medicamentsimages[] = {R.drawable.doliprane, R.drawable.panadol, R.drawable.grippex, R.drawable.algesic};
    String classelist[] = {"antalgique", "antipyrétique", "Anti-grippaux", "Antalgiques"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_med);
        listView = (ListView) findViewById(R.id.customlistview);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), medicamentslist, medicamentsimages, classelist);
        listView.setAdapter(customBaseAdapter);

        // Ajouter un écouteur de clic à la ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Obtenir le médicament sélectionné
                String selectedMedicament = medicamentslist[position];

                // Créer un Intent pour passer à l'activité de description appropriée
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(Main_list_medActivit.this, DolipraneActivity.class);
                        break;
                    case 1:
                        intent = new Intent(Main_list_medActivit.this, PanadolActivity.class);
                        break;
                    case 2:
                        intent = new Intent(Main_list_medActivit.this, GrippexActivity2.class);
                        break;
                    case 3:
                        intent = new Intent(Main_list_medActivit.this, AlgesicActivity.class);
                        break;
                    default:
                        return;

                }

                // Démarrer l'activité de description appropriée
                startActivity(intent);
            }
        });
    }
}


