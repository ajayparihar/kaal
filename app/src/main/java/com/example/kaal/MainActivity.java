package com.example.kaal;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView p_Day, p_Hour, p_Minute, p_Second, f_Day, f_Hour, f_Minute, f_Second, n_Day, n_Hour, n_Minute, n_Second;
    private TextView event_start1, event_start2;
    private Handler handler;
    private Runnable runnable;
    TextView past, future, near_future;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p_Day = (TextView) findViewById(R.id.p_d);
        p_Hour = (TextView) findViewById(R.id.p_h);
        p_Minute = (TextView) findViewById(R.id.p_m);
        p_Second = (TextView) findViewById(R.id.p_s);
        past = (TextView) findViewById(R.id.past);

        f_Day = (TextView) findViewById(R.id.f_d);
        f_Hour = (TextView) findViewById(R.id.f_h);
        f_Minute = (TextView) findViewById(R.id.f_m);
        f_Second = (TextView) findViewById(R.id.f_sec);
        future = (TextView) findViewById(R.id.future);
        event_start1 = (TextView) findViewById(R.id.event1);

        n_Day = (TextView) findViewById(R.id.n_d);
        n_Hour = (TextView) findViewById(R.id.n_h);
        n_Minute = (TextView) findViewById(R.id.n_m);
        n_Second = (TextView) findViewById(R.id.n_sec);
        near_future = (TextView) findViewById(R.id.near_future);
        event_start2 = (TextView) findViewById(R.id.event2);

        past();
        future();
        near_future();

    }

    public void past() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    // Please here set your event date//YYYY-MM-DD
                    Date pastDate = dateFormat.parse("1997-06-12-19-40-00");
                    Date currentDate = new Date();
                    long diff = currentDate.getTime()
                            - pastDate.getTime();
                    long days = diff / (24 * 60 * 60 * 1000);
                    diff -= days * (24 * 60 * 60 * 1000);
                    long hours = diff / (60 * 60 * 1000);
                    diff -= hours * (60 * 60 * 1000);
                    long minutes = diff / (60 * 1000);
                    diff -= minutes * (60 * 1000);
                    long seconds = diff / 1000;
                    p_Day.setText("" + String.format("%02d", days));
                    p_Hour.setText("" + String.format("%02d", hours));
                    p_Minute.setText(""
                            + String.format("%02d", minutes));
                    p_Second.setText(""
                            + String.format("%02d", seconds));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
        past.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Made by Babe Developer",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
    }


    public void future() {
        future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Made by Babe Developer",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    // Please here set your event date//YYYY-MM-DD
                   Date futureDate = dateFormat.parse("2066-08-09-18-42-40");

                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long fdiff = futureDate.getTime()
                                - currentDate.getTime();
                        long fdays = fdiff / (24 * 60 * 60 * 1000);
                        fdiff -= fdays * (24 * 60 * 60 * 1000);
                        long fhours = fdiff / (60 * 60 * 1000);
                        fdiff -= fhours * (60 * 60 * 1000);
                        long fminutes = fdiff / (60 * 1000);
                        fdiff -= fminutes * (60 * 1000);
                        long fseconds = fdiff / 1000;
                        f_Day.setText("" + String.format("%02d", fdays));
                        f_Hour.setText("" + String.format("%02d", fhours));
                        f_Minute.setText(""
                                + String.format("%02d", fminutes));
                        f_Second.setText(""
                                + String.format("%02d", fseconds));
                    } else {
                        event_start1.setVisibility(View.VISIBLE);
                        event_start1.setText("Hope you lived your life well");
                        textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void textViewGone() {
        findViewById(R.id.future_days).setVisibility(View.GONE);
        findViewById(R.id.f_hour).setVisibility(View.GONE);
        findViewById(R.id.future_min).setVisibility(View.GONE);
        findViewById(R.id.f_s).setVisibility(View.GONE);
        findViewById(R.id.future).setVisibility(View.GONE);
    }


    public void near_future() {
        near_future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Made by Babe Developer",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    // Please here set your event date//YYYY-MM-DD
                   Date nearFutureDate = dateFormat.parse("2022-06-12-19-40-00");

                    Date currentDate = new Date();
                    if (!currentDate.after(nearFutureDate)) {
                        long ndiff = nearFutureDate.getTime()
                                - currentDate.getTime();
                        long ndays = ndiff / (24 * 60 * 60 * 1000);
                        ndiff -= ndays * (24 * 60 * 60 * 1000);
                        long nhours = ndiff / (60 * 60 * 1000);
                        ndiff -= nhours * (60 * 60 * 1000);
                        long nminutes = ndiff / (60 * 1000);
                        ndiff -= nminutes * (60 * 1000);
                        long nseconds = ndiff / 1000;
                        n_Day.setText("" + String.format("%02d", ndays));
                        n_Hour.setText("" + String.format("%02d", nhours));
                        n_Minute.setText(""
                                + String.format("%02d", nminutes));
                        n_Second.setText(""
                                + String.format("%02d", nseconds));
                    } else {
                        event_start2.setVisibility(View.VISIBLE);
                        event_start2.setText("Hey!!.. Happy 25 Hope you are doing good");
                        textViewGone2();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void textViewGone2() {
        findViewById(R.id.n_day).setVisibility(View.GONE);
        findViewById(R.id.n_hour).setVisibility(View.GONE);
        findViewById(R.id.n_min).setVisibility(View.GONE);
        findViewById(R.id.n_s).setVisibility(View.GONE);
        findViewById(R.id.near_future).setVisibility(View.GONE);
    }
}
