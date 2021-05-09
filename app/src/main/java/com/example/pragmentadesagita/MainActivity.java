package com.example.pragmentadesagita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.saputra_fragment.R;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment, threeFragment, fourFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);
        threeFragment = (Button) findViewById(R.id.threeFragment);
        fourFragment = (Button) findViewById(R.id.fourFragment);


// Fungsi Button 1
        firstFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());

            }
        });

// Fungsi Button 2
        secondFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                loadFragment(new SecondFragment());
            }
        });


// Fungsi Button 3
        threeFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                loadFragment(new ThreeFragment());
            }
        });

// Fungsi Button 4
        fourFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                loadFragment(new FourFragment());
            }
        });
    }




    private void loadFragment(Fragment fragment) {

// create a FragmentManager
        FragmentManager fm = getSupportFragmentManager();

// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.begisTransaction();

// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes

    }
}