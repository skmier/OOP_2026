package lab1.Problem5;

public class DragonLunchTest {
    public static void main(String[] args) {
        DragonLunch d1 = new DragonLunch();
        String line = "BBGG";
        for(int i = 0; i < line.length(); i++){
            Person p = new Person();
            if(line.charAt(i) == 'B'){
                p.setGender(Gender.BOY);
            } else {
                p.setGender(Gender.GIRL);
            }
            d1.kidnap(p);
        }


        if(d1.willDragonEatOrNot()){
            System.out.println("Will eat");
        } else {
            System.out.println("Wont eat");
        }
    }
}
