package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(this);

        MaterialCardView noticeCard= findViewById(R.id.addNotice);
        MaterialCardView addGalleryImage=findViewById(R.id.addGalleryImage);
        MaterialCardView uploadPdf=findViewById(R.id.addeBook);
        noticeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noticeIntent=new Intent(MainActivity.this,UploadNotice.class);
                startActivity(noticeIntent);
            }
        });
        addGalleryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageIntent=new Intent(MainActivity.this,UploadImage.class);
                startActivity(imageIntent);
            }
        });
        uploadPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pdfIntent=new Intent(MainActivity.this,UploadPdf.class);
                startActivity(pdfIntent);
            }
        });
    }
}