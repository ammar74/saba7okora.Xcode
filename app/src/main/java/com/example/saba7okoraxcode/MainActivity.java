package com.example.saba7okoraxcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        loadFragment(new PlayFragment());
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.play_item) {
                loadFragment(new PlayFragment());
            } else if (itemId == R.id.score_item) {
                loadFragment(new ScoreHistoryFragment());
            } else if (itemId == R.id.news_item) {
                loadFragment(new NewsFragment());
            } else if (itemId == R.id.fantasy_item) {
                loadFragment(new FantasyFragment());
            } else if (itemId == R.id.youtube_item) {
                loadFragment(new YoutubeFragment());
            }
            return false;

        });
    }

    public void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();    }
}