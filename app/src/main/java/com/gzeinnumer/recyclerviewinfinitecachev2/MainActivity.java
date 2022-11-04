package com.gzeinnumer.recyclerviewinfinitecachev2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.recyclerviewinfinitecachev2.adapter.ExampleAdapter;
import com.gzeinnumer.recyclerviewinfinitecachev2.databinding.ActivityMainBinding;
import com.gzeinnumer.recyclerviewinfinitecachev2.model.ParamsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainVM vm;
    private List<ParamsModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm = new ViewModelProvider(this).get(MainVM.class);

        initView();
        initTextWatcher();
        initObserver();
        initOnClick();
    }

    private void initView() {
        initRV();
    }

    private void initTextWatcher() {

    }

    private void initObserver() {

    }

    private static final String TAG = "asdasdadasd";

    private void initOnClick() {
        binding.btnSubmit.setOnClickListener(view -> {
            Log.d(TAG, "initOnClick: "+list.toString());
        });
    }

    private void initRV() {
        for (int i = 0; i < 100; i++) {
            list.add(new ParamsModel((i+1)+""));
        }
        ExampleAdapter adapter = new ExampleAdapter(list);

        binding.rv.setAdapter(adapter);
        binding.rv.hasFixedSize();
        binding.rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}