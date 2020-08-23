package com.example.fm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private ArrayList<itemList> arrayList;
    private Context context;
    public ListViewAdapter(Context context, ArrayList<itemList> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
        layoutInflater=LayoutInflater.from(context);
    }

    public ListViewAdapter(listViewActivity listViewActivity) {
    }

    public ListViewAdapter(LayoutInflater layoutInflater, ArrayList<itemList> arrayList, Context context) {
        this.layoutInflater = layoutInflater;
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override

    // tra ve so luong co trong danh sach
    public int getCount() {
        return arrayList.size();
    }

    @Override

    // tra ve phan tu theo 1 vi tri
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override

    // tra ve id cua doi tuong
    public long getItemId(int position) {
        return position;
    }

    @Override

    //khoi tao view hien thi cho tung view va bo du lieu item
    public View getView(int position, View convertView, ViewGroup parent) {
        itemList iTemList = arrayList.get(position);
        if (convertView==null){
            convertView=layoutInflater.inflate(R.layout.item, parent,false);
            ImageView img= convertView.findViewById(R.id.img_truyen);
            TextView tv1=convertView.findViewById(R.id.txtTenTruyen);
            TextView tv2=convertView.findViewById(R.id.txtTenTacGia);

            img.setImageResource(iTemList.getIdImg());
            tv1.setText(iTemList.getTitle());
            tv2.setText(iTemList.getContent());
        }
        return convertView;
    }
}
