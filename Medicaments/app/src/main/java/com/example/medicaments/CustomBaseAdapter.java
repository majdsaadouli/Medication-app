package com.example.medicaments;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter{

    Context context;
    String medicamentslist[];
    int medicamentsimages[];
    LayoutInflater inflater;
    String classelist[];

    public CustomBaseAdapter(Context ctx ,String[] medicamentlist,int[] images , String classelist[]){
         this.context=ctx;
         this.medicamentslist=medicamentlist;
         this.medicamentsimages=images;
         this.classelist=classelist;
         inflater=LayoutInflater.from(ctx);
     }
    @Override
    public int getCount() {
        return medicamentslist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         convertView=inflater.inflate(R.layout.activity_customlistview,null);
        TextView txtView=(TextView) convertView.findViewById(R.id.textview);
        ImageView medcimg=(ImageView) convertView.findViewById(R.id.imageicon);
        TextView classe = (TextView) convertView.findViewById(R.id.classview); // New TextView for displaying class

        txtView.setText(medicamentslist[position]);
        medcimg.setImageResource(medicamentsimages[position]);
        classe.setText( classelist[position]);

        return convertView;
    }
}
