package com.chaula.listapkbuahtugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";
    TextView tvnamaBuah;
    ImageView ivgambarbuah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarbuah = getIntent().getIntExtra(Konstanta.DATAGAMBAR,0);

        Log.d(TAG, "Nama: " + namabuah);
        Log.d(TAG, "Gambar: " + gambarbuah);

        tvnamaBuah = findViewById(R.id.detail_nama23);
        ivgambarbuah = findViewById(R.id.detail_gambar23);

        tvnamaBuah.setText(namabuah);
        ivgambarbuah.setImageResource(gambarbuah);
    }
}
