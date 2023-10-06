package Multimedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ClassSelector = 0;
        int originalCounter = 6;
        MMelem[] database = new MMelem[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("************FASE DI CREAZIONE DEGLI ELEMENTI************");
            System.out.println("Seleziona un elemento multimediale da creare");
            System.out.println("digita 1 per creare una foto, 2 per un audio, 3 per un video");
            ClassSelector = Integer.parseInt(input.nextLine());
            switch (ClassSelector) {
                case 1: {
                    System.out.println("************CREAZIONE FOTO************");
                    System.out.println("inserisci un titolo");
                    String imgTitle = input.nextLine();
                    System.out.println("inserisci un valore di luminosita'");
                    int imgLum = Integer.parseInt(input.nextLine());
                    database[i] = new Foto(imgTitle, imgLum);
                    break;
                }
                case 2: {
                    System.out.println("************CREAZIONE AUDIO************");
                    System.out.println("inserisci un titolo");
                    String sndTitle = input.nextLine();
                    System.out.println("inserisci un valore di volume");
                    int sndVol = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci un valore di durata");
                    int sndTime = Integer.parseInt(input.nextLine());
                    database[i] = new Audio(sndTitle, sndVol, sndTime);
                    break;
                }
                case 3: {
                    System.out.println("************CREAZIONE VIDEO************");
                    System.out.println("inserisci un titolo");
                    String vidTitle = input.nextLine();
                    System.out.println("inserisci un valore di volume");
                    int vidVol = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci un valore di durata");
                    int vidTime = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci un valore di luminosita'");
                    int vidLum = Integer.parseInt(input.nextLine());
                    database[i] = new Video(vidTitle, vidVol, vidTime, vidLum);
                    break;
                }
                default: {
                    System.out.println("errore nella scelta");
                    --i;
                    break;
                }
            }
        }
        System.out.println("************FASE DI CONTROLLO************");
        while (originalCounter != 0) {
            System.out.println("seleziona un elemento da 1 a 5, 0 per terminare");
            originalCounter = Integer.parseInt(input.nextLine());
            int counter = --originalCounter;

            if (counter >= 0) {
                if (database[counter] instanceof Foto) {
                    System.out.println("************HAI SELEZIONATO UNA FOTO************");
                    System.out.println("scrivi 1 per mostrare, 2 per luminosita'+, 3 per luminosita'-");
                    int selector = Integer.parseInt(input.nextLine());
                    switch (selector) {
                        case 1:
                            ((Foto) database[counter]).show();
                            break;
                        case 2:
                            ((Foto) database[counter]).aumentaluminosita();
                            break;
                        case 3:
                            ((Foto) database[counter]).diminuisciluminosita();
                            break;
                        default:
                            System.out.println("error");
                            break;
                    }
                } else if (database[counter] instanceof Video) {
                    System.out.println("************HAI SELEZIONATO UN VIDEO************");
                    System.out.println("scrivi 1 per mostrare, 2 per volume+, 3 per volume-");
                    System.out.println(" 4 per luminosita'+, 5 per luminosita'-");
                    int selector = Integer.parseInt(input.nextLine());
                    switch (selector) {
                        case 1:
                            ((Video) database[counter]).play();
                            break;
                        case 2:
                            ((Video) database[counter]).aumentavolume();
                            break;
                        case 3:
                            ((Video) database[counter]).diminuiscivolume();
                            break;
                        case 4:
                            ((Video) database[counter]).aumentaluminosita();
                            break;
                        case 5:
                            ((Video) database[counter]).diminuisciluminosita();
                            break;
                        default:
                            System.out.println("error");
                            break;
                    }
                } else if (database[counter] instanceof Audio) {
                    System.out.println("************HAI SELEZIONATO UN AUDIO************");
                    System.out.println("scrivi 1 per mostrare, 2 per volume+, 3 per volume-");
                    int selector = Integer.parseInt(input.nextLine());
                    switch (selector) {
                        case 1:
                            ((Audio) database[counter]).play();
                            break;
                        case 2:
                            ((Audio) database[counter]).aumentavolume();
                            break;
                        case 3:
                            ((Audio) database[counter]).diminuiscivolume();
                            break;
                        default:
                            System.out.println("error");
                            break;
                    }
                }
            }
            // esci
        }
    }
}