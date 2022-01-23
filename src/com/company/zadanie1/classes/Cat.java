package com.company.zadanie1.classes;

import java.util.Objects;

public class Cat extends Animal{
    private String voice = "mjał miał";
    private boolean isPurebred;

    public Cat() {
    }

    public boolean isPurebred() {
        return isPurebred;
    }

    public void setPurebred(boolean purebred) {
        isPurebred = purebred;
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
        Cat cat = (Cat) o;
        return isPurebred == cat.isPurebred && Objects.equals(voice, cat.voice);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "realm='" + super.getRealm() + '\'' +
                ", genre='" + super.getGenre() + '\'' +
                ", voice='" + voice + '\'' +
                ", isPurebred=" + isPurebred +
                '}';
    }
}
