package com.company;

public class Farm {
    private String address;
    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horse;
    private String ownerName;

    public Farm(String address, Cow[] cows, Sheep[] sheep, Horse[] horse, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horse = horse;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void info() {
        System.out.println(getAddress() + " " + getOwnerName());


        for (Animal result: getCows()) {
            result.method();
        }

        for (Animal result: getSheep()) {
            result.method();
        }

        for (Horse result: getHorse()) {
            result.method();
        }
    }
}
