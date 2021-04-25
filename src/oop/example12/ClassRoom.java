package oop.example12;

public class ClassRoom {
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public void showPupilsInfo(){
        if (pupil1!= null)
            showPupil(pupil1, 1);

        if (pupil2 != null)
            showPupil(pupil2, 2);

        if (pupil3 != null)
            showPupil(pupil3, 3);

        if (pupil4 != null)
            showPupil(pupil4, 4);
    }

    public void showPupil(Pupil pupil, int num){
        System.out.println("Информация о ученике " + num + ":");
        pupil.read();
        pupil.write();
        pupil.study();
        pupil.relax();
    }


}
