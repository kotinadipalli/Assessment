package in.androidmate.anujgupta.movify.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import in.androidmate.anujgupta.movify.R;
import in.androidmate.anujgupta.movify.models.Result;

/**
 * Created by anujgupta on 26/12/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesHolder> {

    List<Result> sectionsList;
    Context context;

    OnClickListener onClickListener;

    public MoviesAdapter(List<Result> sectionsList, Context context, OnClickListener onClickListener) {
        this.sectionsList = sectionsList;
        this.context = context;
        this.onClickListener = onClickListener;
    }

    @Override
    public MoviesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_movies, parent, false);
        MoviesHolder mh = new MoviesHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(MoviesHolder holder, int position) {

        holder.tvTitle.setText(sectionsList.get(position).getTitle());
//        holder.tvOverview.setText(movieList.get(position).getOverview());
        holder.tvReleaseDate.setText(sectionsList.get(position).getPublishedDate());
//        Glide.with(context).load("https://image.tmdb.org/t/p/w500/"+movieList.get(position).getPosterPath()).into(holder.ivMovie);
    }

    @Override
    public int getItemCount() {
        return sectionsList.size();
    }

    public class MoviesHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvTitle, tvOverview, tvReleaseDate;
        ImageView ivMovie;
        CardView cardView;

        public MoviesHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvOverview = (TextView) v.findViewById(R.id.tvOverView);
            tvReleaseDate = (TextView) v.findViewById(R.id.tvReleaseDate);
            ivMovie = (ImageView) v.findViewById(R.id.ivMovie);
            cardView = (CardView) v.findViewById(R.id.cardview);

            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickListener.clickedOnItem(sectionsList.get(getAdapterPosition()));
        }
    }

    public interface OnClickListener{

        void clickedOnItem(Result result);
    }
}
