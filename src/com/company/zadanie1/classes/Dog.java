package com.company.zadanie1.classes;

import java.util.Objects;

public class Dog extends Animal {
    public String voice = "szczek szczek";
    public byte lifeLength;

    public Dog() {
    }

    public byte getLifeLength() {
        return lifeLength;
    }

    public void setLifeLength(byte lifeLength) {
        this.lifeLength = lifeLength;
    }

    @Override
    public void getVoice() {
        System.out.println(voice);
    }

    @Override
    public String getRealm() {
        return super.getRealm();
    }

    @Override
    public void setRealm(String realm) {
        super.setRealm(realm);
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }

    @Override
    public void setGenre(String genre) {
        super.setGenre(genre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return lifeLength == dog.lifeLength && Objects.equals(voice, dog.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voice, lifeLength);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "realm='" + super.getRealm() + '\'' +
                ", genre='" + super.getGenre() + '\'' +
                ", voice='" + voice + '\'' +
                ", lifeLength=" + lifeLength +
                '}';
    }
}
