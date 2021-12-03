package com.app.twixxtime;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        NavController navController = Navigation.findNavController(this, R.id.fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }



    public void onClickGermany(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            clock.setTimeZone("Europe/Berlin");
        }
    }


    public void onClickIndia(View view) {
            TextClock clock = findViewById(R.id.my_clock);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            clock.setTimeZone("Asia/Kolkata");
        }
    }


    public void onClickFrance(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            clock.setTimeZone("Europe/Paris");
        }
    }

    public void onClickHungary(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            clock.setTimeZone("Europe/Budapest");
        }
    }
}