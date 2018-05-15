package android.cice.com.imc.adapters;

import android.app.Activity;
import android.cice.com.imc.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class RangoAdapter extends BaseAdapter {

    private Context context;
    private String[] rangos = {
            "IMC < 16","IMC <18.5",
            "IMC < 25", "IMC < 30",
            "IMC > 30"
    };

    private String [] definiciones = {
            "Definicion 1", "Def 2", "Def3", "Def4", "Def5"
    };

    public RangoAdapter(Context context){
        this.context = context;
    }

    @Override
    //Elementos a pintar
    public int getCount() {
        return definiciones.length;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view = null;


       if ( convertView == null) {
           Activity activity = (Activity) context; //Context padre de Activity
           LayoutInflater layoutInflater = activity.getLayoutInflater(); //Inflate, transforma xml a objeto
           view = layoutInflater.inflate(R.layout.fila_completa, parent, false);
       } else{
            view = convertView;
       }

       TextView texto1 = (TextView) view.findViewById(R.id.texto1);
       TextView texto2 = (TextView) view.findViewById(R.id.texto2);

       texto1.setText(definiciones[position]);
       texto2.setText(rangos[position]);


       return view;
    }
}
