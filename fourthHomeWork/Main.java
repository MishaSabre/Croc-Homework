import java.io.*;
import java.util.Scanner;

/**
 *
 *   In a text file, words can be separated by one or more spaces, or line feed characters.
 *   It is necessary to implement a program that counts the number of words in a file and displays the result on the screen.
 *   @author MishaSabre (Sablin Mikhail)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = new String(scanner.nextLine());
        /*
        If user didn't input path to file throw IllegalArgumentException
         */
        if (s.isEmpty()){
            throw new IllegalArgumentException();
        }
        try {
            File file = new File(s);

            /*
            Check exist file or not
             */
            if(file.exists()) {
                StringBuilder sb = new StringBuilder();
                FileReader fr = new FileReader(file);
                Scanner sc = new Scanner(fr);
                /*
                Reading file while that have line
                 */
                while (sc.hasNextLine()){
                    sb.append(sc.nextLine()).append(" ");
                }

                /*
                That regex replace all non-words and non-space by nothing
                 */
                String a  = sb.toString().replaceAll("[^A-Za-zА-Яа-я\\s]", "");

                /*
                In that regex replace all spaces in conclusion we have only words
                 */
                String[] str = a.split("\\s+");


                System.out.println(str.length);
            }else{
                System.out.println("File isn't exist in directory");
            }
        }catch (FileNotFoundException ex){}
    }
}
