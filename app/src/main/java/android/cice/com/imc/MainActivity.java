package android.cice.com.imc;

import android.cice.com.imc.listeners.MostrarListaListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final EditText altura = findViewById(R.id.altura);
        final EditText peso = findViewById(R.id.peso);
        Button calcula = findViewById(R.id.calcula);
        Button mostrarLista = findViewById(R.id.mostrar_lista);
        final TextView resultado = findViewById(R.id.resultado);

        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alturaDada = altura.getText().toString();
                String pesoDado = peso.getText().toString();
                if (!alturaDada.isEmpty() && !pesoDado.isEmpty()){
                    try {
                        double pesoNum = Double.parseDouble(alturaDada);
                        double alturaNum = Double.parseDouble(pesoDado);
                        double resultadoIMC = pesoNum/(alturaNum*alturaNum);
                        resultado.setText(String .valueOf(resultadoIMC));
                    } catch (Throwable  e){
                        Toast.makeText(MainActivity.this,"Error al introducir numeros",Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this,"Algun campo esta vacio",Toast.LENGTH_LONG).show();
                }
            }
        });

        MostrarListaListener mostrarListaListener = new MostrarListaListener(this);
        mostrarLista.setOnClickListener(mostrarListaListener);
    }
}
