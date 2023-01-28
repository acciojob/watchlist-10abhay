package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class MovieRepository {
    Map<String,Movie> movieMap=new HashMap<>();
    Map<String,Director> directorMap=new HashMap<>();
    Map<String,List<String>> mdMap=new HashMap<>();

    public void addMovie(Movie movie){
        movieMap.put(movie.getName(),movie);
    }
    public void addDirector(Director director){
        directorMap.put(director.getName(),director);
    }
    public void addMovieDirectorPair(String movie,String director){
        if(movieMap.containsKey(movie) && directorMap.containsKey(director)) {
            List<String> currMovie=new ArrayList<>();
            if(mdMap.containsKey(director)){currMovie=mdMap.get(director);}
            currMovie.add(movie);
            mdMap.put(director,currMovie);
        }

    }

    public Movie getMovieByName(String movie){
        return movieMap.get(movie);
    }
    public Director getDirectorByName(String director){
        return directorMap.get(director);
    }

    public List<String> getMoviesByDirectorName(String director){
        return mdMap.get(director);
    }

    public List<String> findAllMovies(){
        return (List<String>) movieMap.keySet();
    }
    public void deleteDirectorByName(String name){
        directorMap.remove(name);
    }



}
