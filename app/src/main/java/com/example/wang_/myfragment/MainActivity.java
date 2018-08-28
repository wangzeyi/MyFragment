package com.example.wang_.myfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.MyLayout, new Frag1(), "MyTag").commit();

    }

    @Override
    public void processData(String usr) {

        //Toast.makeText(this, usr, Toast.LENGTH_SHORT).show();
        Frag2 f2 = new Frag2();
        Bundle bundle = new Bundle();
        bundle.putString("usr", usr);

        f2.setArguments(bundle);//hi

        getSupportFragmentManager().beginTransaction().add(R.id.MyLayout, f2, "MyTag").commit();


    }
}
