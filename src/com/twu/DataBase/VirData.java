package com.twu.DataBase;

import com.twu.entity.HotSearch;
import com.twu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class VirData {
    private static User user1 = new User(1,"Danger","123456",10);
    private static User user2 = new User(2,"Maggie","123456",10);

    public static void user(){
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        DataBase.setUserList(userList);
    }

    public static void hotSearch(){
        List<HotSearch> hotSearchList = new ArrayList<>();
    }
}
