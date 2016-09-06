package edu.orangecoastcollege.cs273.mmizukami.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button speakButton;
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        speakButton = (Button) findViewById(R.id.speakButton);

    // Wire up the speak button to perform an onClick event
        speakButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Use the static reference to "Toast" to display the message:
                        // Toast = vanishes after set amount of time
                        // Dialog = requires user input
                        Toast.makeText(context, R.string.toast_text,Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}
