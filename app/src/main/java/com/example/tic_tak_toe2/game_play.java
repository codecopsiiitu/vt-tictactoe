package com.example.tic_tak_toe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game_play extends AppCompatActivity {
    private Button Multi_player;
    private Button VS_AI;
    private Button Back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
        Multi_player=(Button)findViewById(R.id.multi_player);
        VS_AI=(Button)findViewById(R.id.Ai);
        Back=(Button)findViewById(R.id.back);
        Multi_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(game_play.this,Multi_player.class);
                startActivity(intent);
            }
        });
        VS_AI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(game_play.this,VS_AI.class);
                startActivity(intent);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(game_play.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
