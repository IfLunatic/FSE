package org.example.presentation.secondExample;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "Code1");
        System.out.println(master);

        System.out.println("---------------------------------------------------------------");

        Project masterClone = (Project)master.copy();
        System.out.println(masterClone);

        //Не найкращий варіант використання томущо потрібне постіне приведення для типів (Project)

        System.out.println("----------------------------------------------------------------");
        //Тут ми уже реалізували приведення до типу (Project)
        ProjectFactory factory = new ProjectFactory(master);
        Project mC = factory.cloneProject();
        System.out.println(mC);

    }
}
