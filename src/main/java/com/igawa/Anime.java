package com.igawa;

public class Anime {
//    field
    private String name1;
    private String name2;
    private String name3;

//    constructor コンストラクタ
    public Anime(String name1,String name2,String name3){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }
// getter
//    基本的にpublic
    public String getName1() {
        return name1;
    }
    public String getName2() {
        return name2;
    }
    public String getName3(){
        return name3;
    }
//    引数　input
    public void setName1(String newname1)
    {
        this.name1 = newname1;
    }
    public void setName2(String newname2)
    {
        this.name2 = newname2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }
}