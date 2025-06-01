package com.example.ticktackapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnrest;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
int flag=0;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newgame();
            }
        });
    }
    private void init()
    {
        btn1=findViewById(R.id.bt1);
        btn2=findViewById(R.id.bt2);
        btn3=findViewById(R.id.bt3);
        btn4=findViewById(R.id.bt4);
        btn5=findViewById(R.id.bt5);
        btn6=findViewById(R.id.bt6);
        btn7=findViewById(R.id.bt7);
        btn8=findViewById(R.id.bt8);
        btn9=findViewById(R.id.bt9);
        btnrest = findViewById(R.id.reset);
    }
    public void Check(View view){
        Button btnCurrent = (Button) view;  //Getting current button reference
        if (btnCurrent.getText().toString().equals("")) {
            count++;
            // value that enter by user
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }
            // check condition
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                // Horizontal
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                   newgame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                   newgame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                   newgame();
                }

// Vertical
                else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                   newgame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                   newgame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                   newgame();
                }

// Diagonals
                else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                   newgame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                   newgame();
                }

// Draw condition (only if no one has won)
                else if (!b1.equals("") && !b2.equals("") && !b3.equals("") &&
                        !b4.equals("") && !b5.equals("") && !b6.equals("") &&
                        !b7.equals("") && !b8.equals("") && !b9.equals("")) {
                    Toast.makeText(this, "Game is Drawn", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

public void newgame(){
 new Handler().postDelayed(new Runnable() {
     @Override
     public void run() {
         btn1.setText("");
         btn2.setText("");
         btn3.setText("");
         btn4.setText("");
         btn5.setText("");
         btn6.setText("");
         btn7.setText("");
         btn8.setText("");
         btn9.setText("");
         count=0;
         flag=0;

     }
 },2000);

}}