package com.example.spchadits;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Activity_Chapter extends AppCompatActivity {

    private Uri image_uri;
    Button b;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
//    private ImageButton ib_author, ib_book, ib_chapter, ib_about;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
//        ib_author = (ImageButton) findViewById(R.id.Author_btn);
//        ib_author.setOnClickListener(new View.OnClickListener() {
//        });

//        b=(Button)findViewById(R.id.button2);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getContent();
//            }
//        });
        getContent();

        mRecyclerView = findViewById(R.id.recyclerViewChapter);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    private void getContent() {
        //String coba123;
        //coba123 = "";
        String errorMessage = "";

        //File file = new File(mImageFileLocation);
        //int file_size = Integer.parseInt(String.valueOf(file.length()/1024));
        try {
            Retrofit retrofit = NetworkClient.getRetrofit();

            //RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
            //MultipartBody.Part parts = MultipartBody.Part.createFormData("newimage", file.getName(), requestBody);

            RequestBody someData = RequestBody.create(MediaType.parse("text/plain"), "This is a new Image");

            CallApis uploadApis = retrofit.create(CallApis.class);
            Call call = uploadApis.getContentChapter();
            call.enqueue(new Callback() {
                @Override
                public void onResponse(Call call, Response response) {
                    if (response.code() == 200) {
                        HaditsChapter data = (HaditsChapter)response.body();
                        //String gson = new Gson().toJson(response.body());

                        mAdapter = new Adapter_Chapter(data);
                        mRecyclerView.setAdapter(mAdapter);

                        String message = "";
                    } else {
                        Toast.makeText(Activity_Chapter.this, response.message(), Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call call, Throwable t) {
                    String message = t.getMessage();
                    String coba = "";
                }
            });

        } catch (Exception e) {
            errorMessage = e.getMessage();
        }
    }

}