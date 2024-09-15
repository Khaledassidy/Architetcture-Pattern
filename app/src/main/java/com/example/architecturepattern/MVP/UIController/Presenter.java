package com.example.architecturepattern.MVP.UIController;

import com.example.architecturepattern.MVP.Model.Model;

public class Presenter {

    MovieView view;

    public Presenter(MovieView view){
        this.view=view;
    }

    public Model getMovieFromDatabse(){
        return new Model("breaking bad","2002","very nice",1);

    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabse().getName());
    }
}
