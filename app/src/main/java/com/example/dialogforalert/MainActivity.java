package com.example.dialogforalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder mAlertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildAlertDialog();
    }

    private void buildAlertDialog() {
        mAlertDialogBuilder = new AlertDialog.Builder(this);
        mAlertDialogBuilder.setTitle("Alert");
        mAlertDialogBuilder.setMessage("Click OK to continue or Cancel to stop:");

        mAlertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You pressed Ok"
                        , Toast.LENGTH_SHORT).show();
            }
        });

        mAlertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You pressed Cancel"
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickShowAlert(View view) {
        mAlertDialogBuilder.show();
    }
}
