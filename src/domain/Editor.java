package domain;

/**
 * Представляє редактора, який є видавцем і має навички художника.
 */
public class Editor extends Artist {

    /**
     * Конструює редактора з вказаними параметрами електронного редагування, навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skills            навички редактора
     * @param name              ім'я редактора
     * @param jobTitle          посада редактора
     * @param level             рівень редактора
     * @param dept              відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструює редактора з вказаними параметрами електронного редагування та навичками.
     *
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skills            навички редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструює редактора з вказаним параметром електронного редагування.
     *
     * @param electronicEditing чи використовує редактор електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструює редактора зі значеннями за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора, включаючи базову інформацію та вподобання редагування.
     *
     * @return рядкове представлення редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nПараметри редагування: "; 
        if (electronicEditing)
            s = s + "електронне";
        else
            s = s + "папірне";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає вподобання редактора щодо редагування.
     *
     * @return true, якщо редактор використовує електронне редагування, в іншому випадку - false
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює вподобання редактора щодо редагування.
     *
     * @param electronic чи використовує редактор електронне редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
