package com.example.teaching.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    void handleClick(){
        //code to handle the click
        //display a toast messsage
        Toast toast = Toast.makeText(this, "You clicked the button!", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set a listener for my button
        //get a reference to the button
        Button button = (Button) findViewById(R.id.mybutton);
        button.setOnClickListener(/*create an OnClickListener*/ new View.OnClickListener() {
            @Override
            public void onClick(View v) { /*override the onClick method in our new, anonymous OnClickListner object*/
                //call a method in MainActivity to do the work (delegate the work)
                handleClick();
            }
        });

    }
}
