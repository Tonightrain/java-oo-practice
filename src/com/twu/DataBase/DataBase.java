package com.twu.DataBase;

import com.twu.entity.HotSearch;
import com.twu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static List<User> userList = new ArrayList<>();  //用户表
    private static List<HotSearch> hotSearchList = new ArrayList<>(); //热搜表

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        DataBase.userList = userList;
    }

    public static List<HotSearch> getHotSearchList() {
        return hotSearchList;
    }

    public static void setHotSearchList(List<HotSearch> hotSearchList) {
        DataBase.hotSearchList = hotSearchList;
    }
}
