package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CheeseViewModel extends AndroidViewModel {

    private CheeseRepository mRepository;
    private LiveData<List<Cheese>> mAllCheese;

    public CheeseViewModel(Application application) {
        super(application);
        mRepository = new CheeseRepository(application);
        mAllCheese = mRepository.getmAllCheese();

    }

    LiveData<List<Cheese>> getmAllCheese(){
        return mAllCheese;
    }
}
