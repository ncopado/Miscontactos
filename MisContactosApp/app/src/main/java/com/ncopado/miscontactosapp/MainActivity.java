package com.ncopado.miscontactosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> lstContacto;
    private RecyclerView listaContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Toolbar miActionBar=(Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        */



        listaContactos=(RecyclerView) findViewById(R.id.rvContactos);


        LinearLayoutManager llm=new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);

      /*  GridLayoutManager glm=new GridLayoutManager(this,2);*/

        listaContactos.setLayoutManager(llm);
        InicilizarListaContactos();
        InicializarAdaptador();




        /* ArrayList<String> nombreContactos=new ArrayList<>();

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
        */
    }

    public  void InicializarAdaptador(){
        ContactoAdaptador adaptador=new ContactoAdaptador(lstContacto,this);
        listaContactos.setAdapter(adaptador);
    }

    public  void  InicilizarListaContactos(){

        lstContacto=new ArrayList<Contacto>();

        lstContacto.add(new Contacto(R.drawable.rayo,"Neme Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Paco Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Kary Copado","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Carolina","2291615266","ncopado@gmail.com"));
        lstContacto.add(new Contacto(R.drawable.rayo,"Samy Copado","2291615266","ncopado@gmail.com"));


    }
}
