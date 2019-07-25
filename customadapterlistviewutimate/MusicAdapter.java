package com.example.customadapterlistviewutimate;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MusicAdapter extends BaseAdapter {

    private Context context;
    private List<Music> musicList;

    public MusicAdapter(Context context, List<Music> musicList) {
        this.context = context;
        this.musicList = musicList;
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int i) {
        return musicList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.custom_item_listview_music,viewGroup,false);

            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) view.findViewById(R.id.tvNameMusic);
            viewHolder.tvTime = (TextView) view.findViewById(R.id.tvTimeMusic);

            view.setTag(viewHolder);
        }else{
            Log.d("viewHolder","viewHolder "+i);
            viewHolder = (ViewHolder) view.getTag();
        }

        Music music = (Music) getItem(i);
        viewHolder.tvName.setText(music.getName());
        viewHolder.tvTime.setText(music.getTime());
        return view;
    }

    private class ViewHolder{
        private TextView tvName,tvTime;

    }
}
