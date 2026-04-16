public class NewArray {

    private int[] ar;
    private int level;

    public NewArray(int[] inp){
        ar = inp;
        level = ar.length;
    }

    public void add(int x){
        if (ar.length <= level){
            int[] tempar = new int[newLength(level)]; //Big O
            for (int i = 0 ; i < ar.length ; i++){
                tempar[i] = ar[i];
            }
            ar = tempar;
        }
        ar[level] = x;
        level++;
    }

    private int newLength(int l){
        return 2*l;
    }

    public String toString(){
        String out = "";
        for (int i = 0; i < ar.length ; i++){
            out += "" + ar[i];
        }
        return out;
    }
}
