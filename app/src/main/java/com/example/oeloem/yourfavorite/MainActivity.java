package com.example.oeloem.yourfavorite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rg;
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radiogroup);
        rbtn1 = (RadioButton) findViewById(R.id.rb1);
        rbtn2 = (RadioButton) findViewById(R.id.rb2);
        rbtn3 = (RadioButton) findViewById(R.id.rb3);
        rbtn4 = (RadioButton) findViewById(R.id.rb4);
        rbtn5 = (RadioButton) findViewById(R.id.rb5);
        rbtn6 = (RadioButton) findViewById(R.id.rb6);
        btn = (Button) findViewById(R.id.btn);

    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rb1) {
            Toast.makeText(this, "Olahraga Favorite Anda Sepak Bola", Toast.LENGTH_SHORT).show();

        }

        if (checkedId == R.id.rb2) {
            Toast.makeText(this, "Olahraga Favorite Anda Futsal", Toast.LENGTH_SHORT).show();

        }

        if (checkedId == R.id.rb3) {
            Toast.makeText(this, "Olahraga Favorite Anda Renang", Toast.LENGTH_SHORT).show();

        }

        if (checkedId == R.id.rb4) {
            Toast.makeText(this, "Olahraga Favorite Anda Basket", Toast.LENGTH_SHORT).show();

        }

        if (checkedId == R.id.rb5) {
            Toast.makeText(this, "Olahraga Favorite Anda Voli", Toast.LENGTH_SHORT).show();

        }

        if (checkedId == R.id.rb6) {
            Toast.makeText(this, "Olahraga Favorite Anda Panahan", Toast.LENGTH_SHORT).show();
        }
    }

    public void keluar(View view) {
        finish();
    }
}
