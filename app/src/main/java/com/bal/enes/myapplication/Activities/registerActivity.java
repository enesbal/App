package com.bal.enes.myapplication.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bal.enes.myapplication.R;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText nameET= findViewById(R.id.userNameEditText);
        EditText usernameET= findViewById(R.id.userNameEditText);
        EditText passwordET= findViewById(R.id.passwordEditText);
        EditText emailET= findViewById(R.id.emailEditText);

        Button signUpButton = findViewById(R.id.signUpButton);





    }

    public void signUpButtonOnClick(View view){

    }
}
