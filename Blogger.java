package ru.mirea.lab2;

public class Blogger extends Author {
    private String chanel;

    public Blogger(String name, String email, char gender, String chanel) {
        super(name, email, gender);
        this.chanel = chanel;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "chanel='" + chanel + '\'' +
                '}';
    }
}
