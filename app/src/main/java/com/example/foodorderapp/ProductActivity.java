package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.foodorderapp.Adapters.ProductAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityProductBinding;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    ActivityProductBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.broccoli, "Broccoli", "5", "It tastes great steamed, boiled, baked and is a fresh and healthy side dishes"));
        list.add(new MainModel(R.drawable.cherries, "Cherries", "6", "Cherries are a rich source of vitamins, and minerals. Cherries are great in salads or to top off ice cream."));
        list.add(new MainModel(R.drawable.bellpepper, "Bell Pepper", "4", "Whether sauteed, raw or chopped up in a salad, bring flavour, crunch and colour to any meal."));
        list.add(new MainModel(R.drawable.blueberry, "Blueberry", "3", "Sweet & juicy! Blueberries pack a healthy punch of flavor in smoothies, alone as a snack, or in desserts."));
        list.add(new MainModel(R.drawable.grapes, "Grapes", "6", "The seedless grape is a favoured snack time choice for adults and children."));
        list.add(new MainModel(R.drawable.tomato, "Tomato", "3", "This great Ideal tomato is perfect to eat in a sandwich because of the size of the product."));
        list.add(new MainModel(R.drawable.mangoes, "Mango", "5", "Succulent, fragrant and juicy red mango. Naturally high in vitamin C and fibre."));
        list.add(new MainModel(R.drawable.apple, "Apple", "4", "The mild yet sweet flavour of the Gala apple has made it a family favourite for salads."));
        list.add(new MainModel(R.drawable.avocado, "Avocado", "5", "Ready to eat avacado. Creamy & nutty. Source of vitamin E. Source of vitamin B6."));

        ProductAdapter adapter = new ProductAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

        binding.floatingHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductActivity.this, ProductActivity.class));
            }
        });

        binding.floatingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductActivity.this, OrderActivity.class));
            }
        });

        binding.floatingCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductActivity.this, CheckoutActivity.class));
            }
        });

    }


    ///// Top Action Bar Fab icon for Viewing Checkout items
    /*public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return  super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.cart:
                startActivity(new Intent(ProductActivity.this, OrderActivity.class));
                break;
            case R.id.home:
                startActivity(new Intent(ProductActivity.this, ProductActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/

}

//  startActivity(new Intent(ProductActivity.this, OrderActivity.class));