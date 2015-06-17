package com.example.frabelo.minhaaplicacao;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by FRabelo on 17/06/2015.
 */
public class CustomOnItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Toast.makeText(parent.getContext(), "OnItemSelectedListener : "
                + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();
        }

    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
