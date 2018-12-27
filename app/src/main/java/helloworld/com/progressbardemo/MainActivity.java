package helloworld.com.progressbardemo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarHorizontal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);

        final int oneMin = 1*60*1000;
        CountDownTimer cnt = new CountDownTimer(oneMin,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long finishedSeconds = oneMin - millisUntilFinished;
                int total = (int) (((float)finishedSeconds / (float)oneMin) * 100.0);
                progressBarHorizontal.setProgress(total);
            }

            @Override
            public void onFinish() {

            }
        };
        cnt.start();

    }
}
