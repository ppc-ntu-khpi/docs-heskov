package domain;

/**
 * Представляє художника, який є працівником компанії.
 */
public class Artist extends Employee {

    /**
     * Конструює художника з вказаними навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skills   навички художника
     * @param name     ім'я художника
     * @param jobTitle посада художника
     * @param level    рівень художника
     * @param dept     відділ художника
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструює художника з вказаними навичками.
     *
     * @param skills навички художника
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Конструює художника зі значеннями за замовчуванням.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення художника, включаючи базову інформацію та навички.
     *
     * @return рядкове представлення художника
     */
    @Override
    public String toString() {
        return super.toString() + "\nНавички: " + getSkills();
    }

    private String[] skills;

    /**
     * Отримує навички художника.
     *
     * @return навички художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     *
     * @param skills навички художника
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Отримує навички художника у вигляді списку.
     *
     * @return навички художника у вигляді списку
     */
    public String[] getSkillsList() {
        return skills;
    }
}
