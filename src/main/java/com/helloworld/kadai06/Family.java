package com.helloworld.kadai06;

import java.util.List;

public class Family {
    private final String familyname;
    private final List<ONEOKROCK> firstsonList;
    private final List<MYFIRSTSTORY> secondsonList;

    public Family(String familyname, List<ONEOKROCK> firstsonList, List<MYFIRSTSTORY> secondsonList) {
        this.familyname = familyname;
        this.firstsonList = firstsonList;
        this.secondsonList = secondsonList;
    }

    public String getFamilyname() {
        return familyname;
    }

    public List<ONEOKROCK> getFirstsonList() {
        return firstsonList;
    }

    public List<MYFIRSTSTORY> getSecondsonList() {
        return secondsonList;
    }
}