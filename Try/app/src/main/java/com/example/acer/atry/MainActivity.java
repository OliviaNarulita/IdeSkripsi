package com.example.acer.atry;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.acer.atry.Fragments.FragmentSatu;

public class MainActivity extends AppCompatActivity {

    Button btnSatu,btnDua;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setelah

        btnSatu = (Button) findViewById(R.id.btnSatu);
        btnDua = (Button) findViewById(R.id.btnDua);

        btnSatu.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                FragmentSatu fd = new FragmentSatu();
                gantiFragment(fd);
            }
        });
    }
    public void gantiFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //setelah punya fragment tranasaksi baru
        ft.add(R.id.frameFragment, fragment);
        ft.commit();
    }
}
