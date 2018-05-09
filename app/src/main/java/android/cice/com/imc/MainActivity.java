package android.cice.com.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText altura = findViewById(R.id.altura);
        EditText peso = findViewById(R.id.peso);
        Button calcula = findViewById(R.id.calcula);
        TextView resultado = findViewById(R.id.resultado);
        

    }
}
