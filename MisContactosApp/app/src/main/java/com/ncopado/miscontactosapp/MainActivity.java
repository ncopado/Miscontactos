package com.ncopado.miscontactosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> lstContacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstContacto=new ArrayList<Contacto>();

        lstContacto.add(new Contacto("Neme Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto("Paco Copado","2291615266"));
        lstContacto.add(new Contacto("Kary Copado","2291615266"));
        lstContacto.add(new Contacto("Carolina","2291615266"));
        lstContacto.add(new Contacto("Samy Copado","2291615266"));


        ArrayList<String> nombreContactos=new ArrayList<>();

        for (Contacto contacto:lstContacto) {

            nombreContactos.add(contacto.getNombre());
        }

        //Buscas el listview
        ListView  lst=(ListView)  findViewById(R.id.lstContactos);

        lst.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombreContactos));

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre),lstContacto.get(i).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono),lstContacto.get(i).getTelefono());
                intent.putExtra(getResources().getString(R.string.pcorreo),lstContacto.get(i).getEmail());
                startActivity(intent);

            }
        });

    }
}
