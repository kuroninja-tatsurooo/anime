package com.igawa;

public class Anime {
    //    field
//    タイトル
    private String title;
    //    主人公の名前
    private String mainCharacterName;
    //    サブキャラの名前
    private String subCharacterName;

    //    constructor コンストラクタ
    public Anime(String title, String mainCharacterName, String subCharacterName) {
        this.title = title;
        this.mainCharacterName = mainCharacterName;
        this.subCharacterName = subCharacterName;
    }

    public Anime() {

    }

    // getter
    public String getName1() {

        return title;
    }

    public String getName2() {
        return mainCharacterName;
    }

    public String getName3() {
        return subCharacterName;
    }

    //    引数input
    public void setName1(String title) {
        this.title = title;
    }

    public void setName2(String mainCharacterName) {
        this.mainCharacterName = mainCharacterName;
    }

    public void setName3(String subCharacterName) {
        this.subCharacterName = subCharacterName;
    }
}