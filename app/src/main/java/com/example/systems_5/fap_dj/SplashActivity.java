package com.example.systems_5.fap_dj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by System S-5 on 02-07-2015.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        //create thread that will sleep for 5 second
        Thread background = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i =new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);

                    //remove activity
                    finish();
                }
            }

    };


        //start thread
        background.start();

    }
}
