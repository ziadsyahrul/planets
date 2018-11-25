package com.ziadsyahrul.planets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailPlanetsActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_planets);
        ButterKnife.bind(this);

        //TODO Mengubah textView dan imageView dengan data dari halaman sebelumnya
        txtTitle.setText(getIntent().getStringExtra("np"));
        txtDetail.setText(getIntent().getStringExtra("dp"));
        Glide.with(this).load(getIntent().getIntExtra("gp",0)).into(imgLogo);
    }
}

