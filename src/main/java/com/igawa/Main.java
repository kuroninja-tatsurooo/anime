package com.igawa;

public class Main {
    public static void main(String[] args) {
        Anime anime1 = new Anime ( "Dragon Ball", "Son Goku", "Vegeta" );
        String name1[] = {anime1.getTitle (), anime1.getMainCharacterName (), anime1.getSubCharacterName ()};
        for (String str : name1) {
            if (anime1.getTitle ().equals ( "Dragon Ball" )) {
                System.out.println ( "Anime title is" + anime1.getTitle () );
                System.out.println ( anime1.getTitle () + "main character is " + anime1.getMainCharacterName () );
                System.out.println ( anime1.getMainCharacterName () + "'s raival is " + anime1.getSubCharacterName () );
            } else {
                System.out.println ( "Not related to" + anime1.getTitle () );
            }
            break;
        }
        Anime anime2 = new Anime ( "Slam dunk", "Hanamichi Sakuragi", "Kaede Rukawa" );
        String name2[] = {anime2.getTitle (), anime2.getMainCharacterName (), anime2.getSubCharacterName ()};
        for (String str : name2) {
            if (anime2.getTitle ().equals ( "Slam dunk" )) {
                System.out.println ( "Anime title is" + anime2.getTitle () );
                System.out.println ( anime2.getTitle () + "main character is " + anime2.getMainCharacterName () );
                System.out.println ( anime2.getMainCharacterName () + "'s raival is " + anime2.getSubCharacterName () );
            } else {
                System.out.println ( "Not related to" + anime2.getTitle () );
            }
            break;
        }
// slam dunk successor program
        anime2.setTitle ( "Doraemon" );
        anime2.setMainCharacterName ( "Doraemon" );
        anime2.setSubCharacterName ( "Nobita" );

        System.out.println ( "slam dunk successor program is " + anime2.getTitle () );
        System.out.println ( "Main character is " + anime2.getMainCharacterName () );
        System.out.println ( anime2.getMainCharacterName () + " is from the future for " + anime2.getSubCharacterName () );
    }
}