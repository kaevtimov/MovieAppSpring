package com.example.demo.repositories;

import com.example.demo.models.Movie;
import com.example.demo.repositories.base.MovieRepository;
import com.example.demo.utils.IdGenerator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private List<Movie> movies;
    private IdGenerator generator;


    public MovieRepositoryImpl(){
        this.generator = new IdGenerator();
        this.movies = new ArrayList<>();
        loadMovies();
    }


    @Override
    public List<Movie> getAllMovies() {
        return this.movies;
    }

    @Override
    public Movie getMovieById(int id) {
        return getMovie(id);
    }

    @Override
    public void create(Movie movie) {
        movie.setId(generator.getNextId());
        this.movies.add(movie);
    }

    @Override
    public void delete(int id) {
        Movie movie = getMovie(id);
        movies.remove(movie);
    }

    @Override
    public void updateMovie(int id, Movie movie) {
        Movie m = getMovie(id);
        int index = movies.indexOf(m);
        movies.set(index, m);
    }


    private Movie getMovie(int id){
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }


    private void loadMovies() {
        movies.add(new Movie(this.generator.getNextId(), "Lethal weapon", 1987, 0, 110, null, "Lethal Weapon is a 1987 American buddy cop action comedy film directed by Richard Donner, " +
                "and produced by Joel Silver, and written by Shane Black. It stars Mel Gibson and Danny Glover alongside Gary Busey, Tom Atkins, Darlene Love, and Mitchell Ryan. In Lethal Weapon, " +
                "a pair of mismatched LAPD detectives – Martin Riggs (Gibson), a former Green Beret who has become suicidal following the death of his wife, and Roger Murtaugh (Glover), a 50-year-old " +
                "veteran of the force – work together as partners.\n" +
                "\n" +
                "The film was released on March 6, 1987. Upon its release, Lethal Weapon grossed over $120 million (against a production budget of $15 million) and was nominated for the Academy Award for " +
                "Best Sound Mixing. It spawned a franchise that includes three sequels and a television series."));

        movies.add(new Movie(this.generator.getNextId(), "Die hard", 1988, 0, 132, null, "Die Hard is a 1988 American action thriller[2] film directed by John McTiernan and written by Steven E. " +
                "de Souza and Jeb Stuart. It was produced by the Gordon Company and Silver Pictures, and distributed by 20th Century Fox.\n" +
                "\n" +
                "The film follows off-duty New York City Police Department officer John McClane (Bruce Willis) who is caught in a Los Angeles skyscraper during a Christmas Eve heist led by Hans Gruber " +
                "(Alan Rickman). It is based on Roderick Thorp's 1979 novel Nothing Lasts Forever, the sequel to 1966's The Detective, adapted into a 1968 film of the same name starring Frank Sinatra. Fox was " +
                "contractually obligated to offer Sinatra the lead role in Die Hard, but he turned it down; after Arnold Schwarzenegger declined to shoot the film as a sequel to his 1985 action film Commando, " +
                "Fox reluctantly gave the role to Willis, then known as a comedic television actor."));

        movies.add(new Movie(this.generator.getNextId(), "Beverly Hills Cop", 1984, 0, 105, null, "Beverly Hills Cop is a 1984 American action comedy film directed by Martin Brest, written by Daniel Petrie Jr. " +
                "and starring Eddie Murphy as Axel Foley, a street-smart Detroit cop who visits Beverly Hills, California to solve the murder of his best friend. Judge Reinhold, John Ashton, Ronny Cox, Lisa Eilbacher, Steven Berkoff and Jonathan Banks appear in supporting roles.\n" +
                "\n" +
                "This first film in the Beverly Hills Cop series shot Murphy to international stardom, won the People's Choice Award for \"Favorite Motion Picture\" and was nominated for both the Golden Globe Award for Best Motion Picture – Musical or Comedy and Academy Award for " +
                "Best Original Screenplay in 1985. It earned $234 million at the North American domestic box office, making it the highest-grossing film released in 1984 in the U.S."));

        movies.add(new Movie(this.generator.getNextId(), "The Librarian: Quest for the Spear", 2004, 0, 90, null,"Flynn Carsen (Noah Wyle), a perpetual college student with 22 academic degrees,[1] is kicked out " +
                "of college by his professor, Harris (Mario Iván Martínez), who tells Flynn that he lacks real life experience and needs to experience life outside of college. Flynn's mother, Margie (Olympia Dukakis), is constantly worried about her son and encourages him to get a job, find a wife, and be happy."));

        movies.add(new Movie(this.generator.getNextId(), "Titanic", 1997, 0, 195, null,"Titanic is a 1997 American epic romance and disaster film directed, written, co-produced and co-edited by James Cameron. A fictionalized account of the sinking of the " +
                "RMS Titanic, it stars Leonardo DiCaprio and Kate Winslet as members of different social classes who fall in love aboard the ship during its ill-fated maiden voyage.\n" +
                "\n" +
                "Cameron's inspiration for the film came from his fascination with shipwrecks; he felt a love story interspersed with the human loss would be essential to convey the emotional impact of the disaster. Production began in 1995, when Cameron shot footage of the actual Titanic wreck."));

        movies.add(new Movie(this.generator.getNextId(), "Air Force One", 1997, 0, 126, null,"Air Force One is a 1997 American political action-thriller film written by Andrew W. Marlowe, and directed and co-produced by Wolfgang Petersen. " +
                "It is about a group of terrorists who hijack Air Force One, and the U.S. president's attempt to retake the plane, to rescue everybody.\n" +
                "\n" +
                "The film stars Harrison Ford and Gary Oldman, as well as Glenn Close, Xander Berkeley, William H. Macy, Dean Stockwell, and Paul Guilfoyle. A box office success with generally positive critical reviews, the film was one of the most popular action films of the 1990s."));


    }
}
