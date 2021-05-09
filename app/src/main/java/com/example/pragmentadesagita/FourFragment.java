package com.example.pragmentadesagita;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FourFragment extends Fragment {

    View view;
    Button fourButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_four, container, false);
        fourButton = (Button) view.findViewById(R.id.fourButton);
        fourButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// Menampilkan Email
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"adesagita26@gmail.com"});
                intent.putExtra(Intent.EXTRA_CC, new String[] {"adesagita26@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "TeranG");
                intent.putExtra(Intent.EXTRA_TEXT, "Rindu..");

                try {
                    startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
                } catch (android.content.ActivityNotFoundException ex) {
                    //do something else
                }


                Toast.makeText(getActivity(), "Four Fragment", Toast.LENGTH_LONG).show();

            }
        });

        return view;

    }
}