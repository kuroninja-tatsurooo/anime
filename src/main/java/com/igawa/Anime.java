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
    public String getTitle() {

        return title;
    }

    public String getMainCharacterName() {
        return mainCharacterName;
    }

    public String getSubCharacterName() {
        return subCharacterName;
    }

    //    引数input
    public void setTitle(String title) {
        this.title = title;
    }

    public void setMainCharacterName(String mainCharacterName) {
        this.mainCharacterName = mainCharacterName;
    }

    public void setSubCharacterName(String subCharacterName) {
        this.subCharacterName = subCharacterName;
    }
}