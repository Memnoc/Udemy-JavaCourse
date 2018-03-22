package Interfaces.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable {

    private String type;
    private String race;
    private String power;

    private int age;
    private int strength;

    public Monsters(String type, String race, String power, int age, int strength) {
        this.type = type;
        this.race = race;
        this.power = power;
        this.age = age;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "type='" + type + '\'' +
                ", race='" + race + '\'' +
                ", power='" + power + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> monsterValues = new ArrayList<String>();
        monsterValues.add(0, this.type);
        monsterValues.add(1, this.power);
        monsterValues.add(2, this.race);
        monsterValues.add(3, "" + this.strength);
        monsterValues.add(4, "" + this.age);
        return monsterValues;
    }

    @Override
    public void read (List<String> savedValues) {
        if (savedValues != null && savedValues.size() >0){
            this.type = savedValues.get(0);
            this.race = savedValues.get(1);
            this.power = savedValues.get(2);
            this.strength = Integer.parseInt(savedValues.get(3));
            this.age = Integer.parseInt(savedValues.get(4));

        }
    }
}
