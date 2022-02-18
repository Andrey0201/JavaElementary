package first.lesson;

public class Human {
    private String surName;
    private String name;
    private String patronymic;


    public Human(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }

    public Human(String surName, String name, String patronymic) {
        this(surName, name);
        this.patronymic = patronymic;

    }

    public void getFullName() {
        if (patronymic == null) {
            System.out.println(surName + " " + name);
        } else
            System.out.println(surName + " " + name + " " + patronymic);
    }

    public void getShortName() {
        if (patronymic == null) {
            System.out.println(surName + " " + name.charAt(0) + ".");
        } else
            System.out.println(surName + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".");
    }
}
