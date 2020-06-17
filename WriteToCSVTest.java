public class WriteToCSVTest {
    public static void main(String[] args) {

        String fileName = System.getProperty("user.home") + "/student.csv";

        System.out.println("Write CSV file:");
        WriteToCSV.writeCsvFile(fileName);

    }
}
