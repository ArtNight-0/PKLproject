package com.example.spchadits;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

import android.widget.Filter;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Activity_Author extends AppCompatActivity  {
//    public Adapter_Author(Activity_Author activity_author, ArrayList<POJOAuthor> arrayList) {
//    }


    private Uri image_uri;
//    Button b;
//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
    private Adapter_Author mAdapter;
    private List<Item_Author> mExampleList  = new ArrayList<>();

    //ArrayList
//    private Adapter_Author adapter_author;
//    private ArrayList<Item_Author> arrayList = new ArrayList<>();
    //SearchView
    private TextView Hasil;
    private Toolbar toolbar;
//    private List<Item_Author> mExampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);



        //ToolBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        Hasil = findViewById(R.id.outout);

        //ArrayList


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
        setRecyclerView();

//        adapter_author = new Adapter_Author(item_authors);



//        adapter_author = new  Adapter_Author(arrayList);
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
//        mRecyclerView.addItemDecoration(dividerItemDecoration);
    }
//    private void getData(){
//        Collections.addAll(arrayList);
//    }
private void setRecyclerView(){
//        ArrayList<Adapter_Author> mExampleList = new ArrayList<>();
//        mExampleList.add(new Adapter_Author(mExampleList));



    RecyclerView recyclerView = findViewById(R.id.recyclerViewAuthor);
    recyclerView.setHasFixedSize(true);
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    mAdapter = new Adapter_Author(mExampleList);
    recyclerView.setAdapter(mAdapter);

//        adapter_author = new Adapter_Author(item_authors);

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
            Call call = uploadApis.getContentAuthor();
            call.enqueue(new Callback() {
                @Override
                public void onResponse(Call call, Response response) {
                    if (response.code() == 200) {
                        HaditsAuthor data = (HaditsAuthor)response.body();
                        //String gson = new Gson().toJson(response.body());

                        mAdapter = new Adapter_Author(data);
                        RecyclerView recyclerView = findViewById(R.id.recyclerViewAuthor);
                        recyclerView.setAdapter(mAdapter);

                        String message = "";
                    } else {
                        Toast.makeText(Activity_Author.this, response.message(), Toast.LENGTH_LONG).show();
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



// Searchview
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_toolbar, menu);

        MenuItem searchitem = menu.findItem(R.id.it_search);
        SearchView searchView = (SearchView) searchitem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            private String query;

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query ) {
                query = query.toLowerCase();
                ArrayList<Item_Author> itemAuthors = new ArrayList<>();
                for (Item_Author data : Adapter_Author.mExampleListALL) {
                    String judul = data.getName().toLowerCase();
                    if (judul.contains(query)) {
                        itemAuthors.add(data);
                    }
                }
                mAdapter.setFilter(itemAuthors);
                return false;
                }
        });
        return true ;

//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.item_toolbar, menu);
//        MenuItem searchitem = menu.findItem(R.id.it_search);
//        final SearchView searchView = (SearchView) searchitem.getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public boolean onQueryTextSubmit(String s) {
////                adapter_author.getFilter().filter(s);
////                searchView.clearFocus();
//                return true;
////                getMenuInflater().inflate(R.menu.item_toolbar, menu);
////                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                adapter_author.getFilter().filter(s);
//                return false;
////                if (TextUtils.isEmpty(s)){
////                    adapter_author.filter("");
////                    mRecyclerView.clearFocus();
////                }else {
////                    adapter_author.filter(s);
////                }
////
////                return true;
//            }
//        });

//
    }

//    public void setAdapter_author(Adapter_Author adapter_author) {
//        this.adapter_author = adapter_author;
//    }
}