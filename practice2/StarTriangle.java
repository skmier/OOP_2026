package practice2;

public class StarTriangle {
    private int width;

    StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        StringBuilder star = new StringBuilder();
        for (int i = 0; i <= width; ++i){
            for(int j = 0; j < i; ++j){
                star.append("[*]");
            }
            star.append("\n");
        }
        return star.toString();
    }


}
