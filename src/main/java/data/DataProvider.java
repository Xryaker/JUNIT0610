package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider {
    static List<User> userList=new ArrayList<>();
    static {
        userList.add(new User("Vasiliy","emai.@u.com","20147890"));
        userList.add(new User("Nikolay","emai.@u.com","20147890"));
        userList.add(new User("Valeriy","emai.@u.com","20147890"));
        userList.add(new User("Victor","emai.@u.com","20147890"));
    }
    public static User getRandomUser(){
        return userList.get(new Random().nextInt(userList.size()));
    }
    public static List<User> getUserList(){
        return userList;
    }

}
