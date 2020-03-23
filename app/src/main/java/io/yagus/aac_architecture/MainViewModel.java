package io.yagus.aac_architecture;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    // 자동갱신 세팅
   public MutableLiveData<Integer> counter = new MutableLiveData<>();

    public MainViewModel() {
        counter.setValue(0);
    }

    public void increase() {
       counter.setValue(counter.getValue()+1);
   }
}
