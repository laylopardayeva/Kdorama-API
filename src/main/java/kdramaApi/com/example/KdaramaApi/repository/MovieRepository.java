package kdramaApi.com.example.KdaramaApi.repository;

import kdramaApi.com.example.KdaramaApi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    // Standard JPA methods are inherited, custom methods can be defined here
}
