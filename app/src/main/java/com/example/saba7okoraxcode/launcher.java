
package com.example.saba7okoraxcode;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;


public class launcher extends AppCompatActivity {

    MediaPlayer nosohy_voice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        nosohy_voice = MediaPlayer.create(launcher.this,R.raw.sabaho_audio);




        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                          startActivity(intent);
                                          finish();

                                      }
                                  },3000);






    }

    @Override
    protected void onStart() {
        super.onStart();
        nosohy_voice.start();
    }
}