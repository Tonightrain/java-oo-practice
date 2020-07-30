package com.twu.controller;

import com.twu.service.LoginService;
import com.twu.service.OptionService;
import com.twu.view.View;

import java.util.Scanner;

public class OptionController {
    private static Scanner in = new Scanner(System.in);

    public static void option1(){
        OptionService optionService = new OptionService();
        View.choose1();
        int optionNum = in.nextInt();
        switch (optionNum){
            case 1:
                optionService.queryHotSearch1();
                break;
            case 2:
                optionService.addHotSearch1();
                break;
            case 3:
                optionService.voteHotSearch();
                break;
            case 4:
                optionService.buyHotSearch();
                break;
            case 5:
                View.bye();
                View.welcome();
                LoginService.index();
                break;
            default:
                View.exception();
                option1();
        }
    }

    public static void option2(){
        OptionService optionService = new OptionService();
        View.choose2();
        int optionNum = in.nextInt();
        switch (optionNum){
            case 1:
                optionService.queryHotSearch2();
                break;
            case 2:
                optionService.addHotSearch2();
                break;
            case 3:
                optionService.addSuperHotSearch();
                break;
            case 4:
                View.bye();
                View.welcome();
                LoginService.index();
                break;
            default:
                View.exception();
                option2();
        }
    }
}
