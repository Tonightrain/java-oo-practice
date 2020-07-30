package com.twu;

import com.twu.DataBase.VirData;
import com.twu.service.LoginService;
import com.twu.view.View;

public class Main {

    public static void main(String[] args) {
        VirData.user();
        VirData.hotSearch();

        View.welcome();
        LoginService.index();

    }
}
