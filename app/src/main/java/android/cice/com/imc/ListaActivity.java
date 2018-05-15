package android.cice.com.imc;

import android.cice.com.imc.adapters.RangoAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.fila, generarLista());
        ListView lv = findViewById(R.id.lista_rangos);
        //lv.setAdapter(listAdapter);

        RangoAdapter rangoAdapter = new RangoAdapter(this);
        lv.setAdapter(rangoAdapter);
    }

    private String[] generarLista(){
        String[] array = new String [20];
        for (int i = 0 ; i< 20 ;i++){
            array[i] = "Elemento  " + i;
        }
        return array;
    }
}
