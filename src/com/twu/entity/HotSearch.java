package com.twu.entity;

public class HotSearch implements Comparable<HotSearch> {
    private String content; //热搜内容
    private int heat; //热度（票数）
    private int isSuper; //是否超级热搜 1为普通热搜 2为超级热搜

    public HotSearch(String content, int heat, int isSuper){
        this.content = content;
        this.heat = heat;
        this.isSuper = isSuper;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(int isSuper) {
        this.isSuper = isSuper;
    }

    @Override
    public String toString(){
        return content + "\t\t\t\t" + heat;
    }

    @Override
    public int compareTo(HotSearch o) {
        if (this.heat>=o.getHeat()){
            return 1;
        }
        return -1;
    }
}
