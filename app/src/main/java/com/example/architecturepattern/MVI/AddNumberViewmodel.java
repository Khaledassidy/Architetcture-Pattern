package com.example.architecturepattern.MVI;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.nio.channels.Channel;

public class AddNumberViewmodel extends ViewModel {

    private final MutableLiveData<Viewstate> viewState = new MutableLiveData<>(new Idle());

    public LiveData<Viewstate> getViewState() {
        return viewState;
    }

    //process
    public void processIntent(mainIntent intent){
        if (intent instanceof AddNumber) {
            handleIncrement();

    }


}
    //reduce
    private void handleIncrement() {
        Viewstate currentState = viewState.getValue();
        if (currentState instanceof Number) {
            int newCount = ((Number) currentState).getNumber() + 1;
            viewState.setValue(new Number(newCount));
        } else if (currentState instanceof Error){
            viewState.setValue(new Error("error"));
        } else if (currentState instanceof Idle) {
            viewState.setValue(new Number(1));


        }
    }

}
