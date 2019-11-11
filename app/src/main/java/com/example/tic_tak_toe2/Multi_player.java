package com.example.tic_tak_toe2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Multi_player extends AppCompatActivity {
private Button B_07;
    private Button B_01;
    private Button B_02;
    private Button B_03;
    private Button B_04;
    private Button B_05;
    private Button B_06;
    private Button B_08;
    private Button B_09;
    private Button reset;
    private TextView p1;
    private TextView p2;
    String x="X";
    String o="O";
    int n1=0,n2=0,c=0;
    int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player);
    B_01=(Button)findViewById(R.id.button_01);
        B_02=(Button)findViewById(R.id.button_02);
        B_03=(Button)findViewById(R.id.button_03);
        B_04=(Button)findViewById(R.id.button_04);
        B_05=(Button)findViewById(R.id.button_05);
        B_06=(Button)findViewById(R.id.button_06);
        B_07=(Button)findViewById(R.id.button_07);
        B_08=(Button)findViewById(R.id.button_08);
        B_09=(Button)findViewById(R.id.button_09);
        reset=(Button)findViewById(R.id.reset);
        p1=(TextView)findViewById(R.id.p1);
        p2=(TextView)findViewById(R.id.p2);

        B_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(c%2==0)
            {
                B_01.setText(x);
                b1=1;
            }
            else
            {
                B_01.setText(o);
                b1=-1;
            }
            if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
            {
             n1++;
                openDialog();
             p1.setText("Player 1: "+n1);
            B_01.setEnabled(false);
                B_02.setEnabled(false);
                B_03.setEnabled(false);
                B_04.setEnabled(false);
                B_05.setEnabled(false);
                B_06.setEnabled(false);
                B_07.setEnabled(false);
                B_08.setEnabled(false);
                B_09.setEnabled(false);
            }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_02.setText(x);
                    b2=1;
                }
                else
                {
                    B_02.setText(o);
                    b2=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_03.setText(x);
                    b3=1;
                }
                else
                {
                    B_03.setText(o);
                    b3=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_04.setText(x);
                    b4=1;
                }
                else
                {
                    B_04.setText(o);
                    b4=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_05.setText(x);
                    b5=1;
                }
                else
                {
                    B_05.setText(o);
                    b5=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_06.setText(x);
                    b6=1;
                }
                else
                {
                    B_06.setText(o);
                    b6=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_07.setText(x);
                    b7=1;
                }
                else
                {
                    B_07.setText(o);
                    b7=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_08.setText(x);
                    b8=1;
                }
                else
                {
                    B_08.setText(o);
                    b8=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        B_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c%2==0)
                {
                    B_09.setText(x);
                    b9=1;
                }
                else
                {
                    B_09.setText(o);
                    b9=-1;
                }
                if((b1+b4+b7==3)||(b2+b5+b8==3)||(b3+b6+b9==3)||(b1+b5+b9==3)||(b3+b5+b7==3))
                {
                    n1++;
                    openDialog();
                    p1.setText("Player 1: "+n1);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                if((b1+b4+b7==-3)||(b2+b5+b8==-3)||(b3+b6+b9==-3)||(b1+b5+b9==-3)||(b3+b5+b7==-3))
                {
                    n2++;
                    openDialog1();
                    p2.setText("Player 2: "+n2);
                    B_01.setEnabled(false);
                    B_02.setEnabled(false);
                    B_03.setEnabled(false);
                    B_04.setEnabled(false);
                    B_05.setEnabled(false);
                    B_06.setEnabled(false);
                    B_07.setEnabled(false);
                    B_08.setEnabled(false);
                    B_09.setEnabled(false);
                }
                c++;
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B_01.setEnabled(true);
                B_02.setEnabled(true);
                B_03.setEnabled(true);
                B_04.setEnabled(true);
                B_05.setEnabled(true);
                B_06.setEnabled(true);
                B_07.setEnabled(true);
                B_08.setEnabled(true);
                B_09.setEnabled(true);
                B_01.setText("");
                B_02.setText("");
                B_03.setText("");
                B_04.setText("");
                B_05.setText("");
                B_06.setText("");
                B_07.setText("");
                B_08.setText("");
                B_09.setText("");
                c=0;
                b1=0;
                b2=0;
                b3=0;
                b4=0;
                b5=0;
                b6=0;
                b7=0;
                b8=0;
                b9=0;

            }
        });

        }
        public void openDialog(){
        ExampleDialog exampleDialog=new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"win");

    }
    public void openDialog1(){
        ExampleDialog1 exampleDialog1=new ExampleDialog1();
        exampleDialog1.show(getSupportFragmentManager(),"win");

    }

}
