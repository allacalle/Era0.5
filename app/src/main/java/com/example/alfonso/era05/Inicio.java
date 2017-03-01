package com.example.alfonso.era05;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static android.R.attr.button;


/**
 * Created by Alfonso on 18/03/2016.
 * Ultima modificación: 20/07/2016

 */

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //Prueba boton busqueda.





        //Buscamos nuestros botones de Alto,Medio, Bajo

       // Button btnRecientes = (Button) findViewById(R.id.BtnRecientes) ;
        //ImageButton btnAlta = (ImageButton) findViewById(R.id.BtnAlta);
        //ImageButton btnMedia = (ImageButton) findViewById(R.id.BtnMedia);
        //ImageButton btnBaja = (ImageButton) findViewById(R.id.BtnBaja);
        //Button btnAyuda = (Button) findViewById(R.id.BtnAyuda) ;



        //setTitle("ERA");

        /*

        //Al pulsar uno de estos botones cargara la actividad listado_formulas con el valor de cada boton. (Alto,Medio,Bajo)
        assert btnAlta != null;
        btnAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Inicio.this, FormulasPrioridad.class);

                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("Prioridad", "Alta");

                //Añadimos la información al intent
                intent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        assert btnMedia != null;
        btnMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Inicio.this, FormulasPrioridad.class);

                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("Prioridad", "Media");

                //Añadimos la información al intent
                intent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        assert btnBaja != null;
        btnBaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Inicio.this, FormulasPrioridad.class);

                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("Prioridad", "Baja");

                //Añadimos la información al intent
                intent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        assert btnRecientes != null;
        btnRecientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Inicio.this, FormulasRecientes.class);


                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        assert btnAyuda != null;

        btnAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creamos el Intent
                Intent intent =
                        new Intent(Inicio.this, AyudaGeneral.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

*/


        //Probando el color que se coge.

        ImageView img = (ImageView) findViewById(R.id.semaforo);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP){
                    int x = (int) event.getX();
                    int y = (int) event.getY();
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.semaforocirculo);
                    int color=bitmap.getPixel(x, y);
                    //switch to correct province




                }
                return true;
            }
        });


    }




    @Override
    public void onBackPressed() {

        return;
    }



}

