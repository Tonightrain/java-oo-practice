package com.twu.view;

import com.twu.entity.User;
import java.util.Scanner;

public class View {
    private static Scanner in = new Scanner(System.in);
    private static User user;

    //欢迎页
    public static void welcome() {
        System.out.println("欢迎来到热搜排行榜，您的角色是？");
        System.out.println("1.用户");
        System.out.println("2.管理员");
        System.out.println("3.退出");
    }

    //输入昵称
    public static void enterName(){
        System.out.println("请输入您的昵称：");
    }

    //输入密码
    public static void enterPassword(){
        System.out.println("请输入您的密码");
    }

    public static void pwdException(){
        System.out.println("用户名或密码错误");
    }

    //普通用户登录后界面
    public static void choose1(){
        System.out.println("你好,你可以选择：");
        System.out.println("1.查看热搜排行榜");
        System.out.println("2.添加热搜");
        System.out.println("3.给热搜事件投票");
        System.out.println("4.购买热搜");
        System.out.println("5.退出");
    }

    //管理员登录后界面
    public static void choose2(){
        System.out.println("你好，你可以选择：");
        System.out.println("1.查看热搜排行榜");
        System.out.println("2.添加热搜");
        System.out.println("3.添加超级热搜");
        System.out.println("4.退出");
    }

    public static void hotSearchList() {
        System.out.print("热搜名称\t\t\t\t");
        System.out.println("所得票数");
    }

    public static void bye(){
        System.out.println("谢谢您的使用，再见！");
    }

    public static void exception(){
        System.out.println("请输入正确的操作序号！");
    }
}
