package kdramaApi.com.example.KdaramaApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kdramaApi.com.example.KdaramaApi.model.Movie;
import kdramaApi.com.example.KdaramaApi.service.KdramaService;

@RestController
@RequestMapping("/api/doramas")      // URL for all methods
public class KdramaController {

    @Autowired
    private KdramaService kdramaService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return kdramaService.findAllMovies();
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return kdramaService.findMovieById(id)
                .map(ResponseEntity::ok)  // If movie is found, wrap it in a ResponseEntity with OK status
                .orElseGet(() -> ResponseEntity.notFound().build());  // If not found, return Not Found status
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return kdramaService.saveMovie(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        if (kdramaService.findMovieById(id).isPresent()) {
            movie.setId(id);
            return ResponseEntity.ok(kdramaService.saveMovie(movie));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        if (kdramaService.findMovieById(id).isPresent()) {
            kdramaService.deleteMovie(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
