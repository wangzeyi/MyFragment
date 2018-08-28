package com.example.wang_.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Frag1 extends Fragment{

    Button button_add;
    EditText usr_txt;
    String usr;
    MyInterface mi;

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        mi =  (MyInterface) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag1, container, false);

        button_add = v.findViewById(R.id.Button_Add);
        usr_txt = v.findViewById(R.id.Usr_Txt);



        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usr = usr_txt.getText().toString();
                mi.processData(usr);
            }
        });


        return v;
    }
}
