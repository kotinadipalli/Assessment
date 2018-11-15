package in.androidmate.anujgupta.movify.ui.main;


import android.util.Log;

import in.androidmate.anujgupta.movify.models.MovieResponse;
import in.androidmate.anujgupta.movify.models.Response;
import in.androidmate.anujgupta.movify.network.NetworkClient;
import in.androidmate.anujgupta.movify.network.NetworkInterface;
import in.androidmate.anujgupta.movify.ui.main.MainPresenterInterface;
import in.androidmate.anujgupta.movify.ui.main.MainViewInterface;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainPresenterInterface {

    MainViewInterface mvi;
    private String TAG = "MainPresenter";

    public MainPresenter(MainViewInterface mvi) {
        this.mvi = mvi;
    }

    @Override
    public void getMovies() {
        getObservable().subscribeWith(getObserver());
    }

    public Observable<Response> getObservable(){
        return NetworkClient.getRetrofit().create(NetworkInterface.class)
                            .getSections(7,"aea8b7c7a56e4bdd994a1325a61869ec")
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
    }

    public DisposableObserver<Response> getObserver(){
        return new DisposableObserver<Response>() {

            @Override
            public void onNext(@NonNull Response movieResponse) {
                Log.d(TAG,"OnNext"+movieResponse.getResults());
                mvi.displayMovies(movieResponse);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG,"Error"+e);
                e.printStackTrace();
                mvi.displayError("Error fetching Movie Data");
            }

            @Override
            public void onComplete() {
                Log.d(TAG,"Completed");
                mvi.hideProgressBar();
            }
        };
    }
}
