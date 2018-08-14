package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button ;
        final ImageView ball;
        ball=(ImageView)findViewById(R.id.ball);
        button=(Button)findViewById(R.id.button);
        final int[] ballarray={
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5};
        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
            Random random_numberGenrator=new Random();
            int number= random_numberGenrator.nextInt(5);
            ball.setImageResource(ballarray[number]);
            Log.d("magic","The number is "+number);
            }
        });
    }
}
