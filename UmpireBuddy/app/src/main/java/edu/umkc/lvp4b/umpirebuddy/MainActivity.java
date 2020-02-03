package edu.umkc.lvp4b.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int balls;
    private int strikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBall(View view){
        TextView ball = (TextView) findViewById(R.id.ballCounter);
        balls++;
        ball.setText(String.valueOf(balls));
    }

    public void onStrike(View view){
        TextView strike = (TextView) findViewById(R.id.strikeCounter);
        strikes++;
        strike.setText(String.valueOf(strikes));
    }

    public void onReset(View view){
        TextView ball = (TextView) findViewById(R.id.ballCounter);
        balls = 0;
        ball.setText(String.valueOf(balls));

        TextView strike = (TextView) findViewById(R.id.strikeCounter);
        strikes = 0;
        strike.setText(String.valueOf(strikes));
    }

    public void onExit(View view){
        System.exit(0);
    }
}
