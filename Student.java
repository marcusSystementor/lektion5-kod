public class Student {
   
   //Instansvariabler längst upp.
    private String firstName;
    private String lastName;
    private int birthYear;

    // Sedan kommer konstruktorn
    // Konstruktor med tre parametrar
    public Student(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // Default konstruktor
    public Student() {

    }
    // Konstruktor med en parameter
    public Student(int birthYear) {
        this.birthYear = birthYear;
    }

    // Metod för att räkna ut ålder, returnerar en int.
    public int getAge (int currentYear) {
        return currentYear - this.birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
 }