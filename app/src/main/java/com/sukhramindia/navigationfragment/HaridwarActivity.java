package com.sukhramindia.navigationfragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HaridwarActivity extends Fragment  {
Button hello,hari;
View view;

    public HaridwarActivity() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      view= inflater.inflate(R.layout.fragment_haridwar, container, false);


      hello=view.findViewById(R.id.hello);
      hari=view.findViewById(R.id.hari);



    hello.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getActivity().getApplication(),HariActivity.class);
            startActivity(intent);

        }
    });

hari.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {



    }
});


        return view;
    }

}
