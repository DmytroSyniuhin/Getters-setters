public class Account {
    private static final int YEAR = 2020;

    // Незмінні
    private String name;

    public String getName() {
        return name;
    }

    private int dOBDay;

    public int getdOBDay() {
        return dOBDay;
    }

    private int dOBMonth;

    public int getdOBMonth() {
        return dOBMonth;
    }

    private int dOBYear;

    public int getdOBYear() {
        return dOBYear;
    }

    private String eMAIL;

    public String geteMAIL() {
        return eMAIL;
    }

    private String phone;

    public String getPhone() {
        return phone;
    }

    // Змінювані
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private int pressure;

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    private int steps;

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Account(String name, int dOBDay, int dOBMonth, int dOBYear, String eMAIL, String phone, String surname, double weight, int pressure, int steps) {
        this.name = name;
        this.dOBDay = dOBDay;
        this.dOBMonth = dOBMonth;
        this.dOBYear = dOBYear;
        this.eMAIL = eMAIL;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = YEAR - getdOBYear();
    }

    private int age = this.age;

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.printf("Ім'я та прізвище: %s %s, Дата народження: %d/%d/%d, Електронна пошта: %s, Номер телефону: %s, Вага: %.1f kg, Кількість шагів: %d, Тиск: %d, Вік: %d", name, surname, dOBDay, dOBMonth, dOBYear, eMAIL, phone, weight, steps, pressure, age);
    }
}
