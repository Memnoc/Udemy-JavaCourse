package SetandHashSet.challenge;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // adding final to avoid the method being overwritten
    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Dog){
            String objName = ((Dog)obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}