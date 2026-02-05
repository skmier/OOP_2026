package practice2;

public class StarTriangle {
    private int width;

    StarTriangle(int width){
        this.width = width;
    }

    @Override
    public String toString(){
        String star = "";
        for (int i = 0; i <= width; ++i){
            for(int j = 0; j < i; ++j){
               star += "[*]";
            }
            star += "\n";
        }
        return star;
    }


}
