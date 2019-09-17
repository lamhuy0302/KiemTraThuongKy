package com.example.student.lhh_cau1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Infomation>{
    private Context context;
    private int resource;
    private List<Infomation> arrContact;

    public CustomAdapter(Context context, int resource, ArrayList<Infomation> arrContact) {
        super(context, resource, arrContact);
        this.context = context;
        this.resource = resource;
        this.arrContact = arrContact;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);

            viewHolder.ivAvatar = (ImageView)convertView.findViewById(R.id.ivAvatar);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvBirth = (TextView) convertView.findViewById(R.id.tvBirth);
            viewHolder.ivPic = (ImageView)convertView.findViewById(R.id.ivPic);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Infomation info = arrContact.get(position);
        viewHolder.tvName.setText(String.valueOf(position+1));
        viewHolder.ivAvatar.setImageResource(info.getAva());
        viewHolder.tvName.setText(info.getName());
        viewHolder.tvBirth.setText(info.getBirthYear());
        viewHolder.ivAvatar.setImageResource(info.getPic());
        return convertView;
    }

    public class ViewHolder {
        TextView tvName, tvBirth;
        ImageView ivAvatar, ivPic;
    }
}
