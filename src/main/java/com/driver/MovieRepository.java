package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;

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
        List<String> movies = new ArrayList<>();
        for (String movieName : movieMap.keySet()){
            movies.add(movieName);
        }
        return movies;
    }
    public void deleteDirectorByName(String director){
        List<String> movie=new ArrayList<>();
        if(mdMap.containsKey(director)){
            movie=mdMap.get(director);
            for(String m:movie){
                if(movieMap.containsKey(m)){movieMap.remove(m);}
            }
            directorMap.remove(director);
        }

        if(directorMap.containsKey(director)){directorMap.remove(director);}
    }

    public void deleteAllDirectors(){
        HashSet<String> set=new HashSet<>();
        for(String dir:mdMap.keySet()){
            for(String movie:mdMap.get(dir)) {
                set.add(movie);
                //directorMap.remove(dir);
                //mdMap.remove(dir);
            }
        }
        for (String movie:set){
            if(movieMap.containsKey(movie)){movieMap.remove(movie);}
        }
    }




}










