package com.example.spchadits;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //    private Uri image_uri;
    Button b;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    ImageButton ib_author, ib_book, ib_chapter, ib_about;
//    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ib_author = (ImageButton) findViewById(R.id.Author_btn);
        ib_author.setOnClickListener(this);

        ib_book = (ImageButton) findViewById(R.id.Book_btn);
        ib_book.setOnClickListener(this);

        ib_chapter = (ImageButton) findViewById(R.id.Chapter_btn);
        ib_chapter.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Author_btn:
                Intent mauth = new Intent(MainActivity.this, Activity_Author.class);
                startActivity(mauth);
                break;
            case R.id.Book_btn :
                Intent mbook = new Intent(MainActivity.this, Activity_Book.class);
                startActivity(mbook);
                break;
            case R.id.Chapter_btn:
                Intent mchap = new Intent(MainActivity.this, Activity_Chapter.class);
                startActivity(mchap);
                break;

            default:
                break;
        }

    }
//        Intent mvAuth = new Intent(MainActivity.this, Activity_Author.class);
//        startActivity(mvAuth);
//    }
}

//        b=(Button)findViewById(R.id.button2);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getContent();
//            }
//        });
//        getContent();

//        mRecyclerView = findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//    }
//
//    private void getContent() {
//        //String coba123;
//        //coba123 = "";
//        String errorMessage = "";
//
//        //File file = new File(mImageFileLocation);
//        //int file_size = Integer.parseInt(String.valueOf(file.length()/1024));
//        try {
//            Retrofit retrofit = NetworkClient.getRetrofit();
//
//            //RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
//            //MultipartBody.Part parts = MultipartBody.Part.createFormData("newimage", file.getName(), requestBody);
//
//            RequestBody someData = RequestBody.create(MediaType.parse("text/plain"), "This is a new Image");
//
//            CallApis uploadApis = retrofit.create(CallApis.class);
//            Call call = uploadApis.getContent();
//            call.enqueue(new Callback() {
//                @Override
//                public void onResponse(Call call, Response response) {
//                    if (response.code() == 200) {
//                        HaditsAuthor data = (HaditsAuthor)response.body();
//                        //String gson = new Gson().toJson(response.body());
//
//                        mAdapter = new AuthorAdapter(data);
//                        mRecyclerView.setAdapter(mAdapter);
//
//                        String message = "";
//                    } else {
//                        Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_LONG).show();
//                    }
//                }
//
//                @Override
//                public void onFailure(Call call, Throwable t) {
//                    String message = t.getMessage();
//                    String coba = "";
//                }
//            });
//
//        } catch (Exception e) {
//            errorMessage = e.getMessage();
////        }
//    }
//
//}