/**
 * Pet class (complete comments)
 *
 * @author Mark Grohman
 * @since November 29, 2024
 */
class Pet {
    // keep track of the name, age, weight, type of animal, and breed of the pet
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    // Write a constructor, accessor (get) methods, and a toString method. Use good
    // commenting.

    // Constructors
    public Pet(String initName, int initAge, double initWeight, String initType) {
        // D.R.Y. - leverage existing full constructor bypassing empty string for missing breed.
        this(initName, initAge, initWeight, initType, "");
    }

    public Pet(String initName, int initAge, double initWeight, String initType, String initBreed) {
        name = initName;
        age = initAge;
        weight = initWeight;
        type = initType;
        breed = initBreed;
    }

    // accessor methods - getters

    /**
     * getName() @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getAge() @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * getWeight() @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * getType() @return type
     */
    public String getType() {
        return type;
    }

    /**
     * getBreed() @return breed
     */
    public String getBreed() {
        return breed;
    }

    public String toString() {
        String val = "Name: " + name + ", Age: " + age + ", Weight: " + weight +
                ", Type: " + type;
        if (!(breed == null || breed.isEmpty()))
          val +=   ", Breed: " + breed;

        return val;
    }
}



