package com.tech42labs.alertme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;

import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity {


    CheckBox checkBox   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox) findViewById(R.id.terms);
        String checkBoxText = "I Agree the <a href='http://www.redbus.in/mob/mTerms.aspx' style:color: 'YELLOW';> Terms and Conditions</a>";

        checkBox.setText(Html.fromHtml(checkBoxText));
        checkBox.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
