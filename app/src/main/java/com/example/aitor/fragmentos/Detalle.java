package com.example.aitor.fragmentos;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Detalle extends AppCompatActivity {

    public static final String EXTRA_TEXTO =
            "net.sgoliver.android.fragments.EXTRA_TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

     //   FragmentDetalle detalle = (FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);

       // detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
    }
}
