package com.arda.hmbrgr;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.arda.hmbrgr.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ActivityMainBinding binding;
   int tutar=0;
   int secimmalzeme=0;
   int secimicecek=0;
   int secimekmek=0;
   int secimkofte=0;
   String ekmek;
   String icecek;
   String kofte;
   ArrayList<String> malzeme=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        setContentView(view);
        binding.icecek1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimicecek>=1){
                    binding.icecek1.setChecked(false);
                }

                else if (isChecked) {
                    tutar+=10;
                    Toast.makeText(MainActivity.this, "Kola tercihi yaptınız tutarınıza 10 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                    binding.tutar.setText("TUTAR: "+ tutar + " TL.");
                    secimicecek++;
                    binding.icecek1.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.icecek.setTextColor(getResources().getColor(R.color.black));
                    icecek="KOLA";
                }
                if(!isChecked){
                    tutar-=10;
                    secimicecek--;
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    binding.icecek1.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.icecek2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimicecek>=1){
                    binding.icecek2.setChecked(false);
                }
                else if(isChecked){
                    tutar+=10;
                    Toast.makeText(MainActivity.this, "Fanta tercih ettiniz tutarınıza 15 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                    binding.tutar.setText("TUTAR: "+tutar+" TL.");
                    binding.icecek2.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.icecek.setTextColor(getResources().getColor(R.color.black));
                    secimicecek++;
                    icecek="FANTA";
                }
                if(!isChecked){
                    tutar-=10;
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    secimicecek--;
                    binding.icecek2.setTextColor(getResources().getColor(R.color.black));
                }


            }
        });
        binding.icecek3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimicecek>=1){
                    binding.icecek3.setChecked(false);
                }
                else if(isChecked){
                    tutar+=10;
                    Toast.makeText(MainActivity.this, "Sprite tercih ettiniz tutarınıza 20 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                    binding.tutar.setText("TUTAR: "+tutar+" TL.");
                    binding.icecek3.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.icecek.setTextColor(getResources().getColor(R.color.black));
                    secimicecek++;
                    icecek="SPRİTE";
                }
                if(!isChecked){
                    tutar-=10;
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    secimicecek--;
                    binding.icecek3.setTextColor(getResources().getColor(R.color.black));
                }


            }
        });
        binding.ekmek1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimekmek>=1){
                    binding.ekmek1.setChecked(false);
                }
                else if(isChecked){
                    tutar+=10;
                    Toast.makeText(MainActivity.this, "Beyaz ekmek seçtiniz tutarınıza 10 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                    binding.tutar.setText("TUTAR: "+tutar+" TL.");
                    binding.ekmek1.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.ekmek.setTextColor(getResources().getColor(R.color.black));
                    secimekmek++;
                    ekmek="BEYAZ EKMEK";
                }
                if(!isChecked){
                    tutar-=10;
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    secimekmek-=1;
                    binding.ekmek1.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.ekmek2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimekmek>=1){
                    binding.ekmek2.setChecked(false);
                }
                else if(isChecked){
                    tutar+=15;
                    Toast.makeText(MainActivity.this, "Kepekli ekmek tercih ettiniz tutarınıza 15 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                    binding.tutar.setText("TUTAR: "+tutar+" TL.");
                    binding.ekmek2.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.ekmek.setTextColor(getResources().getColor(R.color.black));
                    secimekmek++;
                    ekmek="KEPEKLİ EKMEK";
                }
                if(!isChecked){
                    tutar-=15;
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    secimekmek-=1;
                    binding.ekmek2.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.ekmek3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimekmek>=1){
                    binding.ekmek3.setChecked(false);
                }
                else if(isChecked){
                    tutar+=20;
                Toast.makeText(MainActivity.this, "Çavdarlı ekmek tercih ettiniz tutarınıza 20 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                binding.tutar.setText("TUTAR: "+tutar+" TL.");
                    binding.ekmek3.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.ekmek.setTextColor(getResources().getColor(R.color.black));
                    secimekmek++;
                    ekmek="ÇAVDARLI EKMEK";
                }
                if(!isChecked){
                    tutar-=20;

                    secimekmek-=1;
                    binding.ekmek3.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.tavuk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimkofte>=1){
                    binding.tavuk.setChecked(false);
                }
                else if (isChecked && secimkofte<1) {
                    tutar+=30;
                Toast.makeText(MainActivity.this, "Tavuk köfte tercih ettiniz tutarınıza 30 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                binding.tutar.setText("TUTAR: "+tutar+" TL.");
                    binding.tavuk.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.kFte.setTextColor(getResources().getColor(R.color.black));
                    secimkofte+=1;
                    kofte="TAVUK KÖFTE";
                }
                if(!isChecked){
                    tutar-=30;
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    secimkofte-=1;
                    binding.tavuk.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.et.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimkofte>=1){
                    binding.et.setChecked(false);
                }
                else if (isChecked && secimkofte<1) {
                    tutar+=45;
                    Toast.makeText(MainActivity.this, "Et köfte tercih ettiniz tutarınıza 45 TL eklenmiştir !", Toast.LENGTH_SHORT).show();
                    binding.tutar.setText("TUTAR: " + tutar + " TL.");
                    binding.et.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.kFte.setTextColor(getResources().getColor(R.color.black));
                    secimkofte+=1;
                    kofte="ET KÖFTE";
                }
                if(!isChecked){
                    tutar-=45;
                    secimkofte-=1;
                    binding.et.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.mantar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimmalzeme>=3){
                    binding.mantar.setChecked(false);
                }
                else if(isChecked && secimmalzeme<3){
                    malzeme.add("MANTAR");
                    Toast.makeText(MainActivity.this, "Mantar tercih ettiniz !", Toast.LENGTH_SHORT).show();
                    binding.mantar.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.malzeme.setTextColor(getResources().getColor(R.color.black));
                    secimmalzeme+=1;
                }
                if(!isChecked){
                    malzeme.remove("MANTAR");
                    secimmalzeme-=1;
                    binding.mantar.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.turU.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimmalzeme>=3){
                    binding.turU.setChecked(false);
                }
                else if(isChecked && secimmalzeme<3){
                    malzeme.add("TURŞU");
                    Toast.makeText(MainActivity.this, "Turşu tercih ettiniz !", Toast.LENGTH_SHORT).show();
                    binding.turU.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.malzeme.setTextColor(getResources().getColor(R.color.black));
                    secimmalzeme+=1;
                }
                if(!isChecked){
                    malzeme.remove("TURŞU");
                    secimmalzeme-=1;
                    binding.turU.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.domates.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimmalzeme>=3){
                    binding.domates.setChecked(false);
                }
                else if(isChecked && secimmalzeme<3){
                    malzeme.add("DOMATES");
                    Toast.makeText(MainActivity.this, "Domates tercih ettiniz !", Toast.LENGTH_SHORT).show();
                    binding.domates.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.malzeme.setTextColor(getResources().getColor(R.color.black));
                    secimmalzeme+=1;
                }

                if(!isChecked){
                    malzeme.remove("DOMATES");
                    secimmalzeme-=1;
                    binding.domates.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.marul.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimmalzeme>=3){
                    binding.marul.setChecked(false);
                }
                else if(isChecked && secimmalzeme<3){
                    malzeme.add("MARUL");
                    Toast.makeText(MainActivity.this, "Marul tercih ettiniz !", Toast.LENGTH_SHORT).show();
                    binding.marul.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.malzeme.setTextColor(getResources().getColor(R.color.black));
                    secimmalzeme+=1;
                }
                if(!isChecked){
                    malzeme.remove("MARUL");
                    secimmalzeme-=1;
                    binding.marul.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.sogan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(secimmalzeme>=3){
                    binding.sogan.setChecked(false);
                }
                else if(isChecked && secimmalzeme<3){
                    malzeme.add("SOĞAN");
                    Toast.makeText(MainActivity.this, "Soğan tercih ettiniz !", Toast.LENGTH_SHORT).show();
                    binding.sogan.setTextColor(getResources().getColor(R.color.kırmızı));
                    binding.malzeme.setTextColor(getResources().getColor(R.color.black));
                    secimmalzeme+=1;

                }
                if(!isChecked){
                    malzeme.remove("SOĞAN");
                    secimmalzeme-=1;
                    binding.sogan.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        binding.kydtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(secimicecek==0){
                    Toast.makeText(MainActivity.this, "Lütfen bir içecek seçiniz !", Toast.LENGTH_SHORT).show();
                    binding.icecek.setTextColor(getResources().getColor(R.color.kırmızı));
                }
                if(secimekmek==0){
                    Toast.makeText(MainActivity.this, "Lütfen bir ekmek seçiniz !", Toast.LENGTH_SHORT).show();
                    binding.ekmek.setTextColor(getResources().getColor(R.color.kırmızı));
                }
                if(secimmalzeme==0){
                    Toast.makeText(MainActivity.this, "Lütfen bir malzeme seçiniz !", Toast.LENGTH_SHORT).show();
                    binding.malzeme.setTextColor(getResources().getColor(R.color.kırmızı));
                }
                if (secimkofte==0){
                    Toast.makeText(MainActivity.this, "Lütfen bir köfte seçiniz !", Toast.LENGTH_SHORT).show();
                    binding.kFte.setTextColor(getResources().getColor(R.color.kırmızı));
                }
                if(secimkofte!=0 && secimmalzeme!=0 && secimekmek!=0 && secimicecek!=0) {
                    binding.kydtbtn.setClickable(true);
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("Tutar", tutar);
                    intent.putExtra("Icecek", icecek);
                    intent.putExtra("Ekmek", ekmek);
                    intent.putExtra("Köfte", kofte);
                    intent.putExtra("Malzeme", malzeme);
                    startActivity(intent);
                }

            }
        });

    }
}