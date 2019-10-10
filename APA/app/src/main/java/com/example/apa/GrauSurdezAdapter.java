package com.example.apa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GrauSurdezAdapter extends ArrayAdapter<String> {

    private String[] spLevels;
    private int[] spImages;
    private Context context;

    public GrauSurdezAdapter(Context context, String[] levels, int[] images) {
        super(context, R.layout.custom_spinner_row);
        this.spLevels = levels;
        this.spImages = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return spLevels.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.custom_spinner_row, parent, false);
            mViewHolder.tvImagemGrau = convertView.findViewById(R.id.tv_imagem_grau);
            mViewHolder.tvGrau = convertView.findViewById(R.id.tv_grau);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.tvImagemGrau.setBackgroundResource(spImages[position]);
        mViewHolder.tvGrau.setText(spLevels[position]);

        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    private static class ViewHolder {
        TextView tvImagemGrau;
        TextView tvGrau;
    }
}
