package lab2.Task5;

public class PhDStudent extends Person{
    private String speciality;

    public PhDStudent(String name, int age, Animal animal, String speciality) {
        super(name, age, animal);
        this.speciality = speciality;
    }
    public PhDStudent(String name, int age,  String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    @Override
    public String getOccupation() {
        return "PhD Student researches in " + speciality;
    }

    @Override
    public void assignPet(Animal pet) {
        if(pet instanceof Dog){
            System.out.println("PhD student cant have a dog");
        }else {
            super.assignPet(pet);
        }
    }
}
