public class Movie {
    String movieTitle;
    String country;
    String director;
    String titleYear;

    public Movie(String movieTitle, String country, String director, String titleYear) {
        this.movieTitle = movieTitle;
        this.country = country;
        this.director = director;
        this.titleYear = titleYear;
    }

    void printMovie(){
        System.out.println("Title:" + movieTitle + "Country:" + country + " Director:" + director + " Year:" + titleYear);
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitleYear() {
        return titleYear;
    }

    public void setTitleYear(String titleYear) {
        this.titleYear = titleYear;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", country='" + country + '\'' +
                ", director='" + director + '\'' +
                ", titleYear='" + titleYear + '\'' +
                '}';
    }
}

