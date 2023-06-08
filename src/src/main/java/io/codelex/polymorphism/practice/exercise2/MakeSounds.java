package io.codelex.polymorphism.practice.exercise2;

public class MakeSounds {
    public static void main(String[] args) {
        Sound[] sounds = {new Firework(), new Parrot(), new Radio()};

        for (Sound sound : sounds) {
            sound.playSound();
        }
    }
}