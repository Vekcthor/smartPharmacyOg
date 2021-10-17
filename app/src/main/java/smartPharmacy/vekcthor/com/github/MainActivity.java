package smartPharmacy.vekcthor.com.github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addAlarm = findViewById(R.id.button);

        addAlarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Intent myIntent = new Intent(MainActivity.this, NewAlarm.class);
                MainActivity.this.startActivity(myIntent);

            }
        });
    }
}