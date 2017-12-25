package com.ackrotech.creditmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ackrotech.creditmanager.Models.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Signup extends AppCompatActivity {

    @BindView(R.id.email_input)
    EditText emailInput;

    @BindView(R.id.email_label)
    TextView emailLabel;

    @BindView(R.id.password_input)
    EditText passwordInput;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.login_button)
    public void onButtonClick(View view) {
        mDatabase = FirebaseDatabase.getInstance().getReference();

        String userId = mDatabase.push().getKey();

        User user = new User("Akshay", emailInput.getText().toString(), passwordInput.getText().toString());

        mDatabase.child(userId).setValue(user);
        Toast.makeText(getApplicationContext(), "Sign Up successful ", Toast.LENGTH_SHORT).show();
    }


}







