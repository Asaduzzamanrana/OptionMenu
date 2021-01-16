  package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
          MenuInflater menuInflater = getMenuInflater();
          menuInflater.inflate(R.menu.menu_layout,menu);

          return super.onCreateOptionsMenu(menu);
      }

      @Override
      public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.settingid){
            Toast.makeText(MainActivity.this,"setting selected",Toast.LENGTH_SHORT).show();
            return true;
        }
          if (item.getItemId()==R.id.feedgid){
              Toast.makeText(MainActivity.this,"feedback selected",Toast.LENGTH_SHORT).show();
              return true;
          }
          if (item.getItemId()==R.id.aboutgid){
              Toast.makeText(MainActivity.this,"about selected",Toast.LENGTH_SHORT).show();
              return true;
          }
          if (item.getItemId()==R.id.shareid){
              Toast.makeText(MainActivity.this,"share selected",Toast.LENGTH_SHORT).show();
              return true;
          }

          return super.onOptionsItemSelected(item);
      }
  }
