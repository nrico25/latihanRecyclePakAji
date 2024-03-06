package com.rico.latihanrecyclepakaji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  adapterMakanan.ItemClickListener {
    RecyclerView rvFood;

    List<modelMakanan> listDataMakanan;

    adapterMakanan adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rvMakananFav);
        rvFood = findViewById(R.id.rvMakananFav);

        listDataMakanan = new ArrayList<>();
        listDataMakanan.add(new modelMakanan("Nasi Padang", "Nasi yang dilengkapi dengan rendang", "https://cdn.rri.co.id/berita/1/images/1689391542821-images_(22)/1689391542821-images_(22).jpeg"));
//        listDataMakanan.add(new modelMakanan("Nasi Krawu", "Kuliner khas Gresik yang gurih dan pedas", ""));
//        listDataMakanan.add(new modelMakanan(R.drawable.nasgor, "Nasi Goreng KAI", "Nasi Goreng legendaris restorasi KAI"));
//        listDataMakanan.add(new modelMakanan(R.drawable.naslemak, "Nasi Lemak", "Makanan khas Melayu"));
//        listDataMakanan.add(new modelMakanan(R.drawable.bakar, "Ayam Bakar", "Sepotong Paha ayam yang dibalur kecap dan dibakar diatas arang"));
//        listDataMakanan.add(new modelMakanan(R.drawable.geprek, "Ayam Geprek", "Ayam Tepung yang di Geprek diberi sambal bawang yang pedas"));
//        listDataMakanan.add(new modelMakanan(R.drawable.sate_ayam, "Sate Ayam", "Sate ayam khas Ponorogo yang sangat lezat"));
//        listDataMakanan.add(new modelMakanan(R.drawable.lontong, "Lontong sayur", "Lontong yang disiram sayur lodeh dengan diberi kerupuk"));
//        listDataMakanan.add(new modelMakanan(R.drawable.bakso, "Bakso Malang", "Makanan Khas Malang"));
//        listDataMakanan.add(new modelMakanan(R.drawable.mie_ayam, "Mie Ayam", "Mie rebus khas nusantara"));
//        listDataMakanan.add(new modelMakanan(R.drawable.bothok_mercon, "Bothok Mercon", "Bothok super pedas asli Mbah wiro Sragen"));
//        listDataMakanan.add(new modelMakanan(R.drawable.gudeng, "Gudeng", "Nasi dengan sayur nangka,telur,dan Krecek"));
//        listDataMakanan.add(new modelMakanan(R.drawable.soto_kudus, "Soto Kebo", "Soto bening dengan daging Kerbau khas Kudus"));


        // call adapter class
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        adapter = new adapterMakanan(listDataMakanan, this);
        adapter.setClickListener(this);
        rvFood.setAdapter(adapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getNameFood() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}