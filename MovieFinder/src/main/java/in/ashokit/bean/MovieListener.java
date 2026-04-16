package in.ashokit.bean;

import java.util.List;

//dependent class
public class MovieListener {
    private MovieFinder mf;

    //constructor
    public MovieListener(MovieFinder mf){
        this.mf = mf;
    }

    public void fetchMovies(int year){
        List<String> lst = mf.findMovies(year);
                if(lst!= null){
                    for(String str : lst){
                        System.out.println(str);
                    }
                }
                else {
                    System.out.println("The Given year is not valid");
                }
    }


}
