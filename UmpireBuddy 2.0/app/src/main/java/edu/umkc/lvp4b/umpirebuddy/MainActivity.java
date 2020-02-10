package edu.umkc.lvp4b.umpirebuddy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

        if (balls == 4) {
            setEnabled(false);
            showAlert("Walk!");
        }
    }

    public void onStrike(View view){
        TextView strike = (TextView) findViewById(R.id.strikeCounter);
        strikes++;
        strike.setText(String.valueOf(strikes));

        if (strikes == 3) {
            setEnabled(false);
            showAlert("Out!");
        }
    }

    public void onReset(View view){
        TextView ball = findViewById(R.id.ballCounter);
        balls = 0;
        ball.setText(String.valueOf(balls));

        TextView strike = findViewById(R.id.strikeCounter);
        strikes = 0;
        strike.setText(String.valueOf(strikes));

        setEnabled(true);
    }

    public void onAbout(View view){
        showAlert("Lia Vang");
    }

    private void showAlert(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Umpire Buddy 2.0");
        builder.setMessage(s);
        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    private void setEnabled(boolean enabled) {
        findViewById(R.id.ball).setEnabled(enabled);
        findViewById(R.id.strike).setEnabled(enabled);
        findViewById(R.id.about).setEnabled(enabled);
        findViewById(R.id.exit).setEnabled(enabled);
    }

    public void onExit(View view){
        System.exit(0);
    }
}
