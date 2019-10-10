package com.example.apa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoAdapter extends ArrayAdapter<Notificacao> {

    private TextView tvTitulo;
    private TextView tvSubtitulo;
    private TextView tvSegundos;
    private TextView tvImagem1;
    private TextView tvImagem2;

    private List<Notificacao> notificacoes = new ArrayList<>();

    @Override
    public void add(Notificacao object) {
        notificacoes.add(object);
        super.add(object);
    }

    public NotificacaoAdapter(Context context) {
        super(context, R.layout.custom_list_view_row);
    }

    public int getCount() {
        return this.notificacoes.size();
    }

    public Notificacao getItem(int index) {
        return this.notificacoes.get(index);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Notificacao notificacao = getItem(position);
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_list_view_row, parent, false);

        this.inicializarComponentes(row);

        tvTitulo.setText(notificacao.getTitulo());
        tvSubtitulo.setText(notificacao.getSubtitulo());
        tvSegundos.setText(String.valueOf(notificacao.getSegundos()));
        if(notificacao.getTitulo().toLowerCase().contains("cozinha")){
            tvImagem1.setBackgroundResource(R.drawable.stove);
        }else if(notificacao.getTitulo().toLowerCase().contains("sala de estar")){
            tvImagem1.setBackgroundResource(R.drawable.sofa);
        }

        if(notificacao.getSubtitulo().toLowerCase().contains("vidro")){
            tvImagem2.setBackgroundResource(R.drawable.fragile);
        }else if(notificacao.getSubtitulo().toLowerCase().contains("porta")){
            tvImagem2.setBackgroundResource(R.drawable.flashlight_black);
        }else{
            tvImagem2.setBackgroundResource(R.drawable.question_mark);
        }

        return row;
    }

    private void inicializarComponentes(View row){
        tvTitulo = row.findViewById(R.id.tv_titulo);
        tvSubtitulo = row.findViewById(R.id.tv_subtitulo);
        tvSegundos = row.findViewById(R.id.tv_segundos);
        tvImagem1 = row.findViewById(R.id.tv_imagem_1);
        tvImagem2 = row.findViewById(R.id.tv_imagem_2);
    }


    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }
}