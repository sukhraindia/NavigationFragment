package com.sukhramindia.navigationfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HariActivity extends AppCompatActivity {
Button restorent,tample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari);
   restorent=findViewById(R.id.restorent);
   tample=findViewById(R.id.button);


   restorent.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent=new Intent( HariActivity.this,ThirdActivity.class );
           startActivity( intent );
       }
   });

    tample.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
Intent intent=new Intent( HariActivity.this,ForthActivity.class );
startActivity( intent );
        }
    });

    }
}
