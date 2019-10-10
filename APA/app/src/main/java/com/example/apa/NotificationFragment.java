package com.example.apa;

import android.app.AlertDialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import pl.droidsonroids.gif.GifImageView;

public class NotificationFragment extends Fragment {
    private ListView lvNotificacao;
    private NotificacaoAdapter notificacaoAdapter;

    public NotificationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment_notification for this fragment
        View v = inflater.inflate(R.layout.fragment_notification, container, false);
        lvNotificacao = v.findViewById(R.id.lv_notificacao);

        notificacaoAdapter = new NotificacaoAdapter(getContext());
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Sons altos", 0));
        notificacaoAdapter.add(new Notificacao("Cozinha", "Estilhaçõs de vidro", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Porta batendo", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Sons altos", 0));
        notificacaoAdapter.add(new Notificacao("Cozinha", "Estilhaçõs de vidro", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Porta batendo", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Sons altos", 0));
        notificacaoAdapter.add(new Notificacao("Cozinha", "Estilhaçõs de vidro", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Porta batendo", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Sons altos", 0));
        notificacaoAdapter.add(new Notificacao("Cozinha", "Estilhaçõs de vidro", 0));
        notificacaoAdapter.add(new Notificacao("Sala de estar", "Porta batendo", 0));

        lvNotificacao.setAdapter(notificacaoAdapter);
        lvNotificacao.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);

        lvNotificacao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showDialog();
            }
        });
        return v;
    }

    private void showDialog() {
        AlertDialog alerta;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        final GifImageView gif = new GifImageView(getContext());
        gif.setImageResource(R.drawable.hugo);

        builder.setView(gif);

        alerta = builder.create();
        alerta.show();
    }
}