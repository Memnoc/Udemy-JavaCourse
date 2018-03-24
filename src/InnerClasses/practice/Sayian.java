package InnerClasses.practice;

import java.util.ArrayList;

public class Sayian {
    private ArrayList<Transformation> transformations;
    private String name;
    private String currentStatus = "Base form";
    private int currentLevel;
    private int newLevel = 0;

    public Sayian(String name, String currentStatus, int currentLevel) {
        this.transformations = new ArrayList<Transformation>();
        this.name = name;
        this.currentStatus = currentStatus;
        this.currentLevel = currentLevel;
        this.newLevel = newLevel;
    }

    public String getName() {
        return name;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getNewLevel() {
        return newLevel;
    }

    public void formType(String name, int level) {
        if (level >0) {
            this.transformations.add(new Transformation(name, level));
        }
    }

    public void powerUpLevel(String newForm, int newFormLevel, int newPowerLevel) {
        this.transformations.add(new Transformation(newForm, newFormLevel));
            this.currentStatus = newForm;
            this.currentLevel = newFormLevel;
            this.newLevel = newPowerLevel;

            int powerUpgrade = this.newLevel += newPowerLevel;
            System.out.println(this.getName() + " is powering up to " + newForm + " " + newFormLevel);
    }

    private class Transformation {
        private String transformationName;
        private int transformationPowerLevel;

        public Transformation(String transformationName, int transformationPowerLevel) {
            this.transformationName = transformationName;
            this.transformationPowerLevel = transformationPowerLevel;
        }

        public String getTransformationName() {
            return transformationName;
        }

        public int getTransformationPowerLevel() {
            return transformationPowerLevel;
        }

        public void powerUp (String name, String transformation, int level) {
            this.transformationName = transformation;
            this.transformationPowerLevel = level;
            System.out.println(name + " is turning into " + transformation + " " + level);

        }
    }
}
