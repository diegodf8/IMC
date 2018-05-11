package android.cice.com.imc.listeners;

import android.app.Activity;
import android.cice.com.imc.ListaActivity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class MostrarListaListener implements View.OnClickListener {

    private Context context;

    public MostrarListaListener(Context context){
        this.context = context;
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ListaActivity.class);
        context.startActivity(intent);
    }
}
