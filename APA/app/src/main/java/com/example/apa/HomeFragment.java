package com.example.apa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private String[] spLevels = {"Leve", "Médio", "Alto"};
    private int[] spImages = {R.drawable.signal_low, R.drawable.signal_medium, R.drawable.signal_high};
    private GrauSurdezAdapter grauSurdezAdapter;
    private Spinner spGrau;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment_notification for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        this.grauSurdezAdapter = new GrauSurdezAdapter(getContext(), spLevels, spImages);
        this.spGrau = v.findViewById(R.id.sp_grau);
        this.spGrau.setAdapter(grauSurdezAdapter);

        return v;
    }
}