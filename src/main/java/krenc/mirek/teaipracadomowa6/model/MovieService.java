package krenc.mirek.teaipracadomowa6.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movieList;

    public MovieService() {
        this.movieList = new ArrayList<>();
        this.movieList.add(new Movie("Kiler", "Studio Filmowe Zebra", 1997));
    }

    public void addMovie(Movie movie)
    {
        this.movieList.add(movie);
    }

    public List<Movie> getAllMovies()
    {
        return this.movieList;
    }
}
