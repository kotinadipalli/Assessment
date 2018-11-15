package in.androidmate.anujgupta.movify.ui.main;

import in.androidmate.anujgupta.movify.models.MovieResponse;
import in.androidmate.anujgupta.movify.models.Response;

/**
 * Created by anujgupta on 26/12/17.
 */

public interface MainViewInterface {

    void showToast(String s);
    void showProgressBar();
    void hideProgressBar();
    void displayMovies(Response movieResponse);
    void displayError(String s);
}
