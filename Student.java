public class Student {

    // instance variables
    private String name, race;
    private int gradeLevel;
    // private grades[];
    // private extracurriculars[];

    // default variables
    public static final String DEF_NAME = "JOHN DOE", DEF_RACE = "CAUCASIAN";
    public static final int DEF_GRADELEVEL = 12;

    // Most common single races found in schools
    // Source: https://nces.ed.gov/programs/coe/pdf/2024/cge_508c.pdf
    public static final String[] raceList = { "White", "Hispanic", "Black", "Asian", "American Indian/Alaska Native",
            "Pacific Islander" };

    // Constructors
    public Student() {

    }

    public Student(String name, String race, int gradeLevel) {

    }

    public Student(Student o) {

    }

    // Setters
    public boolean setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRace(String race) {
        if (Student.isInArray(raceList, race)) {
            this.race = race;
            return true;
        } else {
            return false;
        }
    }

    public boolean setGradeLevel(int gradeLevel) {
        if (gradeLevel <= 12 && gradeLevel >= 9) {
            this.gradeLevel = gradeLevel;
            return true;
        } else {
            return false;
        }
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }

    // Equals & toString & other methods
    public String toString() {
        return "";
    }

    public boolean equals(Object o) {
        return false;
    }

    public static boolean isInArray(String[] values, String value) {
        if (values == null || value == null) {
            return false;
        }
        int location = 0;
        boolean isPresent = false;

        while (!isPresent && location < values.length) {
            isPresent = values[location].equals(value);
            location++;
        }

        return isPresent;
    }

}
