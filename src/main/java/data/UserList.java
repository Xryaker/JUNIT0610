package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserList {
    public static List<String> positiveListUsers(){
        List<String> list=new ArrayList<>();
        list.add("Kate");
        list.add("Nikolay");
        return list;
    }
    public static List<String>  getNegative(){
        return new ArrayList<>();
    }
}
