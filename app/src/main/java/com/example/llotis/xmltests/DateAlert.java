package com.example.llotis.xmltests;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * Created by Llotis on 16/12/2016.
 */

public class DateAlert extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view  = inflater.inflate(R.layout.fragment_date,null);

        builder.setView(view);
        builder.setTitle("Ημερομηνία & Ώρα");

        builder.setNegativeButton("ΑΚΥΡΟ", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getActivity(),"ΑΚΥΡΟ", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("ΕΦΑΡΜΟΓΗ", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getActivity(),"ΕΦΑΡΜΟΓΗ", Toast.LENGTH_SHORT).show();
            }
        });


        Dialog dialog = builder.create();
        return dialog;
    }

}

