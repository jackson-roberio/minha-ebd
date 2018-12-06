package br.com.jacksonroberio.minhaebd.recurso;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ATrimestre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_trimestre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] trimestres = {"2ª Trimestre - 2018", "3ª Trimestre - 2018", "1ª Trimestre - 2018"};
        ListView lista = (ListView) findViewById((R.id.trimestre_lista));
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, trimestres);
        lista.setAdapter(adapter);
//        lista.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent mudarPagina = new Intent(ATrimestre.this, ALicao.class);
//                startActivity(mudarPagina);
//            }
//        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.trimestre_inserir);
        fab.setOnClickListener(eSalvarTrimetre());



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_atrimestre, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            MenuItem a = (MenuItem) findViewById(R.id.action_settings);
            a.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent mudarPagina = new Intent(ATrimestre.this, ALicao.class);
                    startActivity(mudarPagina);
                    return false;
                }
            });
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*EVENTOS*/
    private View.OnClickListener eSalvarTrimetre(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        };
    }

}
