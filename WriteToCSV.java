import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteToCSV {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV fil header
    private static final String FILE_HEADER = "MovieTitle, Country , Director, TitleYear";

    public static void writeCsvFile(String Filename) {

        //opretter new movie objects
        Movie movie1 = new Movie("hej", "danmark", "john", "1996");
        Movie movie2 = new Movie("titanic", "sverige", "Said", "2000");


        //opretter ny list af movie objects
        List movies = new ArrayList();
         movies.add(movie1);
         movies.add(movie2);


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            //skriver CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add en ny line separator efter header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //skriv en ny student object list til CSV file
            for (Movie movie : movies) {
                fileWriter.append(String.valueOf(movie.getMovieTitle()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movie.getCountry());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movie.getDirector());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movie.getTitleYear());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }



            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }

}
