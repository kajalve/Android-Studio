package com.example.phone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mu,bh,sh,un;
      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          findViewById(R.id.mu).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  dialContactPhone("9682436011");
              }
              private void dialContactPhone(String s) {
                  startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",s,null)));

              }
              {
          findViewById(R.id.bh).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  dialContactPhone("8299052741");
              }
              private void dialContactPhone(String s) {
                  startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", s, null)));
              }
              {
          findViewById(R.id.un).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  dialContactPhone("9454570239");
              }
              private void dialContactPhone(String s) {
                  startActivity(new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",s,null)));
              }
              {
          findViewById(R.id.sh).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  dialContactPhone("6388369814");
              }
              private void dialContactPhone(String s){
                  startActivity(new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",s,null)));
              }
          });
              }
          });
              }
          });
              }

          });



      }






    }
