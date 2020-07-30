package com.twu.service;

import com.twu.Utils.DBUtils;
import com.twu.controller.HotSearchController;
import com.twu.controller.OptionController;
import com.twu.entity.HotSearch;
import com.twu.view.View;

import java.util.*;

public class OptionService {
    private Scanner in = new Scanner(System.in);
    private DBUtils dbUtils = new DBUtils();
    private  int uid = LoginService.uid;
    private HotSearchController hotSearchController = new HotSearchController();

    //用户查看热搜榜
    public void queryHotSearch1(){
        List<HotSearch> hotSearchList = dbUtils.getHotSearchList();
        hotSearchList.sort(Comparator.reverseOrder());
        View.hotSearchList();
        for(HotSearch hotSearch : hotSearchList){
            System.out.println(hotSearch);
        }
     //   View.choose1();
        OptionController.option1();
    }

    //管理员查看热搜榜
    public void queryHotSearch2(){
        List<HotSearch> hotSearchList = dbUtils.getHotSearchList();
        hotSearchList.sort(Comparator.reverseOrder());
        View.hotSearchList();
        for(HotSearch hotSearch : hotSearchList){
            System.out.println(hotSearch);
        }
    //    View.choose2();
        OptionController.option2();
    }

    //用户新增热搜
    public void addHotSearch1(){
        System.out.println("请输入你要添加热搜的内容：");
        String content = in.nextLine();
        HotSearch hotSearch = new HotSearch(content,0, 1);
        dbUtils.addHotSearch(hotSearch);
        System.out.println("添加成功！");
     //   View.choose1();
        OptionController.option1();
    }

    //管理员新增热搜
    public void addHotSearch2(){
        System.out.println("请输入你要添加热搜的内容：");
        String content = in.nextLine();
        HotSearch hotSearch = new HotSearch(content,0, 1);
        dbUtils.addHotSearch(hotSearch);
        System.out.println("添加成功！");
    //    View.choose2();
        OptionController.option2();
    }

    //用户给热搜投票
    public void voteHotSearch(){
        if (dbUtils.getUser(uid).getVote()<=0){
            System.out.println("您的票数已用完");
            OptionController.option1();
        }
        System.out.println("请输入你要投票热搜的名称：");
        String content = in.nextLine();
        if (dbUtils.getHotSearch(content)==null){
            System.out.println("该热搜不存在");
            OptionController.option1();
        }
        System.out.println("请输入你要投票的票数：(您目前还有："+dbUtils.getUser(uid).getVote()+"票)");
        int vote = in.nextInt();
        if (vote>dbUtils.getUser(uid).getVote()){
            System.out.println("投票数不能大于"+dbUtils.getUser(uid).getVote()+"票");
            OptionController.option1();
        }
        dbUtils.getUser(uid).setVote(dbUtils.getUser(uid).getVote()-vote);
        if (dbUtils.getHotSearch(content).getIsSuper()==1) {
            dbUtils.getHotSearch(content).setHeat(dbUtils.getHotSearch(content).getHeat() + vote);
        }else {
            dbUtils.getHotSearch(content).setHeat(dbUtils.getHotSearch(content).getHeat() + vote*2);
        }
        System.out.println("投票成功！");
        OptionController.option1();
    }

    //用户买热搜
    public void buyHotSearch(){
        System.out.println("请输入你想购买的热搜名称：");
        String content = in.nextLine();
        if (dbUtils.getHotSearch(content)==null){
            System.out.println("该热搜不存在");
            OptionController.option1();
        }
        System.out.println("请输入你要购买的热搜排名：");
        int rank = in.nextInt();
        System.out.println("请输入你要购买的热搜金额：");
        int count = in.nextInt();
        System.out.println("购买成功！");
        OptionController.option1();
    }

    //添加超级热搜
    public void addSuperHotSearch(){
        System.out.println("请输入你要添加的超级热搜的内容：");
        String content = in.nextLine();
        HotSearch hotSearch = new HotSearch(content,0, 2);
        dbUtils.addHotSearch(hotSearch);
        System.out.println("超级热搜添加成功！");
        OptionController.option2();
    }
}
