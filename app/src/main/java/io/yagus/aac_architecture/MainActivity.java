package io.yagus.aac_architecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.yagus.aac_architecture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    /* 참고 사이트: https://gun0912.tistory.com/71*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DataBinding 세팅
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // LivaData 세팅
        binding.setLifecycleOwner(this);

        // ViewModel 세팅
        MainViewModel viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        // DataBinding, ViewModel 결합
        binding.setViewModel(viewModel);




    }
}
