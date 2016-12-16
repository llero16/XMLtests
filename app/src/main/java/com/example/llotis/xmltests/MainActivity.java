package com.example.llotis.xmltests;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SelectClass(View view)
    {

        switch (view.getId()) {
            case R.id.economic_radiobutton:
                Toast.makeText(this, "Οικονομική", Toast.LENGTH_SHORT).show();
                break;
            case R.id.premiumEco_radiobutton:
                Toast.makeText(this, "Premium", Toast.LENGTH_SHORT).show();
                break;
            case R.id.distinguished_radiobutton:
                Toast.makeText(this, "Διακεκριμμένη", Toast.LENGTH_SHORT).show();
                break;
            case R.id.firstClass__radiobutton:
                Toast.makeText(this, "First Class", Toast.LENGTH_SHORT).show();
                break;


        }
    }

    public void SelectStop(View view)
    {

        switch (view.getId()) {
            case R.id.non_stop_radiobutton:
                Toast.makeText(this, "Απ'ευθείας", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stop_radiobutton:
                Toast.makeText(this, "Με στάση", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    public void showClasses(View view)
    {
        ClassAlert myAlert = new ClassAlert();
        myAlert.show(getFragmentManager(),"Classes Alert");
    }

    public void showStops(View view)
    {
        StopsAlert myAlert = new StopsAlert();
        myAlert.show(getFragmentManager(),"Stops Alert");
    }

    public void showDates(View view)
    {
        DateAlert myAlert = new DateAlert();
        myAlert.show(getFragmentManager(),"Date Alert");

    }


}
