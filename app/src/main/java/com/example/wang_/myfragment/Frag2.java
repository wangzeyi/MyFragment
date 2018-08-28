package com.example.wang_.myfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Frag2 extends Fragment{


    TextView output_txt;
    String usr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag2, container, false);

        output_txt = v.findViewById(R.id.Output_Txt);

        Bundle bundle = getArguments();

        usr = bundle.getString("usr");

        output_txt.setText(usr);

        return v;
    }
}
