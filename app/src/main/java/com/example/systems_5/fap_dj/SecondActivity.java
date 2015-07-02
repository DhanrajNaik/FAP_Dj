package com.example.systems_5.fap_dj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by System S-5 on 01-07-2015.
 */
public class SecondActivity  extends ActionBarActivity {
    private Toolbar toolbar;
   private EditText regname,regemail,regpass;
   private Button register,linklogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        // Creating The Toolbar and setting it as the Toolbar for the activity
        toolbar= (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

         regname=(EditText)findViewById(R.id.regName);
         regemail=(EditText)findViewById(R.id.regEmail);
         regpass=(EditText)findViewById(R.id.regPass);
        register=(Button)findViewById(R.id.regBtn);
         linklogin=(Button)findViewById(R.id.linktoLogin);

        //strings
       // String uname=regname.getText().toString();

      //  String upass=regpass.getText().toString();



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=regname.getText().toString();

                String uemail =regemail.getText().toString();
                if(!isValidEmail(uemail)){
                    regemail.setError("wrong email");

                }
               String upass = regpass.getText().toString();
                if (!isValidPassword(upass)) {
                    regpass.setError("Invalid Password");
                }
            }
            // validating email id
            private boolean isValidEmail(String uemail) {
                String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(uemail);
                return matcher.matches();
            }

            // validating password with retype password
            private boolean isValidPassword(String pass) {
                if (pass != null && pass.length() > 6) {
                    return true;
                }
                return false;
            }
        });


        linklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLogin =new Intent(getApplicationContext(),MainActivity.class);
               startActivity(toLogin);
            }
        });
    }
}
