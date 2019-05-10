package com.example.a16866099_5.listview_fa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> nombres;

    public MyAdapter(Context context, int layout, List<String> nombres){
        this.context = context;
        this.layout = layout;
        this.nombres = nombres;
    }
    @Override
    public int getCount(){
        return this.nombres.size();
    }
    @Override
    public Object getItem(int position){
        return this.nombres.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //Copiamos la vista
        View v = convertView;

        //Inflamos la vista que nos ha llegado a nuestro layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.list_item, null);

        //Nos traemos el valor actual dependiente de la posición
        String nombreActual = nombres.get(position);

        //Referencias el elemento a modificar y lo rellenamos
        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(nombreActual);

        return v;
    }
}
