package com.example.tic_tak_toe2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ai extends AppCompatActivity {
    private Button b_01;
    private Button b_02;
    private Button b_03;
    private Button b_04;
    private Button b_05;
    private Button b_06;
    private Button b_07;
    private Button b_08;
    private Button b_09;
    private TextView player;
    private TextView computer;
    int com=0,pl=0;
    String x="X",o="O";
    int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b_01=(Button)findViewById(R.id.button_01);
        b_02=(Button)findViewById(R.id.button_02);
        b_03=(Button)findViewById(R.id.button_03);
        b_04=(Button)findViewById(R.id.button_04);
        b_05=(Button)findViewById(R.id.button_05);
        b_06=(Button)findViewById(R.id.button_06);
        b_07=(Button)findViewById(R.id.button_07);
        b_08=(Button)findViewById(R.id.button_08);
        b_09=(Button)findViewById(R.id.button_09);
        player=(TextView)findViewById(R.id.p1);
        computer=(TextView)findViewById(R.id.p2);
        setContentView(R.layout.activity_vs__ai);
        b_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            b_01.setText(x);
            b_01.setEnabled(false);
            b1=1;
            if(b2==0)
            {
                b_02.setText(o);
                b2=-1;
                b_02.setEnabled(false);
            }
            else if (b3==0)
            {
                b_03.setText(o);
                b3=-1;
                b_03.setEnabled(false);
            }
            else if (b4==0)
            {
                b_04.setText(o);
                b4=-1;
                b_04.setEnabled(false);
            }
            else if (b5==0)
            {
                b_05.setText(o);
                b5=-1;
                b_05.setEnabled(false);
            }
            else if (b6==0)
            {
                b_06.setText(o);
                b6=-1;
                b_06.setEnabled(false);
            }
            else if (b7==0)
            {
                b_07.setText(o);
                b7=-1;
                b_07.setEnabled(false);
            }
            else if (b8==0)
            {
                b_08.setText(o);
                b8=-1;
                b_08.setEnabled(false);
            }
            else if (b9==0)
            {
                b_09.setText(o);
                b9=-1;
                b_09.setEnabled(false);
            }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_02.setText(x);
                b_02.setEnabled(false);
                b2=1;
                if(b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_03.setText(x);
                b_03.setEnabled(false);
                b3=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_04.setText(x);
                b_04.setEnabled(false);
                b4=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_05.setText(x);
                b_05.setEnabled(false);
                b5=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_06.setText(x);
                b_06.setEnabled(false);
                b6=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_07.setText(x);
                b_07.setEnabled(false);
                b7=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_08.setText(x);
                b_08.setEnabled(false);
                b8=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                else if (b9==0)
                {
                    b_09.setText(o);
                    b9=-1;
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });
        b_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_09.setText(x);
                b_09.setEnabled(false);
                b9=1;
                if(b2==0)
                {
                    b_02.setText(o);
                    b2=-1;
                    b_02.setEnabled(false);
                }
                else if (b3==0)
                {
                    b_03.setText(o);
                    b3=-1;
                    b_03.setEnabled(false);
                }
                else if (b4==0)
                {
                    b_04.setText(o);
                    b4=-1;
                    b_04.setEnabled(false);
                }
                else if (b5==0)
                {
                    b_05.setText(o);
                    b5=-1;
                    b_05.setEnabled(false);
                }
                else if (b6==0)
                {
                    b_06.setText(o);
                    b6=-1;
                    b_06.setEnabled(false);
                }
                else if (b7==0)
                {
                    b_07.setText(o);
                    b7=-1;
                    b_07.setEnabled(false);
                }
                else if (b8==0)
                {
                    b_08.setText(o);
                    b8=-1;
                    b_08.setEnabled(false);
                }
                else if (b1==0)
                {
                    b_01.setText(o);
                    b1=-1;
                    b_01.setEnabled(false);
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3)||(b1+b2+b3==3)||(b4+b5+b6==3)||(b7+b8+b9==3))
                {
                    pl++;
                    openDialog();
                    player.setText("Player 1: "+pl);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3)||(b1+b2+b3==-3)||(b4+b5+b6==-3)||(b7+b8+b9==-3))
                {
                    com++;
                    openDialog1();
                    computer.setText("Player 2: "+com);
                    b_01.setEnabled(false);
                    b_02.setEnabled(false);
                    b_03.setEnabled(false);
                    b_04.setEnabled(false);
                    b_05.setEnabled(false);
                    b_06.setEnabled(false);
                    b_07.setEnabled(false);
                    b_08.setEnabled(false);
                    b_09.setEnabled(false);
                }
            }
        });


    }

    public void openDialog(){
        ExampleDialog exampleDialog=new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"win");

    }
    public void openDialog1(){
        ExampleDialog2 exampleDialog2=new ExampleDialog2();
        exampleDialog2.show(getSupportFragmentManager(),"win");

    }


}