import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringComparator {

    public ArrayList<String> stringCompare(String str1, String str2){

        if ((str1==null)||(str2==null))return null;

        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> list1 =  new ArrayList<String>(Arrays.asList(str1.split(" ")));
        ArrayList<String> list2 =  new ArrayList<String>(Arrays.asList(str2.split(" ")));

        for (String s: list1){
            if (!(list2.contains(s))){
                result.add(s);
            }
        }

        return result;
    }

}
