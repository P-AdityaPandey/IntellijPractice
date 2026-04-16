package in.ashokit.bean;

import java.util.HashMap;
import java.util.List;

//dependency class
public class MovieFinder {
    HashMap<Integer, List<String>>movieMap;

    //no-args constructor
    public MovieFinder(){
        movieMap = new HashMap<>();
        movieMap.put(2023, List.of("Openhimer","Pathan","Jawan"));
        movieMap.put(2024, List.of("Dune","Inside Out 2","The Fall Guy"));
        movieMap.put(2025, List.of("Avatar","Sikandar","Housefull"));

        public List<String> findMovies(int year){
            return movieMap.get(year);
        }

    }

}
