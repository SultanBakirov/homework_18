package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(25,3,"m","musa");
        Cow cow2 = new Cow(25,3,"m","musa");
        Cow cow3 = new Cow(25,3,"m","musa");
        Cow cow4 = new Cow(25,3,"m","musa");
        Cow cow5 = new Cow(25,3,"m","musa");
        Cow cow6 = new Cow(25,3,"m","musa");
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cow = {cow6};
        Sheep sheep1 = new Sheep(30,3,"j","lula");
        Sheep sheep2 = new Sheep(30,3,"j","lula");
        Sheep sheep3 = new Sheep(30,3,"j","lula");
        Sheep sheep4 = new Sheep(30,3,"j","lula");
        Sheep[] sheeps = {sheep1, sheep2, sheep3};
        Sheep[] sheep = {sheep4};
        Horse horse1 = new Horse(75,5,"m","Shumkar","black");
        Horse horse2 = new Horse(75,5,"m","Shumkar","black");
        Horse horse3 = new Horse(75,5,"m","Shumkar","black");
        Horse[] horses = {horse1, horse2};
        Horse[] horse = {horse3};

        Farm farm = new Farm("Bishkek", cows, sheeps, horses,"Baibol");
        Farm farm1 = new Farm("Osh", cow, sheep, horse, "Sultan");

        farm.info();
        farm1.info();

    }
}
