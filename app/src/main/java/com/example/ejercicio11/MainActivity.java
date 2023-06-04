package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.ejercicio11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean isActivated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonTurnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isActivated = !isActivated; // Cambiar el estado
                if (isActivated) {
                    Toast.makeText(MainActivity.this, "Desactivado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Activado", Toast.LENGTH_SHORT).show();
                }
            }
        });


        binding.buttonUpdatingProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Updating Profile", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonPictureSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Picture Saved to gallery", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonUnlocked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Unlocked level 5", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonLevel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Level 4 completed", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonMusicPaused.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Music Paused", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


