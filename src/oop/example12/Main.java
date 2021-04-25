package oop.example12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        GoodPupil goodPupil12 = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();

        ClassRoom classRoom =
                new ClassRoom(badPupil, goodPupil, goodPupil12, excelentPupil);
        classRoom.showPupilsInfo();

        System.out.println();
    }
}
