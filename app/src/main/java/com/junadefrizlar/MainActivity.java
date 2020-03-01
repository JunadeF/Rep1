package com.junadefrizlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.Bdisplay1)
        {
            Intent i = new Intent(MainActivity.this, Display.class);
            startActivity(i);
        }
    }
}
