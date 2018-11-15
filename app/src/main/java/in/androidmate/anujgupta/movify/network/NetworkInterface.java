package in.androidmate.anujgupta.movify.network;


import in.androidmate.anujgupta.movify.models.Response;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by anujgupta on 26/12/17.
 */

public interface NetworkInterface {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/{period}.json")
    Observable<Response> getSections(@Path(value = "period") int period, @Query("api_key") String api_key);

}
