package krenc.mirek.teaipracadomowa6.controler;

import krenc.mirek.teaipracadomowa6.aop.NewRecordAdded;
import krenc.mirek.teaipracadomowa6.model.Movie;
import krenc.mirek.teaipracadomowa6.model.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MovieAPI {

    private MovieService movieService;

    @Autowired
    public MovieAPI(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity getMovies() {
        return new ResponseEntity(movieService.getAllMovies(), HttpStatus.OK);
    }

    @PostMapping
    @NewRecordAdded
    public void addMovie(@RequestBody Movie movie)
    {
        System.out.println(movie);
        this.movieService.addMovie(movie);
    }


}
