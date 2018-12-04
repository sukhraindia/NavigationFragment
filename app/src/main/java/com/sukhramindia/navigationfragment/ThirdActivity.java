package com.sukhramindia.navigationfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
ImageView img1;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

    img1=findViewById( R.id.img1);
    tv1=findViewById(R.id.tv1);


    img1.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Intent intent=new Intent(ThirdActivity.this,MapsActivity.class);
            startActivity(intent);
        }
    } );

    }
}
