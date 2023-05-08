package io.codelex.typesandvariables.practice;

public class TableDisplay {
    public static void main(String[] args) {
        String course1 = "Accounting";
        String course2 = "Art/Design";
        String course3 = "Business Design";
        String course4 = "History";
        String course5 = "Journalism";
        String course6 = "Science";
        String course7 = "Computer Science";
        String course8 = "Physical Education";
        String teacher1 = "Mr. Morgan";
        String teacher2 = "Mr. Van Gogh";
        String teacher3 = "Mr. Jobs";
        String teacher4 = "Mr. Horne";
        String teacher5 = "Mrs. Walters";
        String teacher6 = "Mr. Newton";
        String teacher7 = "Mrs. Hopper";
        String teacher8 = "Ms. Armstrong";

        System.out.println("+------------------------------------------------------------+");
        System.out.printf("| %-2s | %-35s | %-15s |\n", "1", course1, teacher1);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "2", course2, teacher2);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "3", course3, teacher3);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "4", course4, teacher4);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "5", course5, teacher5);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "6", course6, teacher6);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "7", course7, teacher7);
        System.out.printf("| %-2s | %-35s | %-15s |\n", "8", course8, teacher8);
        System.out.println("+------------------------------------------------------------+");
    }
}
