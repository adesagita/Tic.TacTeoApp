package com.example.pragmentadesagita;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.time.Instant;



public class SecondFragment extends Fragment {

    View view;
    Button secondButton;
    public  String ACTION_CHECK = "com.example.instentcallerti18d1.ACTION_CHECK";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second, container, false);
        secondButton = (Button) view.findViewById(R.id.secondButton);
        secondButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// display a message by using a Toast

                String url = "http://sagita.store";
                Intent gue = new Intent(Intent.ACTION_VIEW);
                gue.setData(Uri.parse(url));
                startActivity(gue);

                Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();

            }
        });

        return view;

    }
}