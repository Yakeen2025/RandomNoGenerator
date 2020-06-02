package com.example.randomnogenerator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txt);
        button = findViewById(R.id.btn1);
        view = findViewById(R.id.li);
        final Random random = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(String.valueOf(random.nextInt(1000000)));
                Toast.makeText(getApplicationContext(), "random number generated", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.b1:
                view.setBackgroundResource(R.drawable.back1);
                return true;
            case R.id.b2:
                view.setBackgroundResource(R.drawable.cal);
                return true;
            case R.id.b3:
                view.setBackgroundResource(R.drawable.call);
                return true;
            case R.id.b4:
                view.setBackgroundResource(R.drawable.back2);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
