package com.twu.Utils;

import com.twu.DataBase.DataBase;
import com.twu.entity.HotSearch;
import com.twu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    private List<User> userList = DataBase.getUserList();
    private List<HotSearch> hotSearchList = DataBase.getHotSearchList();

    public List<User> getUserList(){
        return userList;
    }

    //添加热搜
    public void addHotSearch(HotSearch hotSearch){
        hotSearchList.add(hotSearch);
    }


    //展示全部热搜
    public List<HotSearch> getHotSearchList(){
        return hotSearchList;
    }

    //得到id为uid的用户
    public User getUser(int uid){
        for (User user :userList){
            if (user.getId() == uid){
                return user;
            }
        }
        return null;
    }

    //得到内容为content的热搜
    public HotSearch getHotSearch(String content){
        for (HotSearch hotSearch:hotSearchList){
            if (hotSearch.getContent().equals(content)){
                return hotSearch;
            }
        }
        return null;
    }
}
