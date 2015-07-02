package com.example.systems_5.fap_dj;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    private Toolbar toolbar;
    ImageButton FAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = (EditText)findViewById(R.id.email);
        EditText pass =(EditText)findViewById(R.id.pass);
        Button login =(Button)findViewById(R.id.login);
        Button linkReg =(Button)findViewById(R.id.linktoRegister);
        



        //link to registration button
        linkReg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toregister = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(toregister);
            }
        });



        // Creating The Toolbar and setting it as the Toolbar for the activity
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FAB = (ImageButton) findViewById(R.id.imageButton);
        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);

            }
        });



    }

}