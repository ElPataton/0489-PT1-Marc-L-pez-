package com.example.pt1marc_lpez;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    Button btn17;


    TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn1 = findViewById(R.id.button8);
        btn2 = findViewById(R.id.button9);
        btn3 = findViewById(R.id.button10);
        btn4 = findViewById(R.id.button5);
        btn5 = findViewById(R.id.button6);
        btn6 = findViewById(R.id.button7);
        btn7 = findViewById(R.id.button);
        btn8 = findViewById(R.id.button2);
        btn9 = findViewById(R.id.button3);
        btn10 = findViewById(R.id.button11);
        btn11 = findViewById(R.id.button17); // -
        btn12 = findViewById(R.id.button13); // +
        btn13 = findViewById(R.id.button15); // *
        btn14 = findViewById(R.id.button16); // /
        btn15 = findViewById(R.id.button14); // =
        btn16 = findViewById(R.id.button12); // .
        btn17 = findViewById(R.id.buttonC); //Earse
        resultat = findViewById(R.id.textView);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);



    }
    @Override
    public void onClick (View v){
        String currentText = resultat.getText().toString();
        if (v instanceof Button){
            Button b = (Button) v;
            String textBoton = b.getText().toString();
            if (textBoton.equals("=")){

            }
            else if (textBoton.equals("C")){
                resultat.setText(" ");
            }
            else {
                resultat.append(textBoton);
            }
        }


    }
}