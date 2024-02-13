package com.igawa;

public class Main {
    public static void main(String[] args) {
        Anime anime1 = new Anime ( "ドラゴンボール", "孫悟空", "ベジータ" );
        String name1[] = {anime1.getName1 (), anime1.getName2 (), anime1.getName3 ()};
        for (String str : name1) {
            if (anime1.getName1 ().equals ( "ドラゴンボール" )) {
                System.out.println ( "アニメタイトルは" + anime1.getName1 () + "です" );
                System.out.println ( anime1.getName1 () + "のメインキャラクターは" + anime1.getName2 () + "です" );
                System.out.println ( anime1.getName2 () + "のライバルは" + anime1.getName3 () + "です" );
            } else {
                System.out.println ( anime1.getName1 () + "とは関係ありません" );
            }
            break;
        }
        Anime anime2 = new Anime ( "Slam dunk", "桜木花道", "流川楓" );
        String name2[] = {anime2.getName1 (), anime2.getName2 (), anime2.getName3 ()};
        for (String str : name2) {
            if (anime2.getName1 ().equals ( "Slam dunk" )) {
                System.out.println ( "アニメタイトルは" + anime2.getName1 () + "です" );
                System.out.println ( anime2.getName1 () + "のメインキャラクターは" + anime2.getName2 () + "です" );
                System.out.println ( anime2.getName2 () + "のライバルは" + anime2.getName3 () + "です" );
            } else {
                System.out.println ( anime2.getName1 () + "ではありません" );
            }
            break;
        }
// スラムダンクの後継番組
        anime2.setName1 ( "ドラえもん" );
        anime2.setName2 ( "ドラえもん" );
        anime2.setName3 ( "のび太" );

        System.out.println ( "slam dunkの後継番組は" + anime2.getName1 () + "です" );
        System.out.println ( "主人公は" + anime2.getName2 () + "です" );
        System.out.println ( anime2.getName2 () + "は" + anime2.getName3 () + "のために未来から来ました" );
    }
}