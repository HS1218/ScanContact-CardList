package com.example.scancontact;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class ListAdapter extends BaseAdapter {

    Context context;
    String[]name;
    String[]tel;
    String[]email;
    String[]add;
    int[] head;
    int[] company;
    public ListAdapter(Context context, String[] name, String[] tel, String[] email, String[] add, int[] head, int[] company) {
        this.context = context;
        this.name=name;
        this.tel=tel;
        this.email=email;
        this.add=add;
        this.head=head;
        this.company=company;
    }


    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull
            ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.card_list_items, parent, false);
            viewHolder.txtName = (TextView)
                    convertView.findViewById(R.id.name);
            viewHolder.txtTel = (TextView)
                    convertView.findViewById(R.id.tel);
            viewHolder.txtEmail = (TextView)
                    convertView.findViewById(R.id.email);
            viewHolder.txtAdd = (TextView)
                    convertView.findViewById(R.id.add);
            viewHolder.head = (ImageView) convertView.findViewById(R.id.head);
            viewHolder.company = (ImageView) convertView.findViewById(R.id.company);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.txtName.setText(name[position]);
        viewHolder.txtTel.setText(tel[position]);
        viewHolder.txtEmail.setText(email[position]);
        viewHolder.txtAdd.setText(add[position]);
        viewHolder.head.setImageResource(head[position]);
        viewHolder.company.setImageResource(company[position]);

        return convertView;
    }
    private static class ViewHolder {
        TextView txtName;
        TextView txtTel;
        TextView txtEmail;
        TextView txtAdd;
        ImageView head;
        ImageView company;
    }
}