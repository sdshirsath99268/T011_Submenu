package com.example.t011_optionmenu_submenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Show option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menufile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.call:
                Toast.makeText(getApplicationContext(), "Selected 'Call' , now select Submenu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.airtel:
                Toast.makeText(getApplicationContext(), "Selected 'Airtel' , Submenu Option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sms:
                Toast.makeText(getApplicationContext(), "Selected 'SMS'", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(getApplicationContext(), "Selected 'Email'", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}