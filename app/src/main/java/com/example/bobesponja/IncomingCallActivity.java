package com.example.bobesponja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class IncomingCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incoming_call);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bobesponjatonos);
        mp.start();
    }

    /** Called when the user taps the Answer button */
    public void gotoCallActivity(View view) {
        Intent intent = new Intent(this, CallActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Hang button */
    public void gotoMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}