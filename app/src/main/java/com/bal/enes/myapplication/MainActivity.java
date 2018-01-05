package com.bal.enes.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bal.enes.myapplication.Activities.SignInActivity;
import com.bal.enes.myapplication.Activities.registerActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUp = (Button) findViewById(R.id.kayit_ol);
        Button girisYap = (Button) findViewById(R.id.giris_yap);

    }

    public void isSignedIn(){

    }

    public void goToBookPresenterActivity(View view){
        Intent intent = new Intent(this,booksPresenter.class);
        startActivity(intent);
    }

    public void goToRegisterActivity(View view){
        Intent intent = new Intent(this,registerActivity.class);
        startActivity(intent);
    }
    public void goToSignInActivity(View view){
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
    }
}
