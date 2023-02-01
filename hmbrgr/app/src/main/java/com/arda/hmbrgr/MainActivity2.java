package com.arda.hmbrgr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.arda.hmbrgr.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
  ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Integer tutar1 = getIntent().getExtras().getInt("Tutar");
        String icecek1 = getIntent().getExtras().getString("Icecek");
        String ekmek1 = getIntent().getExtras().getString("Ekmek");
        String kofte1 = getIntent().getExtras().getString("Köfte");
        ArrayList<String> malzeme1=getIntent().getExtras().getStringArrayList("Malzeme");

        binding.tutar.setText("TUTAR : " + tutar1+" TL.");
        binding.secim1.setText("İÇECEK TERCİHİNİZ : " + icecek1);
        binding.secim2.setText("EKMEK TERCİHİNİZ : "+ekmek1);
        binding.secim3.setText("KÖFTE TERCİHİNİZ : "+kofte1);
        binding.secim4.setText("MALZEME TERCİHİNİZ : "+malzeme1);
    }
}