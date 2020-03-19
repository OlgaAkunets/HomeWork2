package com.company;

public class Color {
    private int RED = 1;
    private int ORANGE = 2;
    private int YELLOW = 3;
    private int GREEN = 4;
    private int BLUE = 5;
    private int DARK_BLUE = 6;
    private int PURPLE = 7;
    public int number;
    public Color (int colorNumber){
        this.number=colorNumber;

    }
    public int getNumber(){
        return this.number;
    }
    public String getName(){
        switch (number){
            case 1:
                return "Красный";
            case 2:
                return "Оранжевый";
            case 3:
                return "Жёлтый";
            case 4:
                return "Зелёный";
            case 5:
                return "Голубой";
            case 6:
                return "Синий";
            case 7:
                return "Фиолетовый";
            default:
                return "Нeизвестный";
        }
    }


}
