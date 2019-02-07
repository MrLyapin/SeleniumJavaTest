package ru.tester.newbe;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Chronometer {

    private static String soundPath = "/media/umba/Storage/voice/";
    private static String numb = (soundPath + "3_2_1.wav");
    private static String go = (soundPath + "go.wav");
    private static String start = (soundPath + "start.wav");
    private static String wait = (soundPath + "wait.wav");
    private static String end = (soundPath + "the_end.wav");

    private static int force = 4000; // ms (2 минуты 120000)
    private static int relax = 1000; // ms (1 минута 60000)

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start trening script:");


        for (int i = 1; i < 7; i++ ) {
            playSound(numb);
            playSound(start);
            System.out.println("Force: " + i);
            Thread.sleep(force);
            playSound(numb);
            playSound(wait);
            System.out.println("Relax: " + i);
            Thread.sleep(relax);
        }
        playSound(numb);
        playSound(start);
        System.out.println("Force: 7");
        Thread.sleep(force);
        playSound(numb);
        playSound(end);
        System.out.println("The end");

   }


    public static void playSound(String file) {
        try {
            File soundFile = new File(file); //Звуковой файл

            //Получаем AudioInputStream
            //Вот тут могут полететь IOException и UnsupportedAudioFileException
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            //Получаем реализацию интерфейса Clip
            //Может выкинуть LineUnavailableException
            Clip clip = AudioSystem.getClip();

            //Загружаем наш звуковой поток в Clip
            //Может выкинуть IOException и LineUnavailableException
            clip.open(ais);

            clip.setFramePosition(0); //устанавливаем указатель на старт
            clip.start(); //Поехали!!!

            //Если не запущено других потоков, то стоит подождать, пока клип не закончится
            //В GUI-приложениях следующие 3 строчки не понадобятся
           Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop(); //Останавливаем
            clip.close(); //Закрываем
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }



}

