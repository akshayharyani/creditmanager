package com.ackrotech.creditmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.email_input)
    EditText emailInput;

    @BindView(R.id.email_label)
    TextView emailLabel;

    @BindView(R.id.signup_link)
    TextView signupLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_button)
    public void onLoginButtonClick(View view) {
        Toast.makeText(getApplicationContext(), "You have entered: " + emailInput.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.signup_link)
    public void onSignupLinkClick(View view) {
        Intent intent = new Intent(MainActivity.this, Signup.class);
        startActivity(intent);
    }
}
