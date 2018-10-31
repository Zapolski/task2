import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public class ProgramExercise {

    public static String str1;
    public static String str2;

    public static void main(String[] args) {

        readTwoStringFromFile("task1.txt");

        StringComparator sc = new StringComparator();
        ArrayList<String> result = sc.stringCompare(str1,str2);
        System.out.println("Задача №1:\nСтрока 1: "+str1+"\n"+"Строка 2: "+str2);
        System.out.println("Слова из первой строки, отсутствующие во второй: "+result);
        System.out.println();

        readTwoStringFromFile("task2.txt");
        System.out.println("Задача №2:\nСтрока 1: "+str1+"\n"+"Искомое слово: "+str2);
        WordWithStringComparator wordWithStringComparator = new WordWithStringComparator();
        int counWord = wordWithStringComparator.wordStringComparator(str1,str2);
        int counPunctuation = wordWithStringComparator.countPunctuation(str1);
        System.out.println("Искомое слово в строке встречается "+counWord+" раз(а).");
        System.out.println("Количество знаков препинания в строке: "+counPunctuation);
        System.out.println();



        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model = null;
        try {
            model = reader.read(new FileReader("pom.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        System.out.println("Задача №3:");
        System.out.print("Значение переменной ENV из POM.xml: ");
        System.out.println(model.getProperties().getProperty("ENV"));


    }

    public static void readTwoStringFromFile(String fileName){
        try {
            ClassLoader classLoader = (new ProgramExercise()).getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            BufferedReader br = new BufferedReader(new FileReader(file));
            str1 = br.readLine();
            str2 = br.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
