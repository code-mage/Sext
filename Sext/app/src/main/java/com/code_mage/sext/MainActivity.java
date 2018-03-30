package com.code_mage.sext;

import android.app.ActionBar;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if(FirebaseAuth.getInstance().getCurrentUser() == null) {
            // Start sign in/sign up activity
            Toast.makeText(this,
                    "Not Authenticated " ,
                    Toast.LENGTH_LONG)
                    .show();
        } else {
            // User is already signed in. Therefore, display
            // a welcome Toast
            Toast.makeText(this,
                    "Welcome " + FirebaseAuth.getInstance()
                            .getCurrentUser()
                            .getDisplayName(),
                    Toast.LENGTH_LONG)
                    .show();

            //DO SOMETHING
        }
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode,
//                                    Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == SIGN_IN_REQUEST_CODE) {
//            if(resultCode == RESULT_OK) {
//                Toast.makeText(this,
//                        "Successfully signed in. Welcome!",
//                        Toast.LENGTH_LONG)
//                        .show();
//                //do something
//            } else {
//                Toast.makeText(this,
//                        "We couldn't sign you in. Please try again later.",
//                        Toast.LENGTH_LONG)
//                        .show();
//
//                // Close the app
//                finish();
//            }
//        }
//
//    }
}
