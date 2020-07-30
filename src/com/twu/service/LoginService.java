package com.twu.service;

import com.twu.Utils.DBUtils;
import com.twu.controller.OptionController;
import com.twu.entity.User;
import com.twu.view.View;

import java.util.List;
import java.util.Scanner;

public class LoginService {
    private static Scanner in = new Scanner(System.in);
    //记录当前登录用户
    public static int uid;
    private DBUtils dbUtils = new DBUtils();
    private User user;

    //选择用户角色
    public static void index(){
        int option = in.nextInt();
        if (option == 1 ){
            LoginService loginService = new LoginService();
            loginService.login1();
        }else if (option == 2){
            LoginService loginService = new LoginService();
            loginService.login2();
        } else if (option == 3){
            View.bye();
        }else {
            View.exception();
            View.welcome();
        }
    }

    private void login1(){
        List<User> userList = dbUtils.getUserList();
        System.out.println("请输入您的账号：");
        uid = in.nextInt();
        System.out.println("请输入密码：");
        String password = in.next();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (uid==user.getId() && password.equals(user.getPassword())){
                loginSucceed1();
                break;
            } else{
                View.pwdException();
                loginFailed();
            }
        }
    }

    private void login2(){
        List<User> userList = dbUtils.getUserList();
        System.out.println("请输入您的账号：");
        uid = in.nextInt();
        System.out.println("请输入密码：");
        String password = in.next();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (uid==user.getId() && password.equals(user.getPassword())){
                loginSucceed2();
                break;
            } else if (i+1 ==userList.size()){
                View.pwdException();
                loginFailed();
            }
        }
    }

    //普通用户
    private void loginSucceed1() {
        System.out.println("登录成功!");
        OptionController.option1();
    }

    //管理员
    private void loginSucceed2() {
        System.out.println("登录成功!");
        OptionController.option2();
    }

    private void loginFailed() {
        View.welcome();
        int option = in.nextInt();
        if (option == 1){
            login1();
        }else if (option == 2){
            login2();
        } else if (option == 3) {
            View.bye();
        } else {
            View.exception();
            loginFailed();
        }
    }
}
