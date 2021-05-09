package com.example.pragmentadesagita;

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

public class ThreeFragment extends Fragment {

    View view;
    Button threeButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_three, container, false);

        threeButton = (Button) view.findViewById(R.id.threeButton);
        threeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// Memunculkan maps

                Uri gmmIntentUri = Uri.parse("google.navigation:q=-6.3256734,107.1680802");

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

// set google maps
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                Toast.makeText(getActivity(), "Three Fragment", Toast.LENGTH_LONG).show();

            }
        });

        return view;

    }
}