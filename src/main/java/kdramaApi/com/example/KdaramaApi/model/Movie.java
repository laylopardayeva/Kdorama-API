package kdramaApi.com.example.KdaramaApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    public Movie() {
    }

    public Movie(Long id,  String title, String releaseDate, String trailerLink, String poster) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
    }

        // Getters and Setters
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }

    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public String getReleaseDate() {
            return releaseDate;
        }
    
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }
    
        public String getTrailerLink() {
            return trailerLink;
        }
    
        public void setTrailerLink(String trailerLink) {
            this.trailerLink = trailerLink;
        }
    
        public String getPoster() {
            return poster;
        }
    
        public void setPoster(String poster) {
            this.poster = poster;
        }
}
