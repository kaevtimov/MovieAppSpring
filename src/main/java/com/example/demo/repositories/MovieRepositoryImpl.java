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
        movies.set(index, movie);
    }


    private Movie getMovie(int id){
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }


    private void loadMovies() {
        movies.add(new Movie(this.generator.getNextId(), "Lethal weapon", "Action/thriller", 1987, 0, 110, "https://ewedit.files.wordpress.com/2015/01/lethal-weapon.jpg", "Lethal Weapon is a 1987 American buddy cop action comedy film directed by Richard Donner, " +
                "and produced by Joel Silver, and written by Shane Black. It stars Mel Gibson and Danny Glover alongside Gary Busey, Tom Atkins, Darlene Love, and Mitchell Ryan. In Lethal Weapon, " +
                "a pair of mismatched LAPD detectives – Martin Riggs (Gibson), a former Green Beret who has become suicidal following the death of his wife, and Roger Murtaugh (Glover), a 50-year-old " +
                "veteran of the force – work together as partners.\n" +
                "\n" +
                "The film was released on March 6, 1987. Upon its release, Lethal Weapon grossed over $120 million (against a production budget of $15 million) and was nominated for the Academy Award for " +
                "Best Sound Mixing. It spawned a franchise that includes three sequels and a television series."));

        movies.add(new Movie(this.generator.getNextId(), "Die hard", "Action/thriller", 1988, 0, 132, "https://cdn-images-1.medium.com/max/1000/1*j12cZpY7JomaSH_ZRuiDdg.png", "Die Hard is a 1988 American action thriller[2] film directed by John McTiernan and written by Steven E. " +
                "de Souza and Jeb Stuart. It was produced by the Gordon Company and Silver Pictures, and distributed by 20th Century Fox.\n" +
                "\n" +
                "The film follows off-duty New York City Police Department officer John McClane (Bruce Willis) who is caught in a Los Angeles skyscraper during a Christmas Eve heist led by Hans Gruber " +
                "(Alan Rickman). It is based on Roderick Thorp's 1979 novel Nothing Lasts Forever, the sequel to 1966's The Detective, adapted into a 1968 film of the same name starring Frank Sinatra. Fox was " +
                "contractually obligated to offer Sinatra the lead role in Die Hard, but he turned it down; after Arnold Schwarzenegger declined to shoot the film as a sequel to his 1985 action film Commando, " +
                "Fox reluctantly gave the role to Willis, then known as a comedic television actor."));

        movies.add(new Movie(this.generator.getNextId(), "Beverly Hills Cop", "Action/comedy", 1984, 0, 105, "https://i0.wp.com/www.projectcasting.com/wp-content/uploads/2015/05/beverly-hills-cop.jpg?fit=618%2C412", "Beverly Hills Cop is a 1984 American action comedy film directed by Martin Brest, written by Daniel Petrie Jr. " +
                "and starring Eddie Murphy as Axel Foley, a street-smart Detroit cop who visits Beverly Hills, California to solve the murder of his best friend. Judge Reinhold, John Ashton, Ronny Cox, Lisa Eilbacher, Steven Berkoff and Jonathan Banks appear in supporting roles.\n" +
                "\n" +
                "This first film in the Beverly Hills Cop series shot Murphy to international stardom, won the People's Choice Award for \"Favorite Motion Picture\" and was nominated for both the Golden Globe Award for Best Motion Picture – Musical or Comedy and Academy Award for " +
                "Best Original Screenplay in 1985. It earned $234 million at the North American domestic box office, making it the highest-grossing film released in 1984 in the U.S."));

        movies.add(new Movie(this.generator.getNextId(), "The Librarian: Quest for the Spear", "Action/thriller/adventure", 2004, 0, 90, "https://fanart.tv/fanart/movies/14207/moviethumb/the-librarian-quest-for-the-spear-58ba898addbba.jpg","Flynn Carsen (Noah Wyle), a perpetual college student with 22 academic degrees,[1] is kicked out " +
                "of college by his professor, Harris (Mario Iván Martínez), who tells Flynn that he lacks real life experience and needs to experience life outside of college. Flynn's mother, Margie (Olympia Dukakis), is constantly worried about her son and encourages him to get a job, find a wife, and be happy."));

        movies.add(new Movie(this.generator.getNextId(), "Titanic", "Drama", 1997, 0, 195, "https://rmstitanichotel.co.uk/wp-content/uploads/2017/07/Rose-and-Jack-Movie-poster.jpg","Titanic is a 1997 American epic romance and disaster film directed, written, co-produced and co-edited by James Cameron. A fictionalized account of the sinking of the " +
                "RMS Titanic, it stars Leonardo DiCaprio and Kate Winslet as members of different social classes who fall in love aboard the ship during its ill-fated maiden voyage.\n" +
                "\n" +
                "Cameron's inspiration for the film came from his fascination with shipwrecks; he felt a love story interspersed with the human loss would be essential to convey the emotional impact of the disaster. Production began in 1995, when Cameron shot footage of the actual Titanic wreck."));

        movies.add(new Movie(this.generator.getNextId(), "Air Force One", "Action/thriller", 1997, 0, 126, "http://1.bp.blogspot.com/-UHXC1ChdE6Q/VAJJ7259UeI/AAAAAAAAEJo/WC3kgvwOnwU/s1600/max1331375232-front-cover.jpg","Air Force One is a 1997 American political action-thriller film written by Andrew W. Marlowe, and directed and co-produced by Wolfgang Petersen. " +
                "It is about a group of terrorists who hijack Air Force One, and the U.S. president's attempt to retake the plane, to rescue everybody.\n" +
                "\n" +
                "The film stars Harrison Ford and Gary Oldman, as well as Glenn Close, Xander Berkeley, William H. Macy, Dean Stockwell, and Paul Guilfoyle. A box office success with generally positive critical reviews, the film was one of the most popular action films of the 1990s."));

        movies.add(new Movie(this.generator.getNextId(), "The Lion King", "Animation/drama", 1994, 0, 88, "https://steamcdn-a.akamaihd.net/steam/apps/561120/header.jpg?t=1513876929","The Lion King is a 1994 American animated epic musical film produced by Walt Disney Feature Animation and released by Walt Disney Pictures." +
                " It is the 32nd Disney animated feature film, and the fifth animated film produced during a period known as the Disney Renaissance. The Lion King was directed by Roger Allers and Rob Minkoff, produced by Don Hahn, and has a screenplay credited to Irene Mecchi, Jonathan Roberts," +
                " and Linda Woolverton. Its original songs were written by composer Elton John and lyricist Tim Rice, with a score by Hans Zimmer. The film features an ensemble voice cast that includes Matthew Broderick, James Earl Jones, Jeremy Irons, Jonathan Taylor Thomas, Moira Kelly, " +
                "Nathan Lane, Ernie Sabella, Rowan Atkinson, Robert Guillaume, Madge Sinclair, Whoopi Goldberg, Cheech Marin, and Jim Cummings. The story takes place in a kingdom of lions in Africa and was influenced by William Shakespeare's Hamlet."));

        movies.add(new Movie(this.generator.getNextId(), "Braveheart", "Action/thriller/historical", 1995, 0, 178, "https://images-na.ssl-images-amazon.com/images/I/51knkrEbW8L.jpg", "Braveheart is a 1995 American epic war film directed by Mel Gibson, who stars as William Wallace, a late 13th-century Scottish warrior who led the " +
                "Scots in the First War of Scottish Independence against King Edward I of England. The story is inspired by Blind Harry's epic poem The Actes and Deidis of the Illustre and Vallyeant Campioun Schir William Wallace and was adapted for the screen by Randall Wallace.\n" +
                "\n" +
                "It grossed $210.4 million worldwide. Braveheart was nominated for ten Academy Awards at the 68th Academy Awards and won five: Best Picture, Best Director, Best Cinematography, Best Makeup, and Best Sound Editing. The film was criticised for inaccuracies regarding Wallace's title, love interests, and attire"));

        movies.add(new Movie(this.generator.getNextId(), "Interstellar", "Action/thriller/fantastic/sci-fi", 2014, 0, 169, "https://www.legendarytrips.com/wp-content/uploads/Interstellar_2014.jpg","Interstellar is a 2014 science fiction film directed, co-written, and co-produced by Christopher Nolan. It stars Matthew McConaughey, Anne Hathaway, Jessica Chastain, Bill Irwin, " +
                "Ellen Burstyn, and Michael Caine. Set in a dystopian future where humanity is struggling to survive, the film follows a group of astronauts who travel through a wormhole in search of a new home for humanity.\n" +
                "\n" +
                "Brothers Christopher and Jonathan Nolan wrote the screenplay, which had its origins in a script Jonathan developed in 2007. Christopher produced Interstellar with his wife, Emma Thomas, through their production company Syncopy, and with Lynda Obst through Lynda Obst Productions. Caltech theoretical " +
                "physicist Kip Thorne was an executive producer, acted as scientific consultant, and wrote a tie-in book, The Science of Interstellar. Paramount Pictures, Warner Bros., and Legendary Pictures co-financed the film. Cinematographer Hoyte van Hoytema shot it on 35 mm in anamorphic format and IMAX 70 mm. " +
                "Principal photography began in late 2013 and took place in Alberta (Canada), Iceland and Los Angeles. Interstellar uses extensive practical and miniature effects and the company Double Negative created additional digital effects."));

        movies.add(new Movie(this.generator.getNextId(), "Jumanji", "Comedy/adventure", 1995, 0, 104, "https://lh3.googleusercontent.com/oitmveeHup9us_Dm9V0qjcNJgr9StFBhro61917sKuDs8qnTamoy0w01xMc2zO8chjpotlNdG0_D","Jumanji is a 1995 American fantasy adventure film directed by Joe Johnston. It is an adaptation of the 1981 children's book of the same name by Chris Van Allsburg. The film was written" +
                " by Van Allsburg, Greg Taylor, Jonathan Hensleigh, and Jim Strain and stars Robin Williams, Bonnie Hunt, Kirsten Dunst, Bradley Pierce, Jonathan Hyde, Bebe Neuwirth, and David Alan Grier.\n" +
                "\n" +
                "The story centers on 12-year-old Alan Parrish, who becomes trapped in a board game while playing with his best friend Sarah Whittle in 1969. Twenty-six years later, in 1995, siblings Judy and Peter Shepherd find the game, begin playing and then unwittingly release the now-adult Alan. After tracking down " +
                "Sarah, the quartet resolve to finish the game in order to reverse all of the destruction it has caused."));

        movies.add(new Movie(this.generator.getNextId(), "Star Wars: Episode I – The Phantom Menace", "Action/thriller/sci-fi", 1999, 0, 133, "http://4.bp.blogspot.com/-Su0VnEjHXdc/U3RHnUFDSrI/AAAAAAAALGg/wMZXaKEaZ7U/s1600/237934.jpg", "Star Wars: Episode I – The Phantom Menace is a 1999 American epic space opera written and directed by George Lucas, produced by Lucasfilm and " +
                "distributed by 20th Century Fox. It is the first installment in the Star Wars prequel trilogy and stars Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Anthony Daniels, Kenny Baker, Pernilla August, and Frank Oz. The film is set 32 years before the original film, and follows " +
                "Jedi Knight Qui-Gon Jinn and his apprentice Obi-Wan Kenobi as they protect Queen Amidala, in hopes of securing a peaceful end to a large-scale interplanetary trade dispute. Joined by Anakin Skywalker—a young slave with unusually strong natural powers of the Force—they simultaneously " +
                "contend with the mysterious return of the Sith."));

        movies.add(new Movie(this.generator.getNextId(), "Finding Nemo", "Comedy/family", 2003, 0, 100, "https://cdn-images-1.medium.com/max/1600/1*Pg5wWwVLIS-X0dpMuwWzEw.jpeg", "Finding Nemo is a 2003 American computer-animated adventure film produced by Pixar Animation Studios and released by Walt Disney Pictures. Written and directed by Andrew Stanton " +
                "with co-direction by Lee Unkrich, the film stars the voices of Albert Brooks, Ellen DeGeneres, Alexander Gould, and Willem Dafoe. It tells the story of the overprotective ocellaris clownfish named Marlin who, along with a regal blue tang named Dory, searches for his abducted son Nemo all the way to Sydney" +
                " Harbour. Along the way, Marlin learns to take risks and comes to terms with Nemo taking care of himself.\n" +
                "\n"));

        movies.add(new Movie(this.generator.getNextId(), "Forrest Gump", "Adventure/comedy/drama", 1994, 0, 142, "https://cafebiz.cafebizcdn.vn/thumb_w/600/2015/tom-1441182009908.jpg", "Forrest Gump is a 1994 American romantic comedy-drama film based on Winston Groom’s 1986 novel of the same name. It was directed by Robert Zemeckis and written by Eric Roth, " +
                "and stars Tom Hanks, Robin Wright, Gary Sinise, Mykelti Williamson, and Sally Field. The story depicts several decades in the life of Forrest Gump (Hanks), a slow-witted but kind-hearted man from Alabama who witnesses several defining historical events in the 20th century in the United States.\n" +
                "\n"));

        movies.add(new Movie(this.generator.getNextId(), "The Mask", "Action/comedy", 1994, 0, 101, "https://i.ytimg.com/vi/YRAImdAcl5g/maxresdefault.jpg", "The Mask is a 1994 American dark fantasy superhero comedy film directed by Charles Russell, produced by Bob Engelman, and written by Mike Werb, based on the comic series of " +
                "the same name published by Dark Horse Comics. The film stars Jim Carrey, Peter Greene, Amy Yasbeck, Peter Riegert, Richard Jeni, Ben Stein, Joely Fisher, and Cameron Diaz in her film debut. It revolves around Stanley Ipkiss (Carrey), an unfortunate bank clerk who finds a magical mask that transforms " +
                "him into a green-faced superhero.\n" +
                "\n"));

        movies.add(new Movie(this.generator.getNextId(), "The Da Vinci Code", "Mysterious/thriller", 2006,0, 149, "https://lh3.googleusercontent.com/nzZzcmySolkaW0-LMCK44FZNbJ1oao7So4U_Sk0IdU-D_xSR2kIbo04gnqxrT6wDPf1b3M8XyHvJ", "The Da Vinci Code is a 2006 American mystery thriller film directed by Ron Howard, written by Akiva Goldsman, and based on Dan Brown's 2003 best-selling novel of the same name. " +
                "The first in the Robert Langdon film series, the film stars Tom Hanks, Audrey Tautou, Sir Ian McKellen, Alfred Molina, Jürgen Prochnow, Jean Reno, and Paul Bettany. In the film, Robert Langdon, a professor of religious iconography and symbology from Harvard University, is the prime suspect in the grisly and" +
                " unusual murder of Louvre curator Jacques Saunière. In the body, the police find a disconcerting cipher and start an investigation.[3] A noted British Grail historian named Sir Leigh Teabing tells them that the actual Holy Grail is explicitly encoded in Leonardo da Vinci's wall painting, The Last Supper." +
                " Also searching for the Grail is a secret cabal within Opus Dei, an actual prelature of the Holy See, who wish to keep the true Grail a secret to prevent the destruction of Christianity."));

        movies.add(new Movie(this.generator.getNextId(), "Space Jam", "Animation/comedy/sport", 1996, 0, 88, "https://vignette.wikia.nocookie.net/siivagunner/images/3/3d/GET_READY_TO_JAM.jpg/revision/latest?cb=20160812154030", "Space Jam is a 1996 American live-action/animated sports comedy film starring basketball player Michael Jordan and featuring the Looney Tunes cartoon characters. The film was " +
                "produced by Ivan Reitman, and directed by Joe Pytka. Nigel Miguel was a basketball technical advisor.[3] Space Jam presents an alternate history of what happened between Jordan's initial retirement from the NBA in 1993 and his comeback in 1995, in which he is enlisted by Bugs Bunny and his friends " +
                "to help them win a basketball match against a group of aliens who want to enslave them for their amusement park. The film also serves to introduce a new Looney Tunes character, Bugs' love interest Lola Bunny."));

        movies.add(new Movie(this.generator.getNextId(), "Goodfellas", "Action/thriller", 1990, 0, 145, "http://data.logograph.com/resize/LyricTheatre/multimedia/Image/13423/SOFM%202018%20900x600%20Goodfellas.jpg?width=1500", "Goodfellas (stylized as GoodFellas) is a 1990 American crime film directed by Martin Scorsese. It is an adaptation of the 1986 non-fiction book Wiseguy by Nicholas Pileggi, " +
                "who co-wrote the screenplay with Scorsese. The film narrates the rise and fall of mob associate Henry Hill and his friends and family from 1955 to 1980.\n" +
                "\n" +
                "Scorsese initially titled the film Wise Guy and postponed making it; later, he and Pileggi changed the title to Goodfellas. To prepare for their roles in the film, Robert De Niro, Joe Pesci, and Ray Liotta often spoke with Pileggi, who shared research material left over from writing the book. " +
                "According to Pesci, improvisation and ad-libbing came out of rehearsals wherein Scorsese gave the actors freedom to do whatever they wanted. The director made " +
                "transcripts of these sessions, took the lines he liked best and put them into a revised script, which the cast worked from during principal photography."));

        movies.add(new Movie(this.generator.getNextId(), "Heat", "Action/thriller", 1995, 0, 170, "https://cdn3.movieweb.com/i/article/fzqPXd4i43Kj4HHeojdyJDN4QIiiFX/1200:100/Heat-Movie-Prequel-Novel-Michael-Mann.jpg", "Heat is a 1995 American crime film written, co-produced and directed by Michael Mann, and starring Al Pacino, Robert De Niro and Val Kilmer. De Niro plays Neil McCauley, " +
                "a professional thief, while Pacino plays Lt. Vincent Hanna, a LAPD robbery-homicide detective tracking down McCauley's crew. The story is based on the former Chicago police officer Chuck Adamson's pursuit during the 1960s of a criminal named McCauley, after whom De Niro's character is named." +
                " Heat is a remake by Mann of an unproduced television series he had worked on, the pilot of which was released as the TV movie L.A. Takedown in 1989."));

        movies.add(new Movie(this.generator.getNextId(), "Tombstone", "Action/thriller/western", 1993, 0, 144, "https://s22658.pcdn.co/wp-content/uploads/2016/08/F_Reel_WEB_Tombstone-Val-Kilmer-Sam-Elliott-Bill-Paxton-Kurt-Russell_scaled.jpg", "Tombstone is a 1993 American Western film directed by George P. Cosmatos, written by Kevin Jarre (who was also the original director, but was replaced early in production)," +
                " and starring Kurt Russell and Val Kilmer, with Sam Elliott, Bill Paxton, Powers Boothe, Michael Biehn, and Dana Delany in supporting roles, as well as narration by Robert Mitchum.\n" +
                "\n" +
                "The film is based on events in Tombstone, Arizona, including the Gunfight at the O.K. Corral and the Earp Vendetta Ride, during the 1880s. It depicts a number of Western outlaws and lawmen, such as Wyatt Earp, William Brocius, Johnny Ringo, and Doc Holliday.\n" +
                "\n" +
                "Tombstone was released by Hollywood Pictures in theatrical wide release in the United States on December 25, 1993, grossing $56.5 million in domestic ticket sales. The film was a financial success, and for the Western genre, it ranks number " +
                "16 in the list of highest-grossing films since 1979. Critical reception was generally positive."));

        movies.add(new Movie(this.generator.getNextId(), "The hangover", "Comedy", 2009, 0, 100, "https://www.vintagemovieposters.co.uk/wp-content/uploads/2015/07/hangoverquadlarge1.jpg", "The Hangover is a 2009 American comedy film directed by Todd Phillips, co-produced with Daniel Goldberg, and written by Jon Lucas and Scott Moore. " +
                "It is the first installment in The Hangover trilogy. The film stars Bradley Cooper, Ed Helms, Zach Galifianakis, Heather Graham, Justin Bartha, and Jeffrey Tambor. It tells the story of Phil Wenneck, Stu Price, Alan Garner, and Doug Billings, who travel to Las Vegas for a " +
                "bachelor party to celebrate Doug's impending marriage. However, Phil, Stu, and Alan wake up with Doug missing and no memory of the previous night's events, and must find the groom before the wedding can take place."));

    }
}
