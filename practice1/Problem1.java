package practice1;

public class Problem1 {

    public static void main(String[] args) {
        String myName = "Meiirzhan";
        PrintMyName(myName);
    }

    public static void PrintMyName(String myName){
        for(int i = 0; i < 3; ++i){
            if(i == 0 || i == 2){
                if(i == 2){
                    System.out.println();
                }
                for(int j = 0; j < myName.length() + 2; j++){
                    if(j == 0 || j == myName.length() + 1){
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            else {
                System.out.println();
                System.out.print("|" + myName + "|");
            }
        }
    }

}
