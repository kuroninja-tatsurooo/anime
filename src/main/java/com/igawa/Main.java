package com.igawa;

public class Main {
    public static void main(String[] args) {
        Anime anime1 = new Anime("ドラゴンボール","孫悟空","ベジータ");
        System.out.println("アニメは" + anime1.getName1() );
        System.out.println("主人公は" + anime1.getName2() );
        System.out.println("純サイヤ人は" + anime1.getName2()+"と"+ anime1.getName3() );

        Anime anime2 = new Anime("Slam dunk","桜木花道","流川楓");
        System.out.println("アニメは" + anime2.getName1() );
        System.out.println("主人公は" + anime2.getName2() );
        System.out.println("ライバルは" + anime2.getName3() );

        anime2.setName1("ドラえもん");
        anime2.setName2("ドラえもん");
        anime2.setName3("のび太");
        System.out.println("今の番組は" + anime2.getName1());
        System.out.println("主人公は" + anime2.getName2());
        System.out.println("サブキャラは" + anime2.getName3());
    }
}