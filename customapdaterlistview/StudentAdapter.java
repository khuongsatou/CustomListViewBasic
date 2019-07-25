package com.example.customapdaterlistview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends BaseAdapter {

    List<Student> students;
    Context context;

    public StudentAdapter(Context context,List<Student> students) {
        this.context = context;
        this.students = students;

    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    LinearLayout linearLayout;
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.custom_item_listview_student,viewGroup,false);

        TextView tvId = (TextView) view.findViewById(R.id.tvId);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvNumberPhone = (TextView) view.findViewById(R.id.tvNumberPhone);

        tvId.setText(students.get(i).getId());
        tvName.setText(students.get(i).getName());
        tvNumberPhone.setText(students.get(i).getNumberPhone());

        linearLayout = (LinearLayout) view.findViewById(R.id.linItem);
        if (i % 2 == 0){
            linearLayout.setBackgroundColor(Color.parseColor("#A38B8585"));
            tvId.setTextColor(Color.parseColor("#FAF7F7"));
            tvName.setTextColor(Color.parseColor("#FAF7F7"));
            tvNumberPhone.setTextColor(Color.parseColor("#FAF7F7"));

        }
        return view;
    }
}
