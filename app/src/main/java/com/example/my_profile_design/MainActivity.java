package com.example.my_profile_design;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ImageButtons
        ImageButton btnGmail = findViewById(R.id.btnGmail);
        ImageButton btnLinkedIn = findViewById(R.id.btnLinkedIn);
        ImageButton btnInstagram = findViewById(R.id.btnInstagram);

        // Set click listeners for the ImageButtons
        btnGmail.setOnClickListener(v -> openUrl("https://www.facebook.com/justinedenise.hernandez"));

        btnLinkedIn.setOnClickListener(v -> openUrl("https://www.linkedin.com/in/justine-h-a68469242"));

        btnInstagram.setOnClickListener(v -> openUrl("https://www.instagram.com/j.u.s__/"));
                // Set click listeners for other social media ImageButtons as needed
    }

    // Method to open a URL
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
